<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Nuevo Producto</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>NUEVO PRODUCTO</center></b></h2><br>
                
        <div class="tab-content">
            
            <form action="prodProveedorGuardar" method="post">
                
                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Proveedor:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                              list="%{todosProveedores}" listKey="%{proveedorId}" listValue="%{proveedorNombre}"
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
                        <s:label value="Nombre:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="nuevoProdProveedor.prodProveedorNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                        <s:textfield name="nuevoProdProveedor.prodProveedorMarca" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                        <s:textfield name="nuevoProdProveedor.prodProveedorModelo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                        <s:textfield name="nuevoProdProveedor.prodProveedorColor" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                        <s:textfield name="nuevoProdProveedor.prodProveedorAnio" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-1" style="text-align: right">
                        <s:label value="Area:"></s:label>
                    </div>
                    <div class="col-lg-1">
                        <s:textfield name="nuevoProdProveedor.prodProveedorArea" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-1" style="text-align: right">
                        <s:label value="Existencias:"></s:label>
                    </div>
                    <div class="col-lg-1">
                        <s:textfield name="nuevoProdProveedor.prodProveedorExistencias" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                        <s:textfield name="nuevoProdProveedor.prodProveedorBtu" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-1" style="text-align: right">
                        <s:label value="Potencia:"></s:label>
                    </div>
                    <div class="col-lg-1">
                        <s:textfield name="nuevoProdProveedor.prodProveedorPotencia" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-1" style="text-align: right">
                        <s:label value="Voltaje:"></s:label>
                    </div>
                    <div class="col-lg-1">
                        <s:textfield name="nuevoProdProveedor.prodProveedorVoltaje" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                        <s:textarea name="nuevoProdProveedor.prodProveedorDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
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
            </form>
        </div>
    
        <script src="${pageContext.request.contextPath}/recursos/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
