package Models_Javabeans;

import Models_Javabeans.DAO_AccessDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDAO extends DAO_AccessDB{
    
    public ClientDAO(String newUrl, String newUser, String newMdp) {
        super(newUrl, newUser, newMdp);
    }
    
    
    /**
     * 
     * @param stmt la Statement
     * @param username le nom d'utilisateur passé en paramètre
     * @param pwd le mot de passe utilisateur passé en paramètre
     * @return le idéro du client connecté
     * @throws SQLException 
     */
    public int getidClient(Statement stmt, String username, String pwd) throws SQLException{
        int idClient=-1;
        ResultSet Result = stmt.executeQuery("SELECT idClient FROM Client where Identifiant ="+username+" AND password ="+pwd);
        while(Result.next()){
            idClient = Result.getInt("idClient");
        }
        return idClient;
    }
    
    /**
     * 
     * @param stmt la Statement
     * @param idClient leidéro client passé en paramètre
     * @return Récupère le Username correspondant au numéro client passé en paramètre
     * @throws SQLException 
     */
    public String getIdentifiant(Statement stmt, int idClient) throws SQLException{
        String Nom = null;
        ResultSet result = stmt.executeQuery("SELECT Identifiant FROM Client WHERE idClient ="+idClient);
        while(result.next()){
            Nom = result.getString("Identifiant");
        }
        return Nom;
    }
    
    
    /**
     * 
     * @param stmt la Statement
     * @param username le nom d'utilisateur passé en paramètre
     * @param pwd le mot de passe utilisateur passé en paramètre
     * @return le résultat de la requête: "Utilisateur créé" si valide sinon "Identifiant déjà existant"
     * @throws SQLException 
     */
    public static String creerCompte(Statement stmt,String username,String pwd) throws SQLException{
        String valide;
        int nbLigne = 0;
        //Verfication de la disponibilité de l'identifiant
        ResultSet resultLogin = stmt.executeQuery("SELECT count(*) AS nblignes FROM Client WHERE categorie != 'ResponsableHebergement' AND username = '"+ username+"'");
        while (resultLogin.next()){
            nbLigne = resultLogin.getInt("nblignes");
        }
        //si 1 --> ligne renvoyée donc Identifiant existant
        if (nbLigne == 1){
            valide = "Identifiant déjà existant";
        }
        //si 0 --> pas de doublon
        else {
            int result = stmt.executeUpdate("INSERT into Client (Identifiant, password) VALUES ('"+username+"','"+pwd+"')");
            valide = "Utilisateur créé";
            }
        return valide;        
    }
    
    
    /**
     * 
     * @param stmt La statement jdbc
     * @param username le nom d'utilisateur passé en paramètre
     * @param pwd le mot de passe utilisateur passé en paramètre
     * @return String "Connexion validée" si les identifiants sont bons, l'valide correspondante sinon
     * @throws SQLException 
     */
    public String nbLigneConnexion(Statement stmt,String username,String pwd) throws SQLException{
        int nbLigne = 0;
        String valide;       
        ResultSet resultLogin = stmt.executeQuery("SELECT count(*) AS nblignes FROM Client WHERE categorie != 'ResponsableHebergement' AND username = '"+username+"'");
        while(resultLogin.next()){
            nbLigne = resultLogin.getInt(1);
        }
        //si 1 --> le nom d'utilisateur existe
        if (nbLigne == 1) {   
            ResultSet resultMdp = stmt.executeQuery("SELECT count(*) AS nblignes FROM Client WHERE categorie != 'ResponsableHebergement' AND username = '"+ username+"' AND password ='"+ pwd+"'");
            int nbLigne2 = 0;
            while(resultMdp.next()){
                nbLigne2 = resultMdp.getInt(1);
            }
            //si 1 --> Mot de passe et utilisateur existant
            if(nbLigne2 == 1){
                valide = "Connexion validée";
            }
            //si 0 --> Mauvais mot de passe
            else{
                valide = "Le mot de passe n'est pas bon";
            }  
        }   
        //si 0 --> Nom d'utilisateur inexistant
        else{
            valide = "Le nom d'utilisateur n'existe pas";
        }
        return valide;
    }  
}
