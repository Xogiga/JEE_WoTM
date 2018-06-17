package Models_Javabeans;


import Models_Javabeans.DAO_AccessDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommandeDAO extends DAO_AccessDB{

    public CommandeDAO(String newUrl, String newUser, String newMdp) {
        super(newUrl, newUser, newMdp);
    }
    
    /**
     * Crée une nouvelle commande
     * @param stmt La statement
     * @param nomClient
     * @param prix
     * @param date date de la prise de commande
     * @param avancement Avancement de la commande
     * @param dateLivraison
     * @throws SQLException 
     */
    public void insertCommande(Statement stmt, String nomClient, int idPanier, int prix, String date, String avancement, String dateLivraison) throws SQLException{
        int result = stmt.executeUpdate("INSERT INTO Commande(NomClient,idPanier,prix,avancement,datecommande,dateDeLivraison) Values ('"+nomClient+"',"+idPanier+","+prix+",'"+avancement+"','"+date+"','"+dateLivraison+"')");
    }
    
    /**
     * Renvoie toutes les commandes d'un client correspondat à idClient (ATTENTION pas d'autres infos que les id des Commandes)
     * @param stmt La statement
     * @param idClient
     * @return Tableau contenant les idCmd du client si il y en a, rien sinon
     * @throws SQLException 
     */
    public int[] getidCmd(Statement stmt,int idClient)throws SQLException{
        int nbLignes = 0;
        ResultSet resultLignes = stmt.executeQuery("SELECT count(idCmd) AS nbLignes FROM Commande WHERE idClient="+idClient);
        while(resultLignes.next()){
            nbLignes = resultLignes.getInt("nbLignes");
        }
        int tabCmd[];
        if (nbLignes == 0){
            tabCmd=null;
        }
        else{
            int i=0;
            tabCmd= new int[nbLignes];
            ResultSet Result = stmt.executeQuery("SELECT idCmd FROM Commande WHERE idClient="+idClient);
            while(Result.next()){
                tabCmd[i] = Result.getInt("idCmd");
                i++;
            }
        }
        return tabCmd;
    }
    
    /**
     * Renvoie le idéro du panier correspondant au idéro de la commande passée en paramètre
     * @param stmt La statement
     * @param idCmd
     * @return Le idéro du panier correspondant
     * @throws SQLException 
     */
    public int getidPanier(Statement stmt,int idCmd) throws SQLException {
        ResultSet result = stmt.executeQuery("SELECT idPanier FROM Commande WHERE idCmd ="+idCmd);
        int idPanier=0;
        while(result.next()){
            idPanier = result.getInt("idPanier");
        }
        return idPanier;
    }
    
    
    /**
     * Renvoie le prix d'une commande (-1 si il n'y a pas de commande correspondante)
     * @param stmt La statement
     * @param idCmd
     * @return Le prix de la commande
     * @throws SQLException 
     */
    public int getPrix(Statement stmt,int idCmd) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT prix FROM Commande WHERE idCmd ="+idCmd);
        int prix=-1;
        while(result.next()){
            prix = result.getInt("prix");
        }
        return prix;
    }
    
    /**
     * Renvoie l'avancement de la commande correspondant à l'id passé en paramètre(Ex: 'Preparation', 'Expédié', 'Recu')
     * @param stmt La statement
     * @param idCmd
     * @return L'avancement du traitement de la commande
     * @throws SQLException 
     */
    public String getAvancement(Statement stmt,int idCmd) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT avancement FROM Commande WHERE idCmd ="+idCmd);
        String avancement=null;
        while(result.next()){
            avancement = result.getString("dateCommande");
        }
        return avancement;
    }
    
    /**
     * Renvoie la date de la commande correspondant 
     * @param stmt La statement
     * @param idCmd
     * @return la date de la commande
     * @throws SQLException 
     */
    public String getdateCommande(Statement stmt,int idCmd) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT dateCommande FROM Commande WHERE idCmd ="+idCmd);
        String date=null;
        while(result.next()){
            date = result.getString("dateCommande");
        }
        return date;
    }
    
    /**
     * Renvoie la date de livraison prévue ou effective correspondant à l'id passé en paramètre
     * @param stmt
     * @param idCmd
     * @return La date de livraison sous format String
     * @throws SQLException 
     */
    public String getdateLivraison(Statement stmt,int idCmd) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT dateLivraison FROM Commande WHERE idCmd ="+idCmd);
        String date=null;
        while(result.next()){
            date = result.getString("dateDeLivraison");
        }
        return date;
    }
            
}
