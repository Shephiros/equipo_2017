<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<h2 style="color: navy"><b><center>NUEVO EQUIPO</center></b></h2><br>

<div class="tab-content">
    <form action="equipoGuardarPro" method="post">
        <div class="form-row">
            <div class="col-lg-3"></div>
            <div class="col-lg-1"><s:label value="Compra:"></s:label></div>
            <div class="col-lg-2">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="%{todasCompras}" listKey="%{compraId}" listValue="%{compraSolicitudCodigo}"
                          name="compraId" cssStyle="width: 100%"></s:select>
            </div>
            <div class="col-lg-6"></div>
        </div>
            
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-3"></div>
            <div class="col-lg-1"><s:label value="Nombre:"></s:label></div>
            <div class="col-lg-5">
                <s:textfield name="nuevoEquipo.equipoNombre" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-3"></div>
        </div>
            
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-3"></div>
            <div class="col-lg-1"><s:label value="Marca"></s:label></div>
            <div class="col-lg-2">
                <s:textfield name="nuevoEquipo.equipoMarca" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
                <div class="col-lg-1"><s:label value="Modelo"></s:label></div>
            <div class="col-lg-2">
                <s:textfield name="nuevoEquipo.equipoModelo" cssClass="form-control" cssStyle="width: 100%"></s:textfield> 
            </div>
            <div class="col-lg-3"></div>
        </div>
        
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-3"></div>
            <div class="col-lg-1">
                <s:label value="Año de fabricación:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevoEquipo.equipoAnioFabricacion" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-1">
                <s:label value="BTU"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevoEquipo.equipoBtu" cssClass="form-control" cssStyle="width: 100%"></s:textfield>    
            </div>
            <div class="col-lg-3"></div>
        </div>
        
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-3"></div>
            <div class="col-lg-1">
                <s:label value="Potencia:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevoEquipo.equipoPotencia" cssClass="form-control" cssStyle="width: 100%"></s:textfield>
            </div>
            <div class="col-lg-6"></div>
        </div>    
            
        <br/><br/><br/>
        
        <div class="form-row">
            <div class="col-lg-3"></div>
            <div class="col-lg-1">
                <s:label value="Estado:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                          list="{'Activo','Inactivo'}"  
                          name="estadoE" cssStyle="width: 100%" value="%{estadoE}"></s:select>
            </div>
            <div class="col-lg-1">
                <s:label value="Fecha de mantenimiento:"></s:label>
            </div>
            <div class="col-lg-2">
                <s:textfield name="nuevoEquipo.equipoMantenimiento" cssClass="form-control" cssStyle="width: 100%"></s:textfield>    
            </div>
            <div class="col-lg-3"></div>
        </div>
        
        <br/><br/><br/><br/>

        <div class="form-group">
            <div class="col-lg-6" align="right">
                <s:a action="equipoListado" cssClass="btn btn-default">Cancelar</s:a>
            </div>
            <div class="col-lg-6">
                <s:submit value="Guardar" align="left" cssClass="btn btn-default"></s:submit>
            </div>
        </div>
        <br/><br/><br/><br/>
        
    </form>
</div>