<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVO CONTRATO DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-2">
                <s:label value="Factura de Compra:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="compraSeleccionada.compraFactura" cssClass="form-control" disabled="true" cssStyle="width: 30%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-2">
                <s:label value="Contrato No.:"></s:label>
            </div>
            <div class="col-lg-1">
            </div>
            <div class="col-lg-1">
            </div>
            <div class="col-lg-1" align="right">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-1">
                <s:textfield name="contratoSeleccionado.contratoFecha" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-2">
                <s:label value="Responsable UACI:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="contratoSeleccionado.contratoRespUaci" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-2">
                <s:label value="Responsable Proveedor:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="contratoSeleccionado.contratoRespProveedor" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-2">
                <s:label value="Responsable Unidad:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textfield name="contratoSeleccionado.contratoRespDepto" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-2">
                <s:label value="Observación:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:textarea name="contratoSeleccionado.contratoObservacion" rows="4" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-12" align="center">
                <s:a action="contratoListado" cssClass="btn btn-default">Regresar</s:a>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>