<%-- 
    Document   : plantilla_index
    Created on : 06-05-2017, 11:08:06 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:getAsString name="titulo" /></title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/dataTables.bootstrap.min.css"/>
    </head>
    <body>
        <header><center><tiles:insertAttribute name="cabecera" /></center></header>
        <tiles:insertAttribute name="cuerpo"  />
        <footer><tiles:insertAttribute name="pie" /></footer>
    </body>
</html>
