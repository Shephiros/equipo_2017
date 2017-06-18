<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVA INSTITUCIÓN</center></b></h2><br>

<div class="tab-content">

    <form action="institucionGuardar" method="post" onsubmit="return validarFormulario()">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Nombre:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield id="nombre" name="nuevaInstitucion.institucionNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Encargado:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield id="encargado" name="nuevaInstitucion.institucionEncargado" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield id="telefono" name="nuevaInstitucion.institucionTelefono" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Dirección:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textarea id="direccion" name="nuevaInstitucion.institucionDireccion" rows="2" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Municipio:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select id="municipio" headerKey="0" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosMunicipios}" listKey="%{municipioId}" listValue="%{municipioNombre}"
                          name="municipioId" cssStyle="width: 50%"></s:select>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Descripción:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textarea id="descripcion" name="nuevaInstitucion.institucionDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="institucionListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        <br/><br/><br/><br/>
        </div>
    </form>
</div>
<script>

    function validarFormulario(){
        
        var txtNombre = document.getElementById("nombre").value;
        var txtEncargado = document.getElementById("encargado").value;
        var txtTelefono = document.getElementById("telefono").selectedIndex;
        var txtDireccion = document.getElementById("direccion").value;
        var cmbMunicipio = document.getElementById("municipio").selectedIndex;
        var txtDescripcion = document.getElementById("descripcion").value;
        
        if(txtNombre == null || txtNombre == 0){
			alert('AVISO: Debe ingresar un Nombre de Institución');
			return false;
		}
        
        if(txtEncargado == null || txtEncargado.length == 0 || /^\s+$/.test(txtEncargado)){
			alert('AVISO: Debe ingresar un Nombre de Encargado de Institución');
			return false;
		}
        
        if(cmbMunicipio == null || cmbMunicipio == 0){
			alert('AVISO: Debe seleccionar una Municipio');
			return false;
		}
        
        return true;
    }
        
</script>