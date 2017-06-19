<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<s:if test="rolId == 2">
<h2 style="color: navy"><b><center>PERMISOS DE ADMINISTRADOR DE INSTITUCIÓN</center></b></h2><br>
</s:if>
<s:if test="rolId == 3">
<h2 style="color: navy"><b><center>PERMISOS DE JEFE DE UNIDAD</center></b></h2><br>
</s:if>
<s:if test="rolId == 4">
<h2 style="color: navy"><b><center>PERMISOS DE PROVEEDOR</center></b></h2><br>
</s:if>

<form action="permisoGuardar" method="post">

    <div class="container" style="width: 60%">
        <div class="col-lg-1">
        </div>
        <div class="col-lg-4">
            <s:select headerKey="0" cssClass="form-control" headerValue="Seleccionar..."
                      list="%{todasPantallas}" listKey="%{pantallaId}" listValue="%{pantallaNombre}"
                      name="pantallaId" cssStyle="width: 100%"></s:select>
        </div>
        <div class="col-lg-1">
            <s:submit value="+" align="left" cssClass="btn btn-default"></s:submit>
        </div>
        <div class="col-lg-6" align="right">
            <s:textfield name="rolId" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
        </div>
    </div>
    <br/>
</form>

<div class="container" style="width: 60%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Función</center></th>
                <th style="width: 50pt"><center>Eliminar</center></th>
            </thead>
            <tbody>
                <s:iterator value="todosPermisosPantallas" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="pantallaNombre"/></td>
                        <td>
                            <center>
                                <s:a action="permisoEliminar" cssStyle="color: navy">
                                    <s:param name="rolId" value="rolId"/>
                                    <s:param name="pantallaId" value="pantallaId"/>
                                    <i class="glyphicon glyphicon-remove"></i>
                                </s:a>
                            </center>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </div>
    <div class="col-lg-1">
    </div>
</div>
<div class="form-group">
    <div class="col-lg-12" style="text-align: center">
        <br/>
        <s:a action="permisoListado" cssClass="btn btn-default">Regresar
            <s:param name="rolId" value="rolId"/>
        </s:a>
    </div>
    <br/><br/><br/><br/><br/>
</div>
