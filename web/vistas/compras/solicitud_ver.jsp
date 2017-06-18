<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE SOLICITUD DE COMPRA</center></b></h2><br>

<div class="tab-content">

    <form>
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Unidad Solicitante:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="deptoInstitucionSeleccionado.deptoInstitucionNombre" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textfield name="tipoSolicitudesSeleccionado.tipoSolicitudNombre" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Estado:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="(solicitudSeleccionada.solicitudEstado == 0) ?'En proceso de aprobación':((solicitudSeleccionada.solicitudEstado == 1) ?'Denegado':'Aprobado')" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-6">
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
                <s:textfield name="solicitudSeleccionada.solicitudCodigo" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1" style="text-align: right">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="solicitudSeleccionada.solicitudFecha" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3">
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
                <s:textfield name="solicitudSeleccionada.solicitudReponsable" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea name="solicitudSeleccionada.solicitudObservacion" rows="3" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/><br/><br/>

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
            <div class="col-lg-6">
            </div>
        </div>
        
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-12">
                <center>
                    <s:a action="solicitudListado" cssClass="btn btn-default">Regresar</s:a>
                    <s:if test="(#session.rol_Nombre.equalsIgnoreCase('Administrador de Institución') && solicitudSeleccionada.solicitudEstado == 0)">
                    <s:label> </s:label>
                    <s:a action="aprobacionNuevo" cssClass="btn btn-default">
                        <s:param name="solicitudId" value="solicitudSeleccionada.solicitudId"/>Aprobar
                    </s:a>
                    </s:if>
                    <s:if test="(#session.rol_Nombre.equalsIgnoreCase('Administrador de Institución') && solicitudSeleccionada.solicitudEstado == 0)">
                    <s:label> </s:label>
                    <s:a action="solicitudDenegar" cssClass="btn btn-default">
                        <s:param name="solicitudId" value="solicitudSeleccionada.solicitudId"/>Denegar
                    </s:a>
                    </s:if>
                    <s:if test="(solicitudSeleccionada.solicitudEstado == 10)">
                    <s:label> </s:label>
                    <s:a action="aprobacionVer" cssClass="btn btn-default">
                        <s:param name="solicitudId" value="solicitudSeleccionada.solicitudId"/>Ver Aprobación
                    </s:a>
                    </s:if>
                </center>
                <br/><br/><br/>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>