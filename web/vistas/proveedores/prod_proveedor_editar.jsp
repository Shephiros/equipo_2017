<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>EDITAR PRODUCTO</center></b></h2><br>

<div class="tab-content">

    <form action="prodProveedorActualizar" method="post">

        <s:if test="(#session.rol_Nombre.equalsIgnoreCase('Administrador del Sistema')) || (#session.rol_Nombre.equalsIgnoreCase('Administrador de Institución')) || (#session.rol_Nombre.equalsIgnoreCase('Jefe de Unidad'))">
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Proveedor:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosProveedores}" listKey="%{proveedorId}" listValue="%{proveedorEmpresa}"
                          name="proveedorId" cssStyle="width: 100%" value="%{proveedorSeleccionado.proveedorId}"></s:select>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>
        </s:if>
        
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Nombre:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3" align="right">
                <s:textfield name="prodProveedorSeleccionado.prodProveedorId" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
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
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorMarca" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorModelo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorColor" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorAnio" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Area:"></s:label>
            </div>
            <div class="col-lg-1">
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorArea" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Existencias:"></s:label>
            </div>
            <div class="col-lg-1">
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorExistencias" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorBtu" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Potencia:"></s:label>
            </div>
            <div class="col-lg-1">
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorPotencia" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Voltaje:"></s:label>
            </div>
            <div class="col-lg-1">
                <s:textfield name="ProdProveedorSeleccionado.prodProveedorVoltaje" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea name="ProdProveedorSeleccionado.prodProveedorDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="prodProveedorListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
    <br><br><br><br>
    </form>
</div>
