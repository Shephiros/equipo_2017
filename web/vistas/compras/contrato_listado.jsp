<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>LISTADO DE CONTRATOS DE COMPRAS</center></b></h2><br>

<div class="form-row">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th><center>Fecha</center></th>
            <th><center>Responsable UACI</center></th>
            <th><center>Observación</center></th>
            <th><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todosContratos" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="contratoFecha"/></td>
                        <td><s:property value="contratoRespUaci"/></td>
                        <td><s:property value="contratoObservacion"/></td>
                        <td>
                <center>
                    <s:a action="contratoEditar" cssStyle="color: navy">
                        <s:param name="contratoId" value="contratoId"/>
                        <i class="glyphicon glyphicon-pencil"></i>
                    </s:a>
                    <s:a  action="contratoVer" cssStyle="color: navy">
                        <s:param name="contratoId" value="contratoId"/>
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
        <s:a action="contratoNuevo" cssClass="btn btn-default" >Nuevo Contrato</s:a>
    </div>
</div>

