<%-- 
    Document   : login
    Created on : 24/03/2019, 10:47:40 AM
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
        
        <%@ page import="umg.edu.gt.Controla" %>
<%
// Extracción de los parámetros recibidos
String nombre = request.getParameter("nombre");

%>


        <div id="cuadro2">
            <label id="subtitulo3">Bienvenido: <%= nombre %></label>
            <form action="index.jsp" method="post">
<input type="submit" value="Inicio" id="boton2">
</form>

</body>
    </body>
</html>
