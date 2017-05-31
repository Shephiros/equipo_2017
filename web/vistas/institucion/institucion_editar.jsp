<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>EDITAR INSTITUCIÓN</center></b></h2><br>

<div class="tab-content">

    <form action="institucionActualizar" method="post">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Id:"></s:label>
                </div>
                <div class="col-lg-5">
                <s:textfield name="institucionSeleccionada.institucionId" cssClass="form-control" cssStyle="width: 10%"></s:textfield>
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
                <s:textfield name="institucionSeleccionada.institucionNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-1">
                <s:label value="Encargado:"></s:label>
                </div>
                <div class="col-lg-5">
                <s:textfield name="institucionSeleccionada.institucionEncargado" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="institucionSeleccionada.institucionTelefono" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
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
                <s:textarea name="institucionSeleccionada.institucionDireccion" rows="2" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
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
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosMunicipios}" listKey="%{municipioId}" listValue="%{municipioNombre}"
                          name="municipioId" cssStyle="width: 50%" value="%{municipioSeleccionado.municipioId}"></s:select>
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
                <s:textarea name="institucionSeleccionada.institucionDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/><br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-6" style="text-align: right">
                <s:a action="institucionListado" cssClass="btn btn-default">Cancelar</s:a>
                </div>
                <div class="col-lg-6">
                <s:submit value="Actualizar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
    </form>
</div>