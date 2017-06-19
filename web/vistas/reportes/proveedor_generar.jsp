<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>PARÁMETROS REPORTE DE PROVEEDORES</center></b></h2><br>
<form action="repProveedoresGenerar" method="post">
        <div class="form-row">
            <div class="col-lg-3"/>
            </div>
            <div class="col-lg-1">
                <s:label value="Departamento:"></s:label>
            </div>
            <div class="col-lg-5">
                <select cssClass="form-control" name="municipioId" cssStyle="width: 50%" required>
                    <option value="1">Ahuachapán</option>
                    <option value="2">Cabañas</option>
                    <option value="3">Chalatenango</option>
                    <option value="4">Cuscatlán</option>
                    <option value="5">La Libertad</option>
                    <option value="6">La Paz</option>
                    <option value="7">La Unión</option>
                    <option value="8">Morazán</option>
                    <option value="9">San Miguel</option>
                    <option value="10">San Salvador</option>
                    <option value="11">San Vicente</option>
                    <option value="12">Santa Ana</option>
                    <option value="13">Sonsonate</option>
                    <option value="14">Usulután</option>
                </select>
            </div>
           
            <div class="col-lg-3">
            </div>
        </div>
        <br/><br/><br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="paramProveedores" cssClass="btn btn-default">Limpiar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Generar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        <br/><br/><br/><br/>
        </div>

        
</form>
