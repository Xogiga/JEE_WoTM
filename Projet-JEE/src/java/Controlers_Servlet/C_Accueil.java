package Controlers_Servlet;

import Models_Javabeans.ClientDAO;
import Models_Javabeans.CommandeDAO;
import Models_Javabeans.DAO_AccessDB;
import Models_Javabeans.PanierDAO;
import Models_Javabeans.ProduitDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author p1623107
 */
@WebServlet(urlPatterns = {"/C_Accueil"})
public class C_Accueil extends HttpServlet {

    public String panier = "panier";
    public String formulaire = "form";
    public String vue = "/Views_JSP/V_Panier.jsp";
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(vue).forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAO_AccessDB co = new DAO_AccessDB();
        String url = co.getUrl();
        String user = co.getUser();
        String pw = co.getPwd();
        Connection con;
        try {
            con = co.createConnexion(url,user,pw);
            PanierDAO cmd = new PanierDAO(url,user,pw);
            ClientDAO cli = new ClientDAO(url, user, pw);
            Statement stmt = co.createStatement(con);
            ProduitDAO prduit = new ProduitDAO(url, user,pw);
            int idMax = cmd.numPanier(stmt);
            int idCli = cli.getidClient(stmt, user, pw);
            int idProd = prduit.getIdProduit(stmt, "Illidan");
            int prixprod = prduit.getPrix(stmt, idProd);
            cmd.addProduit(stmt, idMax, idCli, idProd, prixprod);
        } catch (SQLException ex) {
            Logger.getLogger(C_Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}