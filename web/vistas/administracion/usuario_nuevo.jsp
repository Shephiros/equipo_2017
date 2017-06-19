<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVO USUARIO</center></b></h2><br>

<div class="tab-content">

    <form action="usuarioGuardar" method="post">
        
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Tipo:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosRoles}" listKey="%{rolId}" listValue="%{rolNombre}"
                          name="rolId" cssStyle="width: 50%"></s:select>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Nombre:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevoUsuario.usuarioNombre" cssClass="form-control"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Correo:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevoUsuario.usuarioCorreo" cssClass="form-control"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Teléfono:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevoUsuario.usuarioTelefono" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Usuario:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevoUsuario.usuarioUsuario" cssClass="form-control" cssStyle="width: 50%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Contraseña:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="contra" cssClass="form-control" cssStyle="width: 50%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-6" style="text-align: right">
                <s:a action="usuarioListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
    <br><br><br><br>
    </form>
</div>
