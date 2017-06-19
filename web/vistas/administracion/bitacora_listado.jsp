<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>BITÁCORA DE MOVIMIENTOS</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Fecha</center></th>
                <th><center>Usuario</center></th>
                <th style="width: 50pt"><center>Movimiento</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasBitacoras" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><center><s:property value="bitacoraFecha"/></center></td>
                        <td><s:property value="bitacoraUsuario"/></td>
                        <td><s:property value="bitacoraMovimiento"/></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </div>
    <div class="col-lg-1">
    </div>
</div>