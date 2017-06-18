<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>EDITAR UNIDAD INSTITUCIONAL</center></b></h2><br>

<div class="tab-content">

    <form action="departamentoActualizar" method="post">

        <s:if test="(#session.rol_Nombre.equalsIgnoreCase('Administrador del Sistema')) || (#session.rol_Nombre.equalsIgnoreCase('Proveedor'))">
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Institución:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="0" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todasInstituciones}" listKey="%{institucionId}" listValue="%{institucionNombre}"
                          name="institucionId" cssStyle="width: 100%" value="%{institucionSeleccionada.institucionId}"></s:select>
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
                <s:label value="Unidad:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3" align="right">
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionId" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
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
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionTelefono" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
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
        <br/><br/><br/><br/><br/>
    </form>
</div>