package Models_Javabeans;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author p1623107
 */
public class PanierDAO extends DAO_AccessDB{
    
    public PanierDAO(String newUrl, String newUser, String newMdp) {
        super(newUrl, newUser, newMdp);
    }
    
    /**
     * Ajoute une ligne à la table panier
     * @param stmt La statement
     * @param idPanier
     * @param idClient
     * @param idProduit
     * @param prix
     * @throws SQLException 
     */
    public void addProduit(Statement stmt,int idPanier, int idClient,int idProduit, int prix) throws SQLException{
        idPanier = idPanier(stmt);
        int result = stmt.executeUpdate("INSERT INTO Panier(idPanier,idClient, idProduit, prix) VALUES ("+idPanier+","+idClient+","+idProduit+","+prix+")");
        
    }
    
    /**
     * Fonction de sécurité en cas de non auto-implement
     * @param stmt La statement
     * @return Le numéro du panier auto incrémenté de 1 en int
     * @throws SQLException 
     */
    public int idPanier(Statement stmt) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT max(idPanier) AS idPanier FROM Panier");
        String numString = null;
        int idPanier;
        while(result.next()){
            numString = result.getString("idPanier");
        }
        //Si la table est vide on met 0
        if(numString == null){
            idPanier = 0;
        }
        else{
            //On passe le String en Int
            idPanier = Integer.decode(numString);
        }
        return idPanier;
    }
    
    /**
     * Renvoie les numéros de produits correspondant au panier dans un tableau, vide si le panier est vide
     * @param stmt La Statement
     * @param idClient
     * @param idPanier
     * @return Un tableau contenant les numéros des produits contenus dans le panier
     * @throws SQLException 
     */
    public int[] getidProduit(Statement stmt,int idClient,int idPanier) throws SQLException{
        ResultSet resultLigne = stmt.executeQuery("SELECT count(idProduit) AS nbLignes FROM Panier WHERE idClient="+idClient+" AND idPanier="+idPanier);
        int nbLignes = 0;
        while(resultLigne.next()){
            nbLignes = resultLigne.getInt("nbLignes");
        }
        ResultSet result = stmt.executeQuery("SELECT idProduit FROM Panier WHERE idClient="+idClient+" AND idPanier="+idPanier);
        int i=0;
        int tab[] = new int[nbLignes];
        while(result.next()){
            tab[i]=result.getInt("idProduit");
            i++;
        }
        return tab;
    }
    
    
    
    /**
     * Renvoie le montant du panier correspondant aux ID passés en paramètres
     * @param stmt La statement
     * @param idClient
     * @param idPanier
     * @return Le montant total du panier
     * @throws SQLException 
     */
    public int prixTotalPanier(Statement stmt,int idClient,int idPanier) throws SQLException{
        int total = 0;
        ResultSet resutl = stmt.executeQuery("SELECT prix FROM Panier WHERE idClient="+idClient+" AND idPanier="+idPanier);
        while(resutl.next()){
            int tempo = resutl.getInt("prix");
            total = total + tempo;
        }
        return total;
    }
 
}
