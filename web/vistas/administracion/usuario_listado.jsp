<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>LISTADO USUARIOS</center></b></h2>


<div class="col-lg-1"></div>
<div class="col-lg-11">
    <h3 style="color: navy"><b>Institución:</b></h3>
</div>

<div class="form-row">
    <div class="col-lg-1"></div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th>Usuario</th>
            <th>Nombre</th>
            <th>Correo</th>
            <th>Estado</th>
            <th>Opciones</th>
            </thead>
            <tbody>
                <s:iterator value="todosUsuarios" var="dato" status="estado">
                    <tr>
                        <td style="text-align: center"></td>
                        <td><s:property value="usuarioUsuario"/></td>
                        <td><s:property value="usuarioNombre"/></td>
                        <td><s:property value="usuarioCorreo"/></td>
                        <td><s:property value="usuarioEstado"/></td>
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

<br>
<div class="col-lg-12">
    <center><s:a action="usuarioNuevo" cssClass="btn btn-default" >Nuevo Usuario</s:a></center>
    <br><br><br>
</div>

