package org.apache.jsp.Views_005fJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Views_JSP/./V_Header.jsp");
    _jspx_dependants.add("/Views_JSP/././V_Menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Menu -->\n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Inscription</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"form.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"V_Articles.jsp\" style=\"margin:15px;\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Inscription</legend>\n");
      out.write("                <p>Vous pouvez vous inscrire via ce formulaire.</p>\n");
      out.write("\n");
      out.write("                <label for=\"email\">Adresse email <span class=\"requis\">*</span></label><br>\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" size=\"20\" maxlength=\"60\" />\n");
      out.write("                <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['email']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <label for=\"motdepasse\">Mot de passe <span class=\"requis\">*</span></label><br>\n");
      out.write("                <input type=\"password\" id=\"motdepasse\" name=\"motdepasse\" value=\"\" size=\"20\" maxlength=\"20\" />\n");
      out.write("                <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['motdepasse']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <label for=\"confirmation\">Confirmation du mot de passe <span class=\"requis\">*</span></label><br>\n");
      out.write("                <input type=\"password\" id=\"confirmation\" name=\"confirmation\" value=\"\" size=\"20\" maxlength=\"20\" />\n");
      out.write("                <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['confirmation']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <label for=\"nom\">Nom d'utilisateur</label><br>\n");
      out.write("                <input type=\"text\" id=\"nom\" name=\"nom\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" size=\"20\" maxlength=\"20\" />\n");
      out.write("                <span class=\"erreur\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.erreurs['nom']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Inscription\" class=\"sansLabel\"  onsubmit=\"\"/>\n");
      out.write("                <br />\n");
      out.write("                <div>\n");
      out.write("                    <p style=\"font-size: 12px\">Vous avez déjà un compte ? → <a href=\"./V_Connexion.jsp\" style=\"font-size: 12px\">Connexion</a></p>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty form.erreurs ? 'succes' : 'erreur'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.resultat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${utilisateur.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${utilisateur.nom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
