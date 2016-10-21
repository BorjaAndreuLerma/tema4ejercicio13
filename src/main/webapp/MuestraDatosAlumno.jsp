<%-- 
    Document   : MostrarDatosAlumno
    Created on : 19-oct-2016, 9:58:41
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="alumno" scope="request" class="Entidades.AlumnoBean" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Los datos del alumno son:</h1>
        <b>Nombre: </b><jsp:getProperty name="alumno" property="nombre"/><br>
        <b>Primer Apellido: </b><jsp:getProperty name="alumno" property="primerapellido"/><br>
        <b>Segundo Apellido: </b><jsp:getProperty name="alumno" property="segundoapellido"/><br>
        <b>DNI: </b><jsp:getProperty name="alumno" property="DNI"/>
    </body>
</html>
