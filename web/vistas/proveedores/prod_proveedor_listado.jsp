<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>CATÁLOGO DE PRODUCTOS</center></b></h2><br>

<div class="form-row">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th><center>Nombre</center></th>
            <th><center>Marca</center></th>
            <th><center>Existencias</center></th>
            <th><center>Descripción</center></th>
            <th><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todosProductosProveedor" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="prodProveedorNombre"/></td>
                        <td><s:property value="prodProveedorMarca"/></td>
                        <td><s:property value="prodProveedorExistencias"/></td>
                        <td><s:property value="prodProveedorDescripcion"/></td>
                        <td>
                <center>
                    <s:a action="prodProveedorEditar" cssStyle="color: navy">
                        <s:param name="prodProveedorId" value="prodProveedorId"/>
                        <i class="glyphicon glyphicon-pencil"></i>
                    </s:a>
                    <s:a  action="prodProveedorVer" cssStyle="color: navy">
                        <s:param name="prodProveedorId" value="prodProveedorId"/>
                        <i class="glyphicon glyphicon-eye-open"></i>
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
        <s:a action="prodProveedorNuevo" cssClass="btn btn-default" >Nueva producto</s:a>
    </div>
</div>
