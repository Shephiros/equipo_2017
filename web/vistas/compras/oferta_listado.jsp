<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>OFERTAS</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Descripción</center></th>
                <th><center>Precio</center></th>
                <th style="width: 50pt"><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasOfertas" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="ofertaDescripcion"/></td>
                        <td><s:property value="ofertaPrecio"/></td>
                        <td>
                            <center>
                                <s:a  action="ofertaVer" cssStyle="color: navy">
                                    <s:param name="ofertaId" value="ofertaId"/>
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
        <s:a action="licitacionListado" cssClass="btn btn-default" >Regresar</s:a>
    </div>
    <br/><br/><br/><br/>
</div>