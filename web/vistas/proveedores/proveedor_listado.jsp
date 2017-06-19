<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LISTADO DE PROVEEDORES</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Empresa</center></th>
                <th><center>Contacto</center></th>
                <th><center>Teléfono</center></th>
                <th style="width: 50pt"><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todosProveedores" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="proveedorEmpresa"/></td>
                        <td><s:property value="proveedorContacto"/></td>
                        <td><center><s:property value="proveedorTelefono1"/></center></td>
                    <td>
                        <center>
                            <s:if test="#session.rol_Nombre.equalsIgnoreCase('Administrador de institución')">
                            <s:a action="condicionEditar" cssStyle="color: navy">
                                <s:param name="proveedorId" value="proveedorId"/>
                                <i class="glyphicon glyphicon-pencil"></i>
                            </s:a>
                            </s:if>
                            <s:if test="#session.rol_Nombre.equalsIgnoreCase('Proveedor')">
                            <s:a action="proveedorEditar" cssStyle="color: navy">
                                <s:param name="proveedorId" value="proveedorId"/>
                                <i class="glyphicon glyphicon-pencil"></i>
                            </s:a>
                            </s:if>
                            <s:a  action="proveedorVer" cssStyle="color: navy">
                                <s:param name="proveedorId" value="proveedorId"/>
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
        <s:a action="proveedorNuevo" cssClass="btn btn-default" >Nuevo Proveedor</s:a>
    </div>
    <br/><br/><br/><br/>
</div>
