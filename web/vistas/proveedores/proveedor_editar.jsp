<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>EDITAR PROVEEDOR</center></b></h2><br>

<div class="tab-content">

    <form action="proveedorActualizar" method="post">
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Empresa:"></s:label>
                </div>
                <div class="col-lg-5">
                <s:textfield name="proveedorSeleccionado.proveedorEmpresa" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/>

            <div class="form-row">
                <div class="col-lg-3">
                </div>
                <div class="col-lg-1">
                <s:label value="Id:"></s:label>
                </div>
                <div class="col-lg-5">
                <s:textfield name="proveedorSeleccionado.proveedorId" cssClass="form-control" cssStyle="width: 10%"></s:textfield>
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
                <s:textfield name="proveedorSeleccionado.proveedorContacto" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="proveedorSeleccionado.proveedorTelefono1" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
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
                <s:textfield name="proveedorSeleccionado.proveedorTelefono2" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
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
                <s:textfield name="proveedorSeleccionado.proveedorCorreo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="proveedorSeleccionado.proveedorNit" cssClass="form-control" cssStyle="width: 30%"></s:textfield>
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
                <s:textarea name="proveedorSeleccionado.proveedorDireccion" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
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
                          name="municipioId" cssStyle="width: 100%" value="%{municipioSeleccionado.municipioId}"></s:select>
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
                <s:textarea name="proveedorSeleccionado.proveedorDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
                </div>
                <div class="col-lg-3">
                </div>
            </div>

            <br/><br/><br/><br/><br/><br/>

            <div class="form-group">
                <div class="col-lg-6" align="right">
                <s:a action="proveedorListado" cssClass="btn btn-default">Cancelar</s:a>
                </div>
                <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>

        <br/><br/><br/><br/><br/>

    </form>
</div>
