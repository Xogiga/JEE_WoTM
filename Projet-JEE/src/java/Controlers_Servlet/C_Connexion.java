/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers_Servlet;

import Models_Javabeans.ClientDAO;
import Models_Javabeans.DAO_AccessDB;
import Models_Javabeans.PanierDAO;
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
@WebServlet(name = "C_Connexion", urlPatterns = {"/C_Connexion"})
public class C_Connexion extends HttpServlet {


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ClientDAO cli = new ClientDAO();
        DAO_AccessDB co = new DAO_AccessDB();
        String url = co.getUrl();
        String user = co.getUser();
        String pw = co.getPwd();
        Connection con;
        try {
            con = co.createConnexion(url,user,pw);
            Statement stmt = co.createStatement(con);
            String users = cli.getIdentifiant(stmt, 0);
            if(cli.nbLigneConnexion(stmt, user, pw)=="Connexion validée"){
                //Affichage des produis
            }
        }catch (SQLException ex) {
            Logger.getLogger(C_Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Verification de la connexion";
    }// </editor-fold>

}
