<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Editar Departamento</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>EDITAR DEPARTAMENTO</center></b></h2><br>
                        
        <div class="tab-content">
            
            <form action="departamentoActualizar" method="post">
                
                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Id:"></s:label>
                    </div>
                    <div class="col-lg-5">
                    <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionId" cssClass="form-control" cssStyle="width: 10%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Municipio:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                              list="%{todasInstituciones}" listKey="%{institucionId}" listValue="%{institucionNombre}"
                              name="institucionId" cssStyle="width: 100%" value="%{institucionSeleccionada.institucionId}"></s:select>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Departamento:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Jefe:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionJefe" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Teléfono:"></s:label>
                    </div>
                    <div class="col-lg-5">
                    <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionTelefono" cssClass="form-control" cssStyle="width: 30%"></s:textfield>
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
                    <s:textarea name="deptoInstitucionSeleccionado.deptoInstitucionDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/><br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-6" style="text-align: right">
                        <s:a action="departamentoListado" cssClass="btn btn-default">Cancelar</s:a>
                    </div>
                    <div class="col-lg-6">
                        <s:submit value="Actualizar" align="left" cssClass="btn btn-default"></s:submit>
                    </div>
                </div>
            </form>
        </div>
    <script src="${pageContext.request.contextPath}/recursos/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
