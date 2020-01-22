<%-- 
    Document   : add
    Created on : 21/01/2020, 10:44:28 PM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Persona</h1>
        <form action="controller">
            Documento: <input type="text" name="txtDocument"/><br>
            Nombre: <input type="text" name="txtName"/><br>
            <input type="submit" name="action" value="add">
        </form>
    </body>
</html>
