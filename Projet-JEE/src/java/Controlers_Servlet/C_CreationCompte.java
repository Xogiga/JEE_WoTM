package Controlers_Servlet;

import static Controlers_Servlet.Inscription.vue;
import Models_Javabeans.ClientDAO;
import Models_Javabeans.DAO_AccessDB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author p1623107
 */
@WebServlet(name = "Inscription", urlPatterns = {"/Inscription"})
public class C_CreationCompte extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        this.getServletContext().getRequestDispatcher(vue).forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String identif = request.getParameter("Identifiant");
        String pwd = request.getParameter("Pwrd");
        String pwdV = request.getParameter("Pwrd1");
        String[] random = new String[10];
	if(identif != null  && pwdV.equals(pwd)){
            try {
                Connection co = DAO_AccessDB.createConnexion("jdbc:mariadb://iutdoua-web.univ-lyon1.fr/p1623107","p1623107","288357");
                ClientDAO.creerCompte(DAO_AccessDB.createStatement(co),identif,pwd);
            } catch (SQLException ex) {
                Logger.getLogger(C_CreationCompte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
