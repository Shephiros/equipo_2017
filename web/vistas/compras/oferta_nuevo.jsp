<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVA OFERTA</center></b></h2><br>

<div class="tab-content">

    <form action="ofertaGuardar" method="post">

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Licitación:"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="licitacionSeleccionada.licitacionNumero" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3" align="right">
                <s:textfield name="licitacionSeleccionada.licitacionId" cssClass="form-control" cssStyle="color:white; border-color: white; width:0%"></s:textfield>
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
            <s:textarea name="nuevaOferta.ofertaDescripcion" rows="4" cssClass="form-control" cssStyle="width: 100%"></s:textarea>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
            
        <br/><br/><br/><br/><br/><br/>

        <div class="form-row">
            <div class="col-lg-3">
            </div>
            <div class="col-lg-1">
                <s:label value="Precio($):"></s:label>
            </div>
            <div class="col-lg-5">
                <s:textfield name="nuevaOferta.ofertaPrecio" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
            </div>
            <div class="col-lg-3">
            </div>
        </div>

        <br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="licitacionVer" cssClass="btn btn-default">Cancelar
                    <s:param name="licitacionId" value="licitacionSeleccionada.licitacionId"/>
                </s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
    </form>
</div>