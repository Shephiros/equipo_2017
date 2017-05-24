<%-- 
    Document   : usuario_listado
    Created on : 19-may-2017, 13:37:02
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Listado Usuario</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
    </head>
    <body>
        <h1><center>LISTADO USUARIOS</center></h1>
        <br>
        
        <h2>Institución:</h2>
        <br>
        <table class="table table-bordered table-condensed">
            <thead>
                <th>Usuario</th>
                <th>Nombre</th>
                <th>Correo</th>
                <th>Estado</th>
                <th>Opciones</th>
            </thead>
            <tbody>
                <s:iterator value="todosUsuarios" var="dato" status="estado">
                    <tr>
                        <td><s:property value="usuarioUsuario"/></td>
                        <td><s:property value="usuarioNombre"/></td>
                        <td><s:property value="usuarioCorreo"/></td>
                        <td><s:property value="usuarioEstado"/></td>
                        <td>
                            <center>
                                <s:a action="usuarioEditar">
                                <s:param name="usuarioUsuario" value="usuarioUsuario"/>
                                <i class="glyphicon glyphicon-pencil"></i>
                            </s:a>
                            <s:a  action="usuarioVer">
                                <s:param name="usuarioUsuario" value="usuarioUsuario"/>
                                <i class="glyphicon glyphicon-eye-open"></i>
                            </s:a>
                            </center>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <br>
    <center><s:a action="usuarioNuevo" cssClass="btn btn-default" >Nuevo</s:a></center>
    
    
    </body>
</html>
