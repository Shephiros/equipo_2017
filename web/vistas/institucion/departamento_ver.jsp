<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE DEPARTAMENTO</center></b></h2><br>

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
                <s:label value="Departamento:"></s:label>
                </div>
                <div class="col-lg-5">
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionNombre" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionJefe" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionTelefono" cssClass="form-control" disabled="true" cssStyle="width: 20%"></s:textfield>
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
                <s:textarea name="deptoInstitucionSeleccionado.deptoInstitucionDescripcion" rows="4" cssClass="form-control" disabled="true" cssStyle="width: 100%"></s:textarea>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/><br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-12">
                    <center>
                    <s:a action="departamentoListado" cssClass="btn btn-default">Regresar</s:a>
                </center>
            </div>
        </div>
    </form>
</div>