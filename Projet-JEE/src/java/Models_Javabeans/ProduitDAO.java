package Models_Javabeans;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author p1623107
 */
public class ProduitDAO extends DAO_AccessDB{
    
    public ProduitDAO(String newUrl, String newUser, String newMdp) {
        super(newUrl, newUser, newMdp);
    }
    public ProduitDAO(){
        
    }
    
    /**
     * On considère que les noms de produits sont tous différents
     * @param stmt La statement
     * @param nomProduit
     * @return Le numéro du produit correspondant au nom passé en paramètre
     * @throws SQLException 
     */
    public int getIdProduit(Statement stmt,String nomProduit) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT idProduit FROM Produit WHERE nomProduit ='"+nomProduit+"'");
        int idProduit=-1;
        while(result.next()){
            idProduit=result.getInt("idProduit");
        }
        return idProduit;
    }
    
    /**
     * Renvoie le nom du produit en fonction de son ID, null si le produit n'existe pas
     * @param stmt La statement
     * @param idProduit
     * @return Le nom du produit correspondant à l'ID
     * @throws SQLException 
     */
    public String getnomProduit(Statement stmt,int idProduit) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT nomProduit FROM Produit WHERE idProduit="+idProduit);
        String nomProduit=null;
        while(result.next()){
            nomProduit = result.getString("nomProduit");
        }
        return nomProduit;
    }
    
    /**
     * Renvoie le prix d'un produit, -1 si le produit n'existe pas
     * @param stmt La statement
     * @param idProduit
     * @return Le prix du produit correspondant à l'ID ou -1
     * @throws SQLException 
     */
    public int getPrix(Statement stmt,int idProduit) throws SQLException{
        ResultSet result = stmt.executeQuery("SELECT prix FROM Produit WHERE nomProduit="+idProduit);
        int Prix = -1;
        while(result.next()){
            Prix = result.getInt("prix");
        }
        return Prix;
    }
    
    /**
     * Renvoie la liste des ID de tout les produits
     * @param stmt La statement
     * @return Tableau d'int contenant tout les produits ou rien si il n'y a pas de produit
     * @throws SQLException 
     */
    public int[] getAllProduit(Statement stmt) throws SQLException{
        ResultSet resultLignes = stmt.executeQuery("SELECT count(idProduit) AS nbLignes FROM Produit");
        int nbLignes = 0;
        while (resultLignes.next()){
            nbLignes = resultLignes.getInt("nbLignes");
        }
        
        ResultSet result = stmt.executeQuery("SELECT idProduit FROM Produit");
        int tab[] = new int[nbLignes];
        int i =0;
        while(result.next()){
            tab[i]=result.getInt("idProduit");
            i++;
        }
        return tab;
    }
    
    
    
}
