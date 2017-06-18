<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LISTADO DE COMPRAS</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Fecha</center></th>
                <th><center>Factura</center></th>
                <th><center>Responsable</center></th>
                <th style="width: 50pt"><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasCompras" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><center><s:property value="compraFecha"/></center></td>
                        <td><center><s:property value="compraFactura"/></center></td>
                        <td><s:property value="compraResponsable"/></td>
                        <td>
                            <center>
                                <s:a action="compraEditar" cssStyle="color: navy">
                                    <s:param name="compraId" value="compraId"/>
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </s:a>
                                <s:a  action="compraVer" cssStyle="color: navy">
                                    <s:param name="compraId" value="compraId"/>
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
        <s:a action="compraNuevo" cssClass="btn btn-default" >Nueva Compra</s:a>
    </div>
    <br/><br/><br/><br/>
</div>

