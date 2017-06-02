<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>SOLICITUDES</center></b></h2><br>

<div class="form-row">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th><center>Codigo</center></th>
            <th><center>Departamento</center></th>
            <th><center>Responsable</center></th>
            <th><center>Fecha</center></th>
            <th><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasSolicitudes" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="solicitudCodigo"/></td>
                        <td><s:property value="solicitudCodigo"/></td>
                        <td><s:property value="solicitudResponsable"/></td>
                        <td><s:property value="solicitudFecha"/></td>
                        <td>
                <center>
                    <s:a action="solicitudEditar" cssStyle="color: navy">
                        <s:param name="solicitudId" value="solicitudId"/>
                        <i class="glyphicon glyphicon-pencil"></i>
                    </s:a>
                    <s:a  action="solicitudVer" cssStyle="color: navy">
                        <s:param name="solicitudId" value="solicitudId"/>
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
        <s:a action="solicitudNuevo" cssClass="btn btn-default" >Nueva solicitud</s:a>
    </div>
</div>

