<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVA SOLICITUD DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form action="solicitudGuardar" method="post" onsubmit="return validarFormulario()">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Unidad Solicitante:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select id="unidad" headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosDeptosInstitucion}" listKey="%{deptoInstitucionId}" listValue="%{deptoInstitucionNombre}"
                          name="deptoInstitucionId" cssStyle="width: 100%"></s:select>
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
            <div class="col-lg-2">
                <s:select id="tipo" headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosTipoSolicitudes}" listKey="%{tipoSolicitudId}" listValue="%{tipoSolicitudNombre}"
                          name="tipoSolicitudId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-6">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Código:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield id="codigo" name="nuevaSolicitud.solicitudCodigo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield id="fecha" name="nuevaSolicitud.solicitudFecha" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Responsable:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield id="responsable" name="nuevaSolicitud.solicitudReponsable" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Observación:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textarea id="observacion" name="nuevaSolicitud.solicitudObservacion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
            
        <br/><br/><br/><br/><br/>
            
        <<div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1" align="center">
                <b>Cantidad</b>
            </div>
            <div class="col-lg-5" align="center">
                <b>Producto</b>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        <br/>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:textfield name="nuevoDetalleSolicitud.detSolicitudCantidad" cssClass="form-control" cssStyle="width: 100%; text-align: center"></s:textfield>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosProductosInstitucion}" listKey="%{prodInstitucionId}" listValue="%{prodInstitucionNombre}"
                          name="prodInstitucionId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-3">
                <s:submit value="+" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
        <br/><br/>
        <div class="container" style="width: 100%">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-6">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                        <th style="width: 15%"><center>Cant.</center></th>
                        <th><center>Descripción</center></th>
                    </thead>
                    <tbody>
                        <td style="color: white">.</td>
                        <td style="color: white">.</td>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-6">
            </div>
        </div>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="solicitudListado" cssClass="btn btn-default">Cancelar</s:a>
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
        
        var cmbUnidad = document.getElementById("unidad").selectedIndex;
        var cmbTipo = document.getElementById("tipo").selectedIndex;
	var txtCodigo = document.getElementById("codigo").value;
        var txtFecha = document.getElementById("fecha").value;
        var txtResponsable = document.getElementById("responsable").value;
        var txtObservacion = document.getElementById("observacion").value;
        
        if(cmbUnidad == null || cmbUnidad == 0){
			alert('AVISO: Debe seleccionar una Unidad');
			return false;
		}
        
        if(cmbTipo == null || cmbTipo == 0){
			alert('AVISO: Debe seleccionar un Tipo de Solicitud');
			return false;
		}
        
        if(txtCodigo == null || txtCodigo.length == 0 || isNaN(txtCodigo)){
			alert('AVISO: Debe ingresar un Codigo de Solicitud');
			return false;
		}
                
        if(!(/^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{2}$/.test(txtFecha))){
			alert('AVISO: Debe ingresar una Fecha válida');
			return false;
		}
        
        if(txtResponsable == null || txtResponsable.length == 0 || /^\s+$/.test(txtResponsable)){
			alert('AVISO: Debe ingresar un Responsable');
			return false;
		}
        
        if(txtObservacion == null || txtObservacion.length == 0 || /^\s+$/.test(txtObservacion)){
			alert('AVISO: Debe ingresar una Observación');
			return false;
		}
        
        return true;
    }
        
</script>