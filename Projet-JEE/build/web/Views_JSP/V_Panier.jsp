<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./V_Header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="../Images/fond2.png">
        <table style="background-color:#000000;border-collapse:collapse;color:#000;">
            <tr style="background-color:#f0f8ff;color:white;width:50%;color: black">
                <td style="padding:2px;border:0;border-bottom:1px dotted #BDB76B;border:solid lightgrey">
                    Nom Produit
                </td>
                <td style="padding:2px;border:0;border-bottom:1px dotted #BDB76B;border:solid lightgrey">
                    Prix
                </td>
                <td style="padding:2px;border:0;border-bottom:1px dotted #BDB76B;border:solid lightgrey">
                    Quantité
                </td>
            </tr>
            <tr style="border: solid grey 2px;margin:1.5px;color: white">
                <td style="border: solid lightgrey 2px; padding: 2px">
                    Illidan
                </td>
                <td style="border: solid lightgrey 2px; padding: 2px">
                    1 300 €
                </td>
                <td style="border: solid lightgrey 2px; padding: 2px">
                    x2
                </td>
            </tr>
            <tr style="border: solid grey 2px;margin:1.5px;color: white">
                <td style="border: solid lightgrey 2px; padding: 2px">
                    Sylvanas
                </td>
                <td style="border: solid lightgrey 2px; padding: 2px">
                    600 €
                </td>
                <td style="border: solid lightgrey 2px; padding: 2px">
                    x1
                </td>
            </tr>
            <tr style="border: solid grey 2px;margin:1.5px;color: white">
                <td style="border: solid lightgrey 2px; padding: 2px">
                    Arthas
                </td>
                <td style="border: solid lightgrey 2px; padding: 2px">
                    750 €
                </td>
                <td style="border: solid lightgrey 2px; padding: 2px">
                    x1
                </td>
            </tr>
        </table>
        <div>
            <p style="position: relative; right : 0;">   Prix total : 2 650 €
        </div>
    </body>
</html>
