<%-- 
    Document   : list
    Created on : 21/01/2020, 10:44:21 PM
    Author     : Pc
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Person"%>
<%@page import="modelDAO.PersonDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Personas</h1>
            <a href="controller?action=new">Agregar nuevo</a>
            
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Documento</th>
                        <th>Nombres</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                <%
                PersonDAO pDAO = new PersonDAO();
                List<Person>list = pDAO.toList();
                Iterator<Person>iter = list.iterator();
                Person per = null;
                
                while (iter.hasNext()) {
                    per = iter.next();
                
                %>
                
                    <tr>
                        <td><%= per.getId() %></td>
                        <td><%= per.getDocument() %></td>
                        <td><%= per.getName() %></td>
                        <td>
                            <a >Edit</a>
                            <a >Delete</a>
                        </td>
                    </tr>
                    <% } %>
                </tbody>
            </table>

        </div>
    </body>
</html>
