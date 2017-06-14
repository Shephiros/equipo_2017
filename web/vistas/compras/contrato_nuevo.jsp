<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVO CONTRATO DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form action="contratoGuardar" method="post">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-2">
                <s:label value="Factura de Compra:"></s:label>
            </div>
            <div class="col-lg-4">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todasCompras}" listKey="%{compraId}" listValue="%{CompraFactura}"
                          name="compraId" cssStyle="width: 30%"></s:select>
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
                <s:textfield name="nuevoContrato.contratoFecha" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="nuevoContrato.contratoRespUaci" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="nuevoContrato.contratoRespProveedor" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="nuevoContrato.contratoRespDepto" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea name="nuevoContrato.contratoObservacion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="contratoListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>