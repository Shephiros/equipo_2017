<%@taglib  prefix="s" uri="/struts-tags" %>

<nav class="navbar navbar-inverse" style="background-color: #122b40; font-size: 12pt;">
    <div class="container-fluid">
        <!-- Bot�n Inicio -->
        <div class="navbar-header">
            <a class="navbar-brand" href="inicio" style="color: white"><b>INICIO</b></a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <s:if test="#session.menu[1] || #session.menu[2] || #session.menu[5] || #session.menu[6] || #session.menu[9] || #session.menu[10]">
            <!-- M�dulo Administraci�n -->
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Administraci�n<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <s:if test="#session.menu[1]"><li><a href="<s:url action="usuarioListado"/>">Listado de usuarios</a></s:if>
                        <s:if test="#session.menu[2]"><li><s:a action="usuarioNuevo">Nuevo usuario</s:a></s:if>
                        <li role="separator" class="divider"></li>
                        <s:if test="#session.menu[5]"><li><s:a action="rolListado">Roles</s:a></s:if>
                        <s:if test="#session.menu[6]"><li><s:a action="pantallaListado">Pantallas</s:a></s:if>
                        <s:if test="#session.menu[9]">
                        <li role="separator" class="divider"></li>
                        <li class="dropdown-header">Gesti�n de Permisos</li>
                        <li><s:a action="permisoListado">Administrador de Instituci�n<s:param name="rolId" value="2"/></s:a>
                        <li><s:a action="permisoListado">Jefe de Unidad<s:param name="rolId" value="3"/></s:a>
                        <li><s:a action="permisoListado">Proveedor<s:param name="rolId" value="4"/></s:a>
                        </s:if>
                        <s:if test="#session.menu[10]">
                        <li role="separator" class="divider"></li>
                        <li><s:a action="bitacoraListado">Bit�cora de movimientos</s:a>
                        </s:if>
                    </ul>
                </li>
            </ul>
            </s:if>

                <s:if test="#session.menu[11] || #session.menu[12] || #session.menu[15] || #session.menu[16] || #session.menu[19] || #session.menu[20]">
                <!-- M�dulo Instituci�n -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Instituci�n<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <s:if test="#session.menu[11]"><li><s:a action="institucionListado">Listado de Instituciones</s:a></s:if>
                            <s:if test="#session.menu[12]"><li><s:a action="institucionNuevo">Nueva Instituci�n</s:a></s:if>
                            <s:if test="#session.menu[15]"><li><s:a action="departamentoListado">Listado de Unidades</s:a></s:if>
                            <s:if test="#session.menu[16]"><li><s:a action="departamentoNuevo">Nueva Unidad</s:a></s:if>
                            <s:if test="#session.menu[19]"><li><s:a action="prodInstitucionListado">Cat�logo de Equipos</s:a></s:if>
                            <s:if test="#session.menu[20]"><li><s:a action="prodInstitucionNuevo">Nuevo Equipo</s:a></s:if>
                        </ul>
                    </li>
                </ul>
                </s:if>
                <s:if test="#session.rol_Nombre.equalsIgnoreCase('Administrador del Sistema')">
                </s:if>
                
                <s:if test="#session.menu[23] || #session.menu[24] || #session.menu[28] || #session.menu[29]">
                <!-- M�dulo Proveedores -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Proveedores<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <s:if test="#session.menu[23]"><li><s:a action="proveedorListado">Listado de Proveedores</s:a></s:if>
                            <s:if test="#session.menu[24]"><li><s:a action="proveedorNuevo">Nuevo Proveedor</s:a></s:if>
                            <s:if test="#session.menu[28]"><li><s:a action="prodProveedorListado">Listado de Productos</s:a></s:if>
                            <s:if test="#session.menu[29]"><li><s:a action="prodProveedorNuevo">Nuevo Producto</s:a></s:if>
                            <li><s:a action="procedProveedorNuevo">Nuevo Proveedor Procedimiento</s:a>
                        </ul>
                    </li>
                </ul>
                </s:if>
                
                <s:if test="#session.menu[33] || #session.menu[34] || #session.menu[36] || #session.menu[37] || #session.menu[39] || #session.menu[40]">
                <!-- M�dulo Compras -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Compras<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <s:if test="#session.menu[32]"><li><s:a action="solicitudListado">Listado de Solicitudes</s:a></s:if>
                            <s:if test="#session.menu[33]"><li><s:a action="solicitudNuevo">Nueva Solicitud</s:a></s:if>
                            <s:if test="#session.menu[38]"><li><s:a action="licitacionListado">Listado de Licitaciones</s:a></s:if>
                            <s:if test="#session.menu[39]"><li><s:a action="licitacionNuevo">Nueva Licitaci�n</s:a></s:if>
                            <s:if test="#session.menu[42]"><li><s:a action="compraListado">Listado de compras</s:a></s:if>
                            <s:if test="#session.menu[43]"><li><s:a action="compraNuevo">Nueva compra</s:a></s:if>
                            <s:if test="#session.menu[46]"><li><s:a action="contratoListado">Contratos de compras</s:a></s:if>
                        </ul>
                    </li>
                </ul>
                </s:if>
                        
                <!-- M�dulo Equipo -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Equipo<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <s:if test="#session.menu[54]"><li><s:a action="equipoListado">Cat�logo de equipos</s:a></s:if>
                            <s:if test="#session.menu[55]"><li><s:a action="equipoNuevo">Nuevo equipo</s:a></s:if>
                            <s:if test="#session.menu[58]"><li><s:a action="menu">Mantenimientos</s:a></s:if>
                            <s:if test="#session.menu[59]"><li><s:a action="menu">Nuevo Mantenimientos</s:a></s:if>
                            <li><s:a action="menu">Alertas</s:a>
                    </ul>
                </li>
            </ul>
                     <!-- M�dulo Reportes -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white">Reportes<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><s:a action="paramProveedores">Reporte de Proveedores</s:a></li>
                            <li><s:a action="paramCompras">Reporte de Compras</s:a></li>
                        </ul>
                    </li>
                </ul>         
                
            <!-- M�dulo Perfil -->
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white"><s:property value="#session.usuario"/> (<s:property value="#session.rol_Nombre"/>) <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Mi perfil</a></li>
                        <li><a href="#">Cambiar contrase�a</a></li>
                        <li role="separator" class="divider"></li>
                        <li><s:a action="salir">Cerrar sesi�n</s:a></li>
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