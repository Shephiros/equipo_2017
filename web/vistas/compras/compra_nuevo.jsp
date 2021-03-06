<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVA COMPRA</center></b></h2><br>

<div class="tab-content">

    <form action="compraGuardar" method="post">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Factura:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevaCompra.compraFactura" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevaCompra.compraFecha" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Proveedor:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosProveedores}" listKey="%{proveedorId}" listValue="%{proveedorEmpresa}"
                          name="proveedorId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Vendedor:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevaCompra.compraVendedor" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
            
        <s:if test="#session.rol_Nombre.equalsIgnoreCase('Administrador del Sistema')">
        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Institución:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todasInstituciones}" listKey="%{institucionId}" listValue="%{institucionNombre}"
                          name="institucionId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        </s:if>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Responsable:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevaCompra.compraResponsable" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Solicitud:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevaCompra.compraSolicitudCodigo" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/>
            
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1" align="center">
                <b>Cantidad</b>
            </div>
            <div class="col-lg-4" align="center">
                <b>Descripción</b>
            </div>
            <div class="col-lg-1" align="center">
                <b>Precio</b>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        <br/>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:textfield name="nuevoDetalleCompra.detCompraCantidad" cssClass="form-control" cssStyle="width: 100%; text-align: center"></s:textfield>
            </div>
            <div class="col-lg-4">
                <s:textfield name="nuevoDetalleCompra.detCompraDescripcion" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1">
                <s:textfield name="nuevoDetalleCompra.detCompraPrecio" cssClass="form-control" cssStyle="width: 100%; text-align: right"></s:textfield>
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
                        <th style="width: 15%"><center>Precio</center></th>
                        <th style="width: 15%"><center>Total</center></th>
                    </thead>
                    <tbody>
                        <td style="color: white">.</td>
                        <td style="color: white">.</td>
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
                <s:a action="compraListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>