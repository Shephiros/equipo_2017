<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVO PROVEEDOR</center></b></h2><br>

<div class="tab-content">

    <form action="procedProveedorGuardar" method="post">
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Empresa:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoProveedor.proveedorEmpresa" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
        </div>

        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Contacto:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoProveedor.proveedorContacto" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
        </div>

        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Municipio:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosMunicipios}" listKey="%{municipioId}" listValue="%{municipioNombre}"
                          name="municipioId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-4">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Nombre:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoUsuario.usuarioNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-5">
            </div>
        </div>

        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Correo:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoUsuario.usuarioCorreo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-5">
            </div>
        </div>

        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Usuario:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoUsuario.usuarioUsuario" cssClass="form-control" cssStyle="width: 50%"></s:textfield>
            </div>
            <div class="col-lg-5">
            </div>
        </div>

        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Contraseña:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoUsuario.usuarioContrasenia" cssClass="form-control" cssStyle="width: 50%"></s:textfield>
            </div>
            <div class="col-lg-5">
            </div>
        </div>

        <br/><br/><br/>
        
        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="proveedorListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
    </form>
    <br><br><br><br>
</div>
