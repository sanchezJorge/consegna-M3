<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Riepilogo acquisto - Dischi&Vinili</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Jorge Sanchez Gomez">
        <meta name="keywords" content="Milestone 3, confirmacion">
        <meta name="description" content="Pagina de confirmacion">
        <link rel="stylesheet" type="text/css" href="css/mystyle.css" media="screen">
    </head>
    <body>
        <div class="web">
            <header>
                
                    <h1>Movil Mania</h1>
                              
            </header>

                <nav id="navegacion">
                    <ul>
                        <li><a href="descrizione.jsp">Descrizione del sito</a></li>
                        <li><a href="cliente.html">Cliente</a></li>
                        <li><a href="login.html">Esegui l'accesso</a></li>
                    </ul>
                </nav>


            <div class="contenido">
               
                    <h1>Riepilogo acquisto</h1>
                    
                    <h2>Titulo: </h2> ${producto.getTitulo()}
                    <h2>Descrizione: </h2> ${producto.getDescripcion()}
                        
                        <img src="${producto.getImagen()}" title="${producto.getTitulo()}" 
                                     alt="${producto.getTitulo()}">
                        <h2>Precio: </h2> ${producto.getPrecio()}
                        <form method="post" action="cliente.html">
                            <input type="hidden" name="idProductoAcq" value="${producto.getId()}">
                            <input type="hidden" name="idProducto" value="0">
                            
                            <button type="submit" name="Adquirido" value="Adquirido">Conferma</button>
                            
                        </form>
                    
              
            </div>
        </div>
    </body>
</html>
