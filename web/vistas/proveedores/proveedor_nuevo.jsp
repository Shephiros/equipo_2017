<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVO PROVEEDOR</center></b></h2><br>

<div class="tab-content">

    <form action="proveedorGuardar" method="post">
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Empresa:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoProveedor.proveedorEmpresa" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1">
                <s:label value="Teléfono 1:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevoProveedor.proveedorTelefono1" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-2">
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
            <div class="col-lg-1">
                <s:label value="Teléfono 2:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevoProveedor.proveedorTelefono2" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-2">
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
                <s:textfield name="nuevoProveedor.proveedorCorreo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1">
                <s:label value="N.I.T.:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevoProveedor.proveedorNit" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-2">
            </div>
        </div>

        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Dirección:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textarea name="nuevoProveedor.proveedorDireccion" rows="2" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-1">
                <s:label value="Municipio:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosMunicipios}" listKey="%{municipioId}" listValue="%{municipioNombre}"
                          name="municipioId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-2">
            </div>
        </div>

        <br/><br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-1">
                <s:label value="Descripción:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textarea name="nuevoProveedor.proveedorDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-5">
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
                <s:label value="Teléfono:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoUsuario.usuarioTelefono" cssClass="form-control" cssStyle="width: 25%"></s:textfield>
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
