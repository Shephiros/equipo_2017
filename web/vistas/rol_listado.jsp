<%-- 
    Document   : rol_listado
    Created on : 22-may-2017, 16:22:25
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Listado Roles</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/dataTables.bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>LISTADO ROLES</center></b></h2><br>
        
        
        <div class="form-row">
            <div class="col-lg-1"></div>
            <div class="col-lg-10">
                <table class="table table-striped table-bordered table-condensed" id="example">
                <thead>
                    <th><center>No.</center></th>
                    <th><center>Nombre</center></th>
                    <th><center>Descripcion</center></th>
                </thead>
                <tbody>
                    <s:iterator value="todosRoles" var="dato" status="estado">
                        <tr>
                            <td style="text-align: center"></td>
                            <td><s:property value="rolNombre"/></td>
                            <td><s:property value="rolDescripcion"/></td>
                        </tr>
                    </s:iterator>
                </tbody>
                </table>
            </div>
            <div class="col-lg-1"></div>
        </div>
        
    <script src="${pageContext.request.contextPath}/recursos/js/jquery.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/recursos/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/recursos/js/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/recursos/js/dataTables.bootstrap.min.js" type="text/javascript"></script>
    <script>
        $(document).ready(function() {
        var t = $('#example').DataTable( {
            "language": {
                "processing": "Procesando...",
                "lengthMenu": "Mostrar _MENU_ registros",
                "zeroRecords": "No se encontraron resultados",
                "emptyTable": "Ningún dato disponible en esta tabla",
                "search": "Buscar:",
                "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
                "infoFiltered": "(filtrado de un total de _MAX_ registros)",
                "paginate": {
                        "first": "Primero",
                        "last": "Último",
                        "next": "Siguiente",
                        "previous": "Anterior"
                    },
                    "aria": {
                        "sortAscending": ": Activar para ordenar la columna de manera ascendente",
                        "sortDescending": ": Activar para ordenar la columna de manera descendente"
                    }
            },
            "columnDefs": [ {
                "searchable": false,
                "orderable": false,
                "targets": 0
            } ],
            "order": [[ 1, 'asc' ]]
        } );
 
        t.on( 'order.dt search.dt', function () {
        t.column(0, {search:'applied', order:'applied'}).nodes().each( function (cell, i) {cell.innerHTML = i+1;} );
        } ).draw();
        } );
    </script>
    </body>
</html>

