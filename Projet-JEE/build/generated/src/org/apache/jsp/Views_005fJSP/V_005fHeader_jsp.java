package org.apache.jsp.Views_005fJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class V_005fHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Views_JSP/./V_Menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("            <title>World of Trackmania</title>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width; initial-scale=1; maximum-scale=1; user-scalable=0\"/> \n");
      out.write("\n");
      out.write("\t\t<link href=\"../CSS/Bootstrap/bootstrap.css\" rel=\"stylesheet\"> \n");
      out.write("\t\t<link href=\"../CSS/css.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../Scripts/jquery-3.1.1.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../Scripts/jquery.validate.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../Scripts/monjs.js\"></script>\n");
      out.write("\t</head> \n");
      out.write("\t<body>\n");
      out.write("\t\t<!-- En-tête -->\n");
      out.write("\t\t<header class=\"header\" >\n");
      out.write("\t\t\t<section class=\"container\" >\n");
      out.write("\t\t\t\t<div class = \"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-10 col-sm-10 col-xs-12\">\n");
      out.write("                                            <img src=\"../Images/logopetit.png\" alt=\"image_logo\" class=\"img-circle\" height=\"130\" width=\"130\" style=\" display: inline-block\" >\n");
      out.write("                                            <h2 style=\"display:inline-block\">World of Trackmania</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t</header>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li>\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.query_string']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    <a href=\"./Accueil.jsp\">\n");
      out.write("                        Accueil\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"./V_Articles.jsp\">\n");
      out.write("                        Liste des articles\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"./V_Panier.jsp\">\n");
      out.write("                        Panier\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"./V_Commande.jsp\">\n");
      out.write("                        Mes commandes\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"./V_Connexion.jsp\">\n");
      out.write("                        Connexion\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
