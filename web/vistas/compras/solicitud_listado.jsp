<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>SOLICITUDES</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Codigo</center></th>
                <th><center>Tipo Solicitud</center></th>
                <th><center>Estado</center></th>
                <th><center>Responsable</center></th>
                <th><center>Fecha</center></th>
                <th style="width: 50pt"><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasSolicitudes" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><center><s:property value="solicitudCodigo"/></center></td>
                        <td><s:property value="(tipoSolicitudes.tipoSolicitudId == 1) ?'Compra directa':((tipoSolicitudes.tipoSolicitudId == 2) ?'Libre gestión':'Licitación')"/></td>
                        <td><s:property value="(solicitudEstado == 0) ?'En proceso de aprobación':((solicitudEstado == 1) ?'Denegado':'Aprobado')"/></td>
                        <td><s:property value="solicitudReponsable"/></td>
                        <td><center><s:property value="solicitudFecha"/></center></td>
                        <td>
                            <center>
                                <s:if test="solicitudEstado == 0">
                                <s:a action="solicitudEditar" cssStyle="color: navy">
                                    <s:param name="solicitudId" value="solicitudId"/>
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </s:a>
                                </s:if>
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
        <s:a action="solicitudNuevo" cssClass="btn btn-default" >Nueva Solicitud</s:a>
    </div>
    <br/><br/><br/><br/>
</div>
