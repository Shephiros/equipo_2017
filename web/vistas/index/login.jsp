<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<div class="container">
    <div class="page-header">
    <h2 style="color: navy"><b><center>BIENVENIDO</center></b></h2>
    <h4 style="color: navy"><center><small>Ingrese sus datos</small></center></4>
    <center><img src="${pageContext.request.contextPath}/recursos/images/grupo4.png" class="img-circle" alt="Cinque Terre" width="100" height="80"></center>
    </div>
    <div class="tab-content">
        <form action="Bienvenido" method="post">
            <div class="form-row loginbox">
                <div class="col-lg-4 col-md-3 "></div>
                <div class="col-lg-1 col-md-2 "><s:label value="Nombre:"></s:label></div>
                <div class="col-lg-4 col-md-4 "><s:textfield name="usuario" cssClass="form-control" cssStyle="width: 70%"></s:textfield></div>
                <div class="col-lg-3 col-md-3 "></div>
                </div><br/><br/>
                <div class="form-row loginbox">
                    <div class="col-lg-4 col-md-3 "></div>
                    <div class="col-lg-1 col-md-2 "><s:label value="Contraseña:"></s:label></div>
                    <div class="col-lg-4 col-md-4 "><s:password name="contrasenya" cssClass="form-control" cssStyle="width: 70%"></s:password></div>
                    <div class="col-lg-3 col-md-3 "></div>
                </div><br/><br/>
                <div class="form-row">
                    <div class="col-lg-12 col-md-12"><s:submit value="Entrar" cssClass="btn btn-primary" align="center"></s:submit></div>
            </div>
        </form>
    </div>
</div>
<br><br><br><br>