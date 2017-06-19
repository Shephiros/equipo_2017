<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>PARÁMETROS REPORTE DE COMPRAS</center></b></h2><br>
<s:if test="hasActionErrors()">
    <div class="errors" style="color: red" >
        <s:actionerror/>;        
   </div>
</s:if>
<form action="repComprasGenerar" method="post">
        <div class="form-row">
            <div class="col-lg-3"/>
            </div>
            
                <s:label value="Ingrese a continuación las fechas para generar el reporte:"></s:label>
            
            <br/><br/>
             <div class="form-group" style="text-align: center">
                 <div class="col-lg-2">
                     Desde:
                 </div>
                <div class="col-lg-2">
                    <input type="date" name="fechaIni" placeholder='AAAA-MM-DD'
                                                      required cssClass="form-control" cssStyle="width: 100%">
                </div>
                 <div class="col-lg-2">
                     Hasta:
                 </div>
                <div class="col-lg-2">
                    <input type="date" name="fechaFin" placeholder='AAAA-MM-DD'
                                                     required cssClass="form-control" cssStyle="width: 100%">
                </div>
            </div>
            <div class="col-lg-3">
            </div>
        </div>
        <br/><br/><br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="paramCompras" cssClass="btn btn-default">Limpiar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Generar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        <br/><br/><br/><br/>
        </div>

        
</form>
