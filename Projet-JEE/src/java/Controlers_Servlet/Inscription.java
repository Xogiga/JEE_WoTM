/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers_Servlet;

import Métier.InscriptionForm;
import Métier.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
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
public class Inscription extends HttpServlet {

    public static final String user = "utilisateur";
    public static final String formulaire = "form";
    public static final String vue = "/Views_JSP/Accueil.jsp";
		
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        this.getServletContext().getRequestDispatcher(vue).forward(request, response);
    }
	
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        InscriptionForm form = new InscriptionForm();
        Utilisateur utilisateur = form.inscrireUtilisateur(request);
        request.setAttribute(formulaire, form);
        request.setAttribute(user, utilisateur);	
        this.getServletContext().getRequestDispatcher(vue).forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Information sur le nouvel utilisateurs";
    }

}
