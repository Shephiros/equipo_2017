<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LISTADO ROLES</center></b></h2><br>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                <th><center>Nombre</center></th>
                <th><center>Descripcion</center></th>
            </thead>
            <tbody>
                <s:iterator value="todosRoles" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="rolNombre"/></td>
                        <td><s:property value="rolDescripcion"/></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </div>
    <div class="col-lg-1">
    </div>
</div>
