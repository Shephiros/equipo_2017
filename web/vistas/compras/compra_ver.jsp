<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Factura:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="compraSeleccionada.compraFactura" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="compraSeleccionada.compraFecha" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="proveedorSeleccionado.proveedorEmpresa" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="compraSeleccionada.compraVendedor" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="institucionSeleccionada.institucionNombre" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="compraSeleccionada.compraResponsable" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="compraSeleccionada.compraSolicitudCodigo" cssClass="form-control" disabled="true" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-6">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                        <th><center>Cant.</center></th>
                        <th><center>Descripción</center></th>
                        <th><center>Precio</center></th>
                    </thead>
                    <tbody>
                        <s:iterator value="todosDetalleCompras" var="dato" status="estado">
                            <tr>
                                <td><center><s:property value="detCompraCantidad"/></center></td>
                                <td><s:property value="detCompraDescripcion"/></td>
                                <td><s:property value="detCompraPrecio"/></td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-6">
            </div>
        </div>
        
        <div class="form-row">
            <div class="col-lg-12">
                <center>
                    <s:a action="compraListado" cssClass="btn btn-default">Regresar</s:a>
                </center>
                <br/><br/><br/>
            </div>
        </div>
    </form>
</div>