<%-- 
    Document   : IntroduceDNI
    Created on : 17-oct-2016, 9:59:25
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Introduce DNI a buscar</h1>
        <form action="ServletAlumnos" method="POST">
            <input type="text" name="dni" value="" />  <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
