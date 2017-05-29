<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Información de Equipo</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>INFORMACIÓN DE EQUIPO</center></b></h2><br>
                        
        <div class="tab-content">
            
            <form>
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

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Nombre:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="prodInstitucionSeleccionado.prodInstitucionNombre" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                        <s:textarea name="prodInstitucionSeleccionado.prodInstitucionDescripcion" rows="4" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/><br/><br/><br/>
                
                <div class="form-row">
                    <div class="col-lg-12">
                        <center>
                            <s:a action="prodInstitucionListado" cssClass="btn btn-default">Regresar</s:a>
                        </center>
                    </div>
                </div>
            </form>
        </div>
    <script src="${pageContext.request.contextPath}/recursos/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>