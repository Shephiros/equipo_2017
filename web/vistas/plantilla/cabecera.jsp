<%@taglib  prefix="s" uri="/struts-tags" %>

<nav class="navbar navbar-inverse" style="background-color: #122b40; font-size: 12pt;">
    <div class="container-fluid">
        <!-- Botón Inicio -->
        <div class="navbar-header">
            <a class="navbar-brand" href="inicio" style="color: white"><b>INICIO</b></a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <!-- Módulo Administración -->
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Administración<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <s:if test="#session.menu[1]"><li><a href="<s:url action="usuarioListado"/>">Listado de usuarios</a></s:if>
                        <s:if test="#session.menu[2]"><li><s:a action="usuarioNuevo">Nuevo usuario</s:a></s:if>
                        <li role="separator" class="divider"></li>
                        <s:if test="#session.menu[5]"><li><s:a action="rolListado">Roles</s:a></s:if>
                        <s:if test="#session.menu[6]"><li><s:a action="pantallaListado">Pantallas</s:a></s:if>
                        <s:if test="#session.menu[8]"><li><s:a action="permisoListado">Permisos</s:a></s:if>
                        <li role="separator" class="divider"></li>
                        <s:if test="#session.menu[10]"><li><s:a action="bitacoraListado">Bitácora de movimientos</s:a></s:if>
                    </ul>
                </li>
            </ul>

                <!-- Módulo Institución -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Institución<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <s:if test="#session.menu[11]"><li><s:a action="institucionListado">Listado de instituciones</s:a></s:if>
                            <s:if test="#session.menu[12]"><li><s:a action="institucionNuevo">Nueva institución</s:a></s:if>
                            <s:if test="#session.menu[15]"><li><s:a action="departamentoListado">Listado de departamentos</s:a></s:if>
                            <s:if test="#session.menu[16]"><li><s:a action="departamentoNuevo">Nuevo departamento</s:a></s:if>
                            <s:if test="#session.menu[19]"><li><s:a action="prodInstitucionListado">Catálogo de equipo</s:a></s:if>
                            <s:if test="#session.menu[20]"><li><s:a action="prodInstitucionNuevo">Nuevo equipo</s:a></s:if>
                        </ul>
                    </li>
                </ul>
                <s:if test="#session.rol_Nombre.equalsIgnoreCase('Administrador del Sistema')">
                </s:if>
                
                <!-- Módulo Proveedores -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Proveedores<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <s:if test="#session.menu[23]"><li><s:a action="proveedorListado">Listado de proveedores</s:a></s:if>
                            <s:if test="#session.menu[24]"><li><s:a action="proveedorNuevo">Nuevo proveedor</s:a></s:if>
                            <s:if test="#session.menu[29]"><li><s:a action="prodProveedorListado">Listado de productos</s:a></s:if>
                            <s:if test="#session.menu[30]"><li><s:a action="prodProveedorNuevo">Nuevo producto</s:a></s:if>
                        </ul>
                    </li>
                </ul>

                <!-- Módulo Compras -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Compras<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <s:if test="#session.menu[39]"><li><s:a action="compraListado">Listado de compras</s:a></s:if>
                            <s:if test="#session.menu[40]"><li><s:a action="compraNuevo">Nueva compra</s:a></s:if>
                            <li><s:a action="menu">Contratos</s:a>
                            <s:if test="#session.menu[36]"><li><s:a action="licitacionListado">Listado de Licitaciones</s:a></s:if>
                            <s:if test="#session.menu[37]"><li><s:a action="menu">Nueva Licitación</s:a></s:if>
                            <li><s:a action="menu">Garantías</s:a>
                            <s:if test="#session.menu[33]"><li><s:a action="solicitudListado">Listado de Solicitudes</s:a></s:if>
                            <s:if test="#session.menu[34]"><li><s:a action="solicitudNuevo">Nueva Solicitud</s:a></s:if>
                        </ul>
                    </li>
                </ul>

                <!-- Módulo Equipo -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Equipo<span class="caret"></span></a>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white"><s:property value="#session.usuario"/> (<s:property value="#session.rol_Nombre"/>) <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Mi perfil</a></li>
                        <li><a href="#">Cambiar contraseña</a></li>
                        <li role="separator" class="divider"></li>
                        <li><s:a action="salir">Cerrar sesión</s:a></li>
                    </ul>
                </li>
            </ul>
            <!-- Nombre del Usuario -->
            <ul class="nav navbar-nav navbar-right">
                <a href="#" class="navbar-brand" data-toggle="dropdown" role="button" aria-haspopup="false" aria-expanded="false" style="color: white"></a>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>