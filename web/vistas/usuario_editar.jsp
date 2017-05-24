<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Editar Usuario</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>EDITAR USUARIO</center></b></h2><br>
                        
        <div class="tab-content">
            
            <form action="usuarioEditarGuardar" method="post">
                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Tipo:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                              list="%{todosRoles}" listKey="%{rolId}" listValue="%{rolNombre}"
                              name="rolId" cssStyle="width: 30%" value="%{rolSeleccionado.rolId}"></s:select>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Nombre:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:textfield name="usuarioSeleccionado.usuarioNombre" cssClass="form-control"></s:textfield>
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
                        <s:textfield name="usuarioSeleccionado.usuarioCorreo" cssClass="form-control"></s:textfield>
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
                        <s:textfield name="usuarioSeleccionado.usuarioTelefono" cssClass="form-control" cssStyle="width: 20%"></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Usuario:"></s:label>
                    </div>
                    <div class="col-lg-5">
                    <s:textfield name="usuarioSeleccionado.usuarioUsuario" cssClass="form-control" cssStyle="width: 20%" readonly="true" ></s:textfield>
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>
               
                <div class="form-row">
                    <div class="col-lg-3">
                    </div>
                    <div class="col-lg-1">
                        <s:label value="Estado:"></s:label>
                    </div>
                    <div class="col-lg-5">
                        <s:select headerKey="-1" cssClass="form-control" headerValue="Seleccionar..."
                              list="{'Activo','Inactivo'}"  
                              name="estadoUsuario" cssStyle="width: 30%" value="%{estadoUsuario}"></s:select>
                        
                    </div>
                    <div class="col-lg-3">
                    </div>
                </div>

                <br/><br/><br/>

                <div class="form-row">
                    <div class="col-lg-6">
                        <s:reset value="Cancelar" align="right" cssClass="btn btn-default"></s:reset>
                    </div>
                    <div class="col-lg-6">
                        <s:submit value="Actualizar" align="left" cssClass="btn btn-default"></s:submit>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
