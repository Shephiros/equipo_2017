<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE SOLICITUD DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Unidad Solicitante:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="tipoSolicitudesSeleccionado.tipoSolicitudNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="solicitudSeleccionada.solicitudCodigo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="solicitudSeleccionada.solicitudFecha" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="solicitudSeleccionada.solicitudReponsable" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea name="solicitudSeleccionada.solicitudObservacion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-12">
                <center>
                    <s:a action="solicitudListado" cssClass="btn btn-default">Regresar</s:a>
                </center>
            </div>
        </div>
    </form>
</div>