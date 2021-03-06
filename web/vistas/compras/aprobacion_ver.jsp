<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>INFORMACIÓN DE APROBACIÓN DE SOLICITUD DE COMPRA</center></b></h2><br>

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

        <div class="container" style="width: 100%">
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
        
        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Fecha:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="aprobadoSeleccionado.aprobadoFecha" cssClass="form-control" readonly="true" cssStyle="width: 20%"></s:textfield>
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
                <s:textfield name="aprobadoSeleccionado.aprobadoResponsable" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textfield>
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
                <s:textarea name="aprobadoSeleccionado.aprobadoObservaciones" rows="4" cssClass="form-control" readonly="true" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        
        <br/><br/><br/><br/><br/><br/>
        
        <div class="form-group">
            <div class="col-lg-12" align="center">
                <s:a action="solicitudVer" cssClass="btn btn-default">Regresar
                    <s:param name="solicitudId" value="solicitudSeleccionada.solicitudId"/>
                </s:a>
            </div>
        </div>
        <br/><br/><br/><br/>
    </form>
</div>