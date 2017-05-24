<%-- 
    Document   : rol_listado
    Created on : 22-may-2017, 16:22:25
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Listado Roles</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>LISTADO ROLES</center></b></h2><br>
        <br>
        <table class="table table-bordered table-condensed">
            <thead>
                <th>Nombre</th>
                <th>Descripcion</th>
            </thead>
            <tbody>
                <s:iterator value="todosRoles" var="dato" status="estado">
                    <tr>
                        <td><s:property value="rolNombre"/></td>
                        <td><s:property value="rolDescripcion"/></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <br>
    </body>
</html>

