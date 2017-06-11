<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE LICITACIÓN</center></b></h2><br>

<div class="tab-content">

    <form>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Solicitud:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="solicitudSeleccionada.solicitudCodigo" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="licitacionSeleccionada.licitacionNumero" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Año:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="licitacionSeleccionada.licitacionAnio" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="licitacionSeleccionada.licitacionInicio" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Finalización:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="licitacionSeleccionada.licitacionFinalizacion" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea name="licitacionSeleccionada.licitacionDescripcion" rows="4" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/>
                
        <s:if test="!(#session.rol_Nombre.equalsIgnoreCase('Proveedor'))">
        <div class="form-row">
            <div class="col-lg-12">
                <center>
                    <s:a action="licitacionListado" cssClass="btn btn-default">Regresar</s:a>
                </center>
                <br/><br/><br/>
            </div>
        </div>
        </s:if>
        <s:if test="#session.rol_Nombre.equalsIgnoreCase('Proveedor')">
        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="licitacionListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:a action="ofertaNuevo" cssClass="btn btn-default">Ofertar</s:a>
            </div>
        </div>
        </s:if>
    </form>
</div>