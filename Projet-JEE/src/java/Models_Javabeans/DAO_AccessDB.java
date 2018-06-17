package Models_Javabeans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_AccessDB {
    
    private String url ;
    private String user;
    private String pwd;
    private static Connection con = null;
    
    public DAO_AccessDB(){ 
    }
    
    public DAO_AccessDB(String newUrl, String newuser, String newMdp){
        this.url = newUrl;
        this.user = newuser;
        this.pwd = newMdp;
    }
    
    public static void main(String[] args) throws SQLException{
        DAO_AccessDB link = new DAO_AccessDB("jdbc:mariadb://iutdoua-web.univ-lyon1.fr/p1623107","p1623107","288357");
        Connection con = link.createConnexion(link.url, link.user, link.pwd);
        Statement stmt = link.createStatement(con);
    } 
    
    /**
     * 
     * @param url url de connection à la BD
     * @param user Nom d'utilisateur de connection
     * @param pwd Mot de passe de connection
     * @return La connexion
     * @throws SQLException 
     */
    public static Connection createConnexion(String url,String user,String pwd)throws SQLException{
        try {
            Connection co = DriverManager.getConnection(url,user,pwd);
            return co;
        }catch(Exception e){
            System.out.println("Erreur de connection à la BD");
            return null;
        }
    }
    
    /**
     * 
     * @param connect La connection à la BD
     * @return La statement qui va contenir les requêtes
     * @throws SQLException 
     */
    public static Statement createStatement(Connection connect) throws SQLException {
        try {
            Statement stmt = connect.createStatement();
            return stmt;
        } catch(Exception e) {
            System.out.println("Erreur lors de la création de la Statement");
            return null;
        }
    }
    
    /**
     * Fermeture de la connection à la BD pour éviter de la surcharger
     * @param connect La connection à la BD
     * @throws SQLException 
     */
    public void closeConnection(Connection connect)throws SQLException{
        try {
            connect.close();
        }catch(Exception conClose){
            System.out.println("Closing connexion failed!");
        }
    }
}