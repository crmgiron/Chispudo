<%-- 
    Document   : prueba
    Created on : 24/03/2019, 11:17:20 AM
    Author     : mirandacarlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="login__container">
       <div class="login__top">
          <img  class="login__img" src="./img/pokemoneda.png" alt="">
          <h2 class="login__title">Form <span>Name</span></h2>
       </div>
        
        <form class="login__form">
            <input type="text" placeholder="&#128100; username" required autofocus>
            <input type="password" placeholder="&#x1F512; password" required>
            <input class="btn__submit" type="submit" value="ENTRAR">
            <a class="form__recover" href="">Olvidaste la contraseña?</a>
        </form>
    </div>
    </body>
</html>
