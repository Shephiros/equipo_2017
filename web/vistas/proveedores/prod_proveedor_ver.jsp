<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE PRODUCTO</center></b></h2><br>

<div class="tab-content">

    <form>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Nombre:"></s:label>
                </div>
                <div class="col-lg-5">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorNombre" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-1">
                <s:label value="Marca:"></s:label>
                </div>
                <div class="col-lg-3">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorMarca" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-5">
                </div>
            </div>

            <br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-1">
                <s:label value="Modelo:"></s:label>
                </div>
                <div class="col-lg-3">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorModelo" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-5">
                </div>
            </div>

            <br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-1">
                <s:label value="Color:"></s:label>
                </div>
                <div class="col-lg-3">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorColor" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-5">
                </div>
            </div>

            <br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-1">
                <s:label value="Año:"></s:label>
                </div>
                <div class="col-lg-1">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorAnio" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-1" style="text-align: right">
                <s:label value="Area:"></s:label>
                </div>
                <div class="col-lg-1">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorArea" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-1" style="text-align: right">
                <s:label value="Existencias:"></s:label>
                </div>
                <div class="col-lg-1">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorExistencias" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-1">
                <s:label value="BTU:"></s:label>
                </div>
                <div class="col-lg-1">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorBtu" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-1" style="text-align: right">
                <s:label value="Potencia:"></s:label>
                </div>
                <div class="col-lg-1">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorPotencia" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-1" style="text-align: right">
                <s:label value="Voltaje:"></s:label>
                </div>
                <div class="col-lg-1">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorVoltaje" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea name="prodProveedorSeleccionado.prodProveedorDescripcion" rows="4" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/><br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-12">
                    <center>
                    <s:a action="prodProveedorListado" cssClass="btn btn-default">Regresar</s:a>
                </center>
            </div>
        </div>
    </form>
    <br><br><br><br><br>
</div>
