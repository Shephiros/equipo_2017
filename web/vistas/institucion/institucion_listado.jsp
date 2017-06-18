<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LISTADO DE INSTITUCIONES</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Institución</center></th>
                <th><center>Encargado</center></th>
                <th><center>Teléfono</center></th>
                <th style="width: 50pt"><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasInstituciones" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="institucionNombre"/></td>
                        <td><s:property value="institucionEncargado"/></td>
                        <td><center><s:property value="institucionTelefono"/></center></td>
                        <td>
                            <center>
                                <s:a action="institucionEditar" cssStyle="color: navy">
                                    <s:param name="institucionId" value="institucionId"/>
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </s:a>
                                <s:a  action="institucionVer" cssStyle="color: navy">
                                    <s:param name="institucionId" value="institucionId"/>
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
        <s:a action="institucionNuevo" cssClass="btn btn-default">Nueva Institución</s:a>
    </div>
    <br/><br/><br/><br/>
</div>
