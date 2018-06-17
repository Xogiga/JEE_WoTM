<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <ul class="nav navbar-nav">
                <li>
                    ${requestScope['javax.servlet.forward.request_uri']}
                    ${requestScope['javax.servlet.forward.query_string']}
                    <a href="./Accueil.jsp">
                        Accueil
                    </a>
                </li>
                <li>
                    <a href="./V_Articles.jsp">
                        Magasin
                    </a>
                </li>
                <li>
                    <a href="./V_Panier.jsp">
                        Panier
                    </a>
                </li>
                <li>
                    <a href="./V_Commande.jsp">
                        Mes commandes
                    </a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="./V_Connexion.jsp">
                        Connexion
                    </a>
                </li>
            </ul>
        </div>
    </nav>
</html>