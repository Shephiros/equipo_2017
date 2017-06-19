<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LISTADO USUARIOS</center></b></h2>

<div class="container" style="width: 100%">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
                <th style="width: 10pt"><center>No.</center></th>
                    <th><center>Usuario</center></th>
                    <th><center>Nombre</center></th>
                    <th><center>Correo</center></th>
                    <th><center>Estado</center></th>
                    <th style="width: 50pt">Opciones</th>
            </thead>
            <tbody>
                <s:iterator value="todosUsuarios" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="usuarioUsuario"/></td>
                        <td><s:property value="usuarioNombre"/></td>
                        <td><s:property value="usuarioCorreo"/></td>
                        <td><center><s:property value="(usuarioEstado==0)?'Inactivo':'Activo'"/></center></td>
                        <td>
                            <center>
                                <s:a action="usuarioEditar">
                                    <s:param name="usuarioUsuario" value="usuarioUsuario"/>
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </s:a>
                                <s:a  action="usuarioVer">
                                    <s:param name="usuarioUsuario" value="usuarioUsuario"/>
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

<div class="col-lg-12">
    <center><s:a action="usuarioNuevo" cssClass="btn btn-default" >Nuevo Usuario</s:a></center>
    <br/><br/><br/><br/>
</div>