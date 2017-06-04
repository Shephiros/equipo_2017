<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>LICITACIONES</center></b></h2><br>

<div class="form-row">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th><center>Numero</center></th>
            <th><center>Año</center></th>
            <th><center>Inicio</center></th>
            <th><center>Finalizacion</center></th>
            <th><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasLicitaciones" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="licitacionNumero"/></td>
                        <td><s:property value="licitacionAnio"/></td>
                        <td><s:property value="licitacionInicio"/></td>
                        <td><s:property value="licitacionFinalizacion"/></td>
                        <td>
                <center>
                    <s:a action="licitacionEditar" cssStyle="color: navy">
                        <s:param name="licitacionId" value="licitacionId"/>
                        <i class="glyphicon glyphicon-pencil"></i>
                    </s:a>
                    <s:a  action="licitacionVer" cssStyle="color: navy">
                        <s:param name="licitacionId" value="licitacionId"/>
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
        <s:a action="licitacionNuevo" cssClass="btn btn-default" >Nueva licitación</s:a>
    </div>
</div>

