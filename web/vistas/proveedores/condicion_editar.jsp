<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>EDITAR PROVEEDOR</center></b></h2><br>

<div class="tab-content">

    <form action="condicion2Actualizar" method="post">
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Empresa:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="proveedorSeleccionado.proveedorEmpresa" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3" align="right">
                <s:textfield name="proveedorSeleccionado.proveedorId" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="N.I.T.:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="proveedorSeleccionado.proveedorNit" cssClass="form-control" readonly="true" cssStyle="width: 35%"></s:textfield>
            </div>
            <div class="col-lg-3" align="right">
                <s:textfield name="condicionSeleccionada.id.proveedorId" cssClass="form-control" cssStyle="color:white; border-color: white; width:100%"></s:textfield>
                <s:textfield name="condicionSeleccionada.id.institucionId" cssClass="form-control" cssStyle="color:white; border-color: white; width:100%"></s:textfield>
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Instalación:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="0" cssClass="form-control" headerValue="Seleccionar..."
                          list="{'Permite instalación','No permite instalación'}"  
                          name="condicionInstalacion" cssStyle="width: 35%" value="%{condicionInstalacion}"></s:select>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Límite de compra:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="condicionSeleccionada.condicionLimite" cssClass="form-control" cssStyle="width: 35%; text-align: right"></s:textfield>
            </div>
            <div class="col-lg-3">
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
        <br/><br/><br/><br/><br/>
    </form>
</div>
