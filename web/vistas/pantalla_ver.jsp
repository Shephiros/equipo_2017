<%-- 
    Document   : pantalla_ver
    Created on : 05-25-2017, 11:21:45 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información de Pantalla</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>INFORMACIÓN DE PANTALLA</center></b></h2><br>
        <div class="tab-content">
            <form>
                <div class="form-row">
                    <div class="col-lg-4"></div>
                    <div class="col-lg-1"><s:label value="Nombre"></s:label></div>
                    <div class="col-lg-3"><s:textfield name="pantalla.pantallaNombre" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield></div>
                    <div class="col-lg-4"></div>
                </div>
                
                <br><br><br>
                
                <div class="form-row">
                    <div class="col-lg-4"></div>
                    <div class="col-lg-1"><s:label value="Descripcion"></s:label></div>
                    <div class="col-lg-3"><s:textarea name="pantalla.pantallaDescripcion" rows="2" cssClass="form-control" disabled="true" cssStyle="width: 100%"> </s:textarea> </div>
                    <div class="col-lg-4"></div>
                </div>
           
                    <br><br><br><br>
        
                <div class="form-row">
                    <div class="col-lg-4"></div>
                    <div class="col-lg-1"><s:label value="URL"></s:label></div>
                    <div class="col-lg-3"><s:textfield name="pantalla.pantallaUrl" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield></div>
                    <div class="col-lg-4"></div>
                </div>
            </form>
        </div>
        
        <br/><br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-12">
                        <center>
                        <s:a action="pantallaListado" cssClass="btn btn-default">Regresar</s:a>
                        </center>
                    </div>
                </div>
            
    </body>
</html>
