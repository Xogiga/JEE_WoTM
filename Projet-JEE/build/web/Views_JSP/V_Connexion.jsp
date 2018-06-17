<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./V_Header.jsp" %>

<html>   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
    </head>
    
    <body background="../Images/fond2.png">
        
        <h1 style="margin: 15px;">Connexion</h1>
        
        <form style="margin: 15px;">
            <table>
                <tr>
                    <th align="left">Identifiant : </th>
                    <td><input type="text" name="Identifiant" value="Username" /></td>
                </tr>
                <tr>
                    <th align="left">Mot de passe : </th>
                    <td><input type="password" name="Pwrd" value="Password" /></td>
                </tr>
            </table> 
            <div>
                <br>
                <input type="submit" value="Connexion" name="Connect" />
            </div>
            <div>
                <p style="font-size: 12px;">Vous n'avez pas encore de compte ? → <a href="./Accueil.jsp" style="font-size: 12px">créer un compte</a></p>
            </div>
        </form>
    </body>
</html>
