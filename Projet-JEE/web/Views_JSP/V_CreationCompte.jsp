<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./V_Header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creation de Compte</title>
    </head>
    <body background="../Images/fond2.png">
        <h1 style="margin:15px">Création Compte</h1>
        <form style="margin:15px">
            <div>
                <Label>
                    Identifiant :
                    <br>
                    <input type="text" name="Identifiant" value="Username" />
                </Label>
            </div>
            <div>
                <Label>
                    <br>
                    Mot de passe : 
                    <br>
                    <input type="password" name="Pwrd" value="Password" />
                </Label>
            </div>
            <div>
                <Label>
                    <br>
                    Confirmation mot de passe : 
                    <br>
                    <input type="password" name="Pwrd1" value="Password" />
                </Label>
            </div>
            <br>
            <div>
                <input type="submit" value="Connexion" name="Connect" />
            </div>
            <div>
                <p style="font-size: 12px">Vous avez déjà un compte ? → <a href="./V_Connexion.jsp" style="font-size: 12px">Connexion</a></p>
            </div>
        </form>
    </body>
</html>
