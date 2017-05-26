<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Menú</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <nav class="navbar navbar-inverse" style="background-color: #122b40; font-size: 12pt">
            <div class="container-fluid">
                <!-- Botón Inicio -->
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">INICIO</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <!-- Módulo Administración -->
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administración<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><s:a action="usuarioListado">Listado de usuarios</s:a>
                                <li><s:a action="usuarioNuevo">Nuevo usuario</s:a>
                                <li role="separator" class="divider"></li>
                                <li><s:a action="rolListado">Roles</s:a>
                                <li><s:a action="pantallasListado">Pantallas</s:a>
                                <li><s:a action="permisosListado">Permisos</s:a>
                                <li role="separator" class="divider"></li>
                                <li><s:a action="menu">Bitácora de movimientos</s:a>
                            </ul>
                        </li>
                    </ul>
                    
                    <!-- Módulo Institución -->
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Institución<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><s:a action="institucionListado">Listado de instituciones</s:a>
                                <li><s:a action="institucionNuevo">Nueva institución</s:a>
                                <li><s:a action="departamentoListado">Listado de departamentos</s:a>
                                <li><s:a action="departamentoNuevo">Nuevo departamento</s:a>
                                <li><s:a action="prodInstitucionListado">Catálogo de equipo</s:a>
                                <li><s:a action="prodInstitucionNuevo">Nuevo equipo</s:a>
                            </ul>
                        </li>
                    </ul>
                    
                    <!-- Módulo Proveedores -->
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Proveedores<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><s:a action="proveedorListado">Listado de proveedores</s:a>
                                <li><s:a action="menu">Nuevo proveedor</s:a>
                                <li><s:a action="menu">Lisatdo de productos</s:a>
                                <li><s:a action="menu">Nuevo producto</s:a>
                            </ul>
                        </li>
                    </ul>
                    
                    <!-- Módulo Compras -->
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Compras<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><s:a action="menu">Listado de compras</s:a>
                                <li><s:a action="menu">Nueva compra</s:a>
                                <li><s:a action="menu">Contratos</s:a>
                                <li><s:a action="menu">Licitaciones</s:a>
                                <li><s:a action="menu">Garantías</s:a>
                                <li><s:a action="menu">Solicitudes</s:a>
                            </ul>
                        </li>
                    </ul>
                    
                    <!-- Módulo Equipo -->
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Equipo<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><s:a action="menu">Catálogo de equipo</s:a>
                                <li><s:a action="menu">Mantenimientos</s:a>
                                <li><s:a action="menu">Alertas</s:a>
                            </ul>
                        </li>
                    </ul>
                    
                    <!-- Módulo Perfil -->
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Mi Perfil<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Mi perfil</a></li>
                                <li><a href="#">Cambiar contraseña</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Cerrar sesión</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        
        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
        <!-- Banner inferior -->
        <footer>
            <img src="${pageContext.request.contextPath}/recursos/images/pie_pagina.jpg" class="img-rounded img-responsive" width="100%"/>
        </footer>
        
        <script src="${pageContext.request.contextPath}/recursos/js/jquery.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/recursos/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
