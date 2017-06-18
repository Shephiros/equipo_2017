<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVA SOLICITUD DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form action="solicitudActualizar" method="post">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Unidad Solicitante:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosDeptosInstitucion}" listKey="%{deptoInstitucionId}" listValue="%{deptoInstitucionNombre}"
                          name="deptoInstitucionId" cssStyle="width: 100%" value="%{deptoInstitucionSeleccionado.deptoInstitucionId}"></s:select>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Tipo:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosTipoSolicitudes}" listKey="%{tipoSolicitudId}" listValue="%{tipoSolicitudNombre}"
                          name="tipoSolicitudId" cssStyle="width: 100%" value="%{tipoSolicitudesSeleccionado.tipoSolicitudId}"></s:select>
            </div>
            <div class="col-lg-6" align="right">
                <s:textfield name="solicitudSeleccionada.solicitudId" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Código:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="solicitudSeleccionada.solicitudCodigo" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="solicitudSeleccionada.solicitudFecha" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
                <s:textfield name="solicitudSeleccionada.solicitudEstado" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
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
                <s:textfield name="solicitudSeleccionada.solicitudReponsable" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Observación:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textarea name="solicitudSeleccionada.solicitudObservacion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
            
        <br/><br/><br/><br/><br/>
            
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1" align="center">
                <b>Cantidad</b>
            </div>
            <div class="col-lg-5" align="center">
                <b>Producto</b>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        <br/>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:textfield name="nuevoDetalleSolicitud.detSolicitudCantidad" cssClass="form-control" cssStyle="width: 100%; text-align: center"></s:textfield>
            </div>
            <div class="col-lg-5">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todosProductosInstitucion}" listKey="%{prodInstitucionId}" listValue="%{prodInstitucionNombre}"
                          name="prodInstitucionId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-3">
                <s:submit value="+" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
        <br/><br/>

        <div class="container" style="width: 100%">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-6">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                    <th style="width: 15%"><center>Cant.</center></th>
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
            <div class="col-lg-6">
            </div>
        </div>
        
        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="solicitudListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:a action="solicitudListado" cssClass="btn btn-default">Guardar</s:a>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>
            

