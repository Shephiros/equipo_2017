<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>APROBACIÓN DE SOLICITUD DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form action="aprobacionGuardar" method="post">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Unidad Solicitante:"></s:label>
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
            <div class="col-lg-6">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                        <th><center>Cant.</center></th>
                        <th><center>Descripción</center></th>
                    </thead>
                    <tbody>
                        <s:iterator value="todosDetalleSolicitudes" var="dato" status="estado">
                            <tr>
                                <td><center><s:property value="detSolicitudCantidad"/></center></td>
                                <td><s:property value="detSolicitudDescripcion"/></td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevoAprobado.aprobadoFecha" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3" align="right">
                <s:textfield name="solicitudSeleccionada.solicitudId" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
            </div>
        </div>
        
        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Responsable:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevoAprobado.aprobadoResponsable" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        
        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Observaciones:"></s:label>
            </div>
            <div class="col-lg-5">
            <s:textarea name="nuevoAprobado.aprobadoObservaciones" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        
        <br/><br/><br/><br/><br/><br/>
        
        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="solicitudVer" cssClass="btn btn-default">
                    <s:param name="solicitudId" value="solicitudSeleccionada.solicitudId"/>Cancelar
                </s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>