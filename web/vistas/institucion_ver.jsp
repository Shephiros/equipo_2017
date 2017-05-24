<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Información de Institución</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>INFORMACIÓN DE INSTITUCIÓN</center></b></h2><br>
                        
        <div class="tab-content">
            
            <form>
                <div class="form-row">
                    <div class="col-lg-4">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Nombre:"></s:label>
                    </div>
                    <div class="col-lg-3">
                    <s:textfield name="institucionSeleccionada.institucionNombre" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-4">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-4">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Encargado:"></s:label>
                    </div>
                    <div class="col-lg-3">
                        <s:textfield name="institucionSeleccionada.institucionEncargado" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-4">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-4">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Teléfono:"></s:label>
                    </div>
                    <div class="col-lg-3">
                        <s:textfield name="institucionSeleccionada.institucionTelefono" cssClass="form-control" disabled="true" cssStyle="width: 30%"></s:textfield>
                    </div>
                    <div class="col-lg-4">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-4">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Dirección:"></s:label>
                    </div>
                    <div class="col-lg-3">
                        <s:textarea name="institucionSeleccionada.institucionDireccion" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
                    </div>
                    <div class="col-lg-4">
                    </div>
                </div>

                <br/><br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-4">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Municipio:"></s:label>
                    </div>
                    <div class="col-lg-3">
                        <s:textfield name="municipioSeleccionado.municipioNombre" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-4">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-4">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Descripción:"></s:label>
                    </div>
                    <div class="col-lg-3">
                    <s:textarea name="institucionSeleccionada.institucionDescripcion" rows="4" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
                    </div>
                    <div class="col-lg-4">
                    </div>
                </div>
            
                <br/><br/><br/><br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-12">
                        <center>
                        <s:a action="institucionListado" cssClass="btn btn-default">Regresar</s:a>
                        </center>
                    </div>
                </div>
            </form>
        </div>
    <script src="${pageContext.request.contextPath}/recursos/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>