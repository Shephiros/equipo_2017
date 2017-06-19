<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>CATÁLOGO DE PRODUCTOS</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th style="width: 10pt"><center>No.</center></th>
            <th><center>Nombre</center></th>
            <th><center>Marca</center></th>
            <th><center>Existencias</center></th>
            <th><center>Descripción</center></th>
            <th style="width: 50pt"><center>Opciones</center></th>
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
                                <s:if test="#session.menu[31]">
                                <s:a action="prodProveedorEditar" cssStyle="color: navy">
                                    <s:param name="prodProveedorId" value="prodProveedorId"/>
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </s:a>
                                </s:if>
                                <s:if test="#session.menu[30]">
                                <s:a  action="prodProveedorVer" cssStyle="color: navy">
                                    <s:param name="prodProveedorId" value="prodProveedorId"/>
                                    <i class="glyphicon glyphicon-eye-open"></i>
                                </s:a>
                                </s:if>
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
        <s:if test="#session.menu[29]"><s:a action="prodProveedorNuevo" cssClass="btn btn-default" >Nueva Producto</s:a></s:if>
    </div>
    <br/><br/><br/><br/>
</div>