<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>CATÁLOGO DE EQUIPOS</center></b></h2><br>

<div class="form-row">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th><center>Nombre</center></th>
            <th><center>Marca</center></th>
            <th><center>Modelo</center></th>
            <th><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todosEquipos" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="equipoNombre"/></td>
                        <td><s:property value="equipoMarca"/></td>
                        <td><s:property value="equipoModelo"/></td>
                        <td>
                <center>
                    <s:a action="equipoEditar" cssStyle="color: navy">
                        <s:param name="equipoId" value="equipoId"/>
                        <i class="glyphicon glyphicon-pencil"></i>
                    </s:a>
                    <s:a  action="equipoVer" cssStyle="color: navy">
                        <s:param name="equipoId" value="equipoId"/>
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
        <s:a action="equipoNuevo" cssClass="btn btn-default" >Nuevo Equipo</s:a>
    </div>
</div>

