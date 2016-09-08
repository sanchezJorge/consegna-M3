<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Vendedores</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Jorge Sanchez">
        <meta name="keywords" content="Milestone 3, vendedores">
        <meta name="description" content="vendedores">
        <link rel="stylesheet" type="text/css" href="css/mystyle.css" media="screen">
    </head>
    <body>
        <div class="web">
            <header>

                    <h1>Movil Mania</h1>
                    <p>Pagina venditore</p>
                
            </header>

            
                <nav id="navegacion">
                    <ul>
                        <li><a href="descrizione.jsp">Descrizione del sito</a></li>
                    </ul>
                </nav>
            
            
            <div class="contenido">
        <br><br>
        <form action="vendedores.html" method="post">
            <label for="nombre">Nome dello Oggeto: </label>
            <br>
            <input type="text" name="nombre" id="nombre">
            <br><br>
            <label for="img">URL della foto: </label>
            <br>
            <input type="img" name="img" id="img">
            <br><br>
            <label for="descripcion">Descrizione </label>
            <br>
            <textarea rows="5" cols="40" name="descripcion" id="descripcion" ></textarea>
            <br><br>
            <label for="precio">Prezzo </label>
            <br>
            <input type="number" name="precio" id="precio">
            <br><br>
            <label for="cantidad">Quantità </label>
            <br>
            <input type="number" name="cantidad" id="cantidad">
            <br><br>
            <input type="submit" value="Inserire" name="Insertar">
            <input type="reset" value="Cancellare">
            <br><br>
        </form>
        </div>    
        </div>
    </body>
</html>