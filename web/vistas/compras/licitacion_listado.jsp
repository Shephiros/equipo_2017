<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LICITACIONES DE COMPRAS</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Numero</center></th>
                <th><center>Año</center></th>
                <th><center>Inicio</center></th>
                <th><center>Fin</center></th>
                <th><center>Descripción</center></th>
                <th style="width: 50pt"><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasLicitaciones" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><center><s:property value="licitacionNumero"/></center></td>
                        <td><center><s:property value="licitacionAnio"/></center></td>
                        <td><center><s:property value="licitacionInicio"/></center></td>
                        <td><center><s:property value="licitacionFinalizacion"/></center></td>
                        <td><s:property value="licitacionDescripcion"/></td>
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
                                <s:if test="!(#session.rol_Nombre.equalsIgnoreCase('Proveedor'))">
                                <s:a  action="ofertaListado" cssStyle="color: navy">
                                    <s:param name="licitacionId" value="licitacionId"/>
                                    <i class="glyphicon glyphicon-folder-open"></i>
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
        <s:a action="licitacionNuevo" cssClass="btn btn-default" >Nueva Licitación</s:a>
    </div>
    <br/><br/><br/><br/>
</div>
