<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Información de Proveedor</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>INFORMACIÓN DE PROVEEDOR</center></b></h2><br>
                        
        <div class="tab-content">
            
            <form>
                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Empresa:"></s:label>
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
                        <s:label value="Contacto:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="proveedorSeleccionado.proveedorContacto" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Teléfono 1:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="proveedorSeleccionado.proveedorTelefono1" cssClass="form-control" disabled="true" cssStyle="width: 20%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Teléfono 2:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="proveedorSeleccionado.proveedorTelefono2" cssClass="form-control" disabled="true" cssStyle="width: 20%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Correo:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="proveedorSeleccionado.proveedorCorreo" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
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
                        <s:textfield name="proveedorSeleccionado.proveedorNit" cssClass="form-control" disabled="true" cssStyle="width: 30%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Dirección:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textarea name="proveedorSeleccionado.proveedorDireccion" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Municipio:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="municipioSeleccionado.municipioNombre" cssClass="form-control" disabled="true" cssStyle="width: 50%"></s:textfield>
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
                        <s:textarea name="proveedorSeleccionado.proveedorDescripcion" rows="4" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>
            
                <br/><br/><br/><br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-12">
                        <center>
                            <s:a action="proveedorListado" cssClass="btn btn-default">Regresar</s:a>
                        </center>
                    </div>
                </div>
                        
                <br/><br/><br/>
                        
            </form>
        </div>
    <script src="${pageContext.request.contextPath}/recursos/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>