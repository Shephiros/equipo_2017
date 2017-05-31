<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LISTADO DE PANTALLAS</center></b></h2><br>

<div class="form-row">
    <div class="col-lg-1"></div> 
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th><center>Nombre</center></th>
            <th><center>URL</center></th>
            <th><center>Descripcion</center></th>
            <th><center>Opciones</center></th>
            </thead>
            <tbody>
                <s:iterator value="todasPantallas" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="pantallaNombre"/></td>
                        <td><s:property value="pantallaUrl"/></td>
                        <td><s:property value="pantallaDescripcion"/></td>
                        <td>
                <center>
                    <s:a action="pantallaVer" cssStyle="color: navy">
                        <s:param name="pantallaId" value="pantallaId"/>
                        <i class="glyphicon glyphicon-eye-open"></i>
                    </s:a>
                </center>
                </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
    <div class="col-lg-1"></div>
</div>

