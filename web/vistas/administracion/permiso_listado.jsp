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

<div class="container" style="width: 60%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Función</center></th>
            </thead>
            <tbody>
                <s:iterator value="todosPermisosPantallas" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="pantallaNombre"/></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </div>
    <div class="col-lg-1">
    </div>
</div>
<s:textfield name="rolId" cssClass="form-control" cssStyle="color:white; border-color: white; width:00%"></s:textfield>
<div class="form-group">
    <div class="col-lg-12" style="text-align: center">
        <s:a action="permisoEditar" cssClass="btn btn-default">Editar Funciones
            <s:param name="rolId" value="rolId"/>
        </s:a>
    </div>
    <br/><br/><br/><br/><br/>
</div>
