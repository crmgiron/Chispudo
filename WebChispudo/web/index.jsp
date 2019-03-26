<%-- 
    Document   : index
    Created on : 24/03/2019, 10:43:54 AM
    Author     : mirandacarlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/estilo.css" rel="Stylesheet" type="text/css"/> 
    </head>
    <body>
        <div id="cuadro">
            <form ction="login.jsp" method="post">
                <table cellspacing="3" cellpadding="3" border="1" >
                <p id="titulo">BIENVENIDO CHISPUDO</P>
                <img src="imagen/baraja.png" width="300" height="150">
                <br/><br/>
                <label id="subtitulo1">Ingresa tu NickName</label>
                </tr>
                <br/><br/>      
            </form>
        </div>
<form action="login.jsp" method="post">
<table cellspacing="3" cellpadding="3" border="1" >
<input type="text" name="nombre" placeholder="&#128100; username" required autofocus class="entrada"/>
<br/></br>
</tr>
</tr>
</table>
<input type="submit" value="Play" id="boton">
</form>
    </body>
</html>
