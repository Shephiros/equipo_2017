<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE USUARIO</center></b></h2><br>

<div class="tab-content">

    <form>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Usuario:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="usuarioSeleccionado.usuarioUsuario" cssClass="form-control" readonly="true" cssStyle="width: 50%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Tipo:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="rolSeleccionado.rolNombre" cssClass="form-control" readonly="true" cssStyle="width: 50%"></s:textfield>
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
                <s:textfield name="usuarioSeleccionado.usuarioNombre" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="usuarioSeleccionado.usuarioCorreo" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="usuarioSeleccionado.usuarioTelefono" cssClass="form-control" readonly="true" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Estado:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="(usuarioSeleccionado.usuarioEstado==0)?'Inactivo':'Activo'" cssClass="form-control" readonly="true" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-12">
                <center>
                    <s:a action="usuarioListado" cssClass="btn btn-default">Regresar</s:a>
                </center>
            </div>
        </div>
    <br/><br/><br/><br/><br/>
    </form>
</div>
    