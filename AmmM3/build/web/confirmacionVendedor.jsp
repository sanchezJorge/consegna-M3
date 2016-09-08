<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Riepilogo inserimento - Dischi&Vinili</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Jorge Sanchez Gomez">
        <meta name="keywords" content="Milestone 3">
        <meta name="description" content="Confirmacion Vendedor">
        <link rel="stylesheet" type="text/css" href="css/mystyle.css" media="screen">
    </head>
    <body>
        <div class="web">
            <header>
                    <h1>Movil Mania</h1>
                    <p>Conferma del Venditore</p>
            </header>
                <nav id="navegacion">
                    <ul>
                        <li><a href="descrizione.jsp">Link a Descrizione</a></li>
                    </ul>
                </nav>
            <div class="contenido">              
                <h1>Conferma:</h1>
                        <h2>Nome dello Oggeto:</h2> ${nombre}
                        <h2>URL della foto: </h2> ${img}
                        <h2>Descrizione: </h2> ${descripcion}
                        <h2>Prezzo: </h2> ${precio}
                        <h2>Quantità: </h2> ${cantidad}
            </div>
        </div>
    </body>
</html>

