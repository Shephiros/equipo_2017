<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVA LICITACIÓN</center></b></h2><br>

<div class="tab-content">

    <form action="licitacionGuardar" method="post" onsubmit="return validarFormulario()">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Solicitud:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:select id="solicitud" headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todasSolicitudes}" listKey="%{solicitudId}" listValue="%{solicitudCodigo}"
                          name="solicitudId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-6">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Número:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield id="numero" name="nuevaLicitacion.licitacionNumero" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Año:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield id="anio" name="nuevaLicitacion.licitacionAnio" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Inicio:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield id="inicio" name="nuevaLicitacion.licitacionInicio" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Finalización:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield id="finalizacion" name="nuevaLicitacion.licitacionFinalizacion" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea id="descripcion" name="nuevaLicitacion.licitacionDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="licitacionListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>

<script>

    function validarFormulario(){
        
        var cmbSolicitud = document.getElementById("solicitud").selectedIndex;
        var txtNumero = document.getElementById("numero").value;
	var txtAnio = document.getElementById("anio").value;
        var txtInicio = document.getElementById("inicio").value;
        var txtFinalizacion = document.getElementById("finalizacion").value;
        var txtDescripcion = document.getElementById("descripcion").value;
        
        if(cmbSolicitud == null || cmbSolicitud == 0){
			alert('AVISO: Debe seleccionar una Solicitud de Compra');
			return false;
		}
        
        if(txtNumero == null || txtNumero.length == 0 || isNaN(txtNumero)){
			alert('AVISO: Debe ingresar un Número de Licitación');
			return false;
		}
        
        if(txtAnio == null || txtAnio.length == 0 || isNaN(txtAnio)){
			alert('AVISO: Debe ingresar el Año de Licitación');
			return false;
		}
                
        if(!(/^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{2}$/.test(txtInicio))){
			alert('AVISO: Debe ingresar una Fecha de Inicio Válida');
			return false;
		}
        
        if(!(/^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{2}$/.test(txtFinalizacion))){
			alert('AVISO: Debe ingresar una Fecha de Finalización Válida');
			return false;
		}
                
        if(txtDescripcion == null || txtDescripcion.length == 0 || /^\s+$/.test(txtDescripcion)){
			alert('AVISO: Debe ingresar una Descripción');
			return false;
		}
        
        return true;
    }
        
</script>