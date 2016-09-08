<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Area Clienti</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Jorge Sanchez Gomez">
        <meta name="keywords" content="cliente">
        <meta name="description" content="Milestone 3">
        <link rel="stylesheet" type="text/css" href="css/mystyle.css" media="screen">
    </head>
    <body>
        <div class="web">
            <header>
                    <h1>Movil Mania</h1>
                    <p>Pagina cliente</p>
            </header>
                <nav id="navegacion">
                     <h3> Menu di navigazione</h3>
                    <ul>
                        <li><a href="descrizione.jsp">Link a Descrizione</a></li>
                    </ul>
                </nav>
            <div class="contenido">
            <table>
                    <tr class="encabezado">
                        <th>Nome del prodotto</th>
                        <th>Foto</th>
                        <th>Quiantità di pezzi disponibili</th>
                        <th>Prezzo</th>
                        <th>Aggiungere al carrello </th>
                    </tr>
                    <c:forEach var="producto" items="${productos}">
                        <tr>
                            <td class="titulo">${producto.getTitulo()}</td>
                            <td class="imagen"><img src="${producto.getImagen()}" title="${producto.getTitulo()}" 
                                     alt="${producto.getTitulo()}"</td>
                            <td class="disponibilidad">${producto.getDisponibilidad()}</td>
                            <td class="precio">${producto.getPrecio()}</td>
                            <td><a href="cliente.html?idProducto=${producto.getId()}">Aggiungere al carrello</a></td>   
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>