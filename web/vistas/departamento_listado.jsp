<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Listado Departamentos</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/dataTables.bootstrap.min.css"/>
    </head>
    <body>
        <h2 style="color: navy"><b><center>LISTADO DE DEPARTAMENTOS</center></b></h2><br>
        
        <div class="form-row">
            <div class="col-lg-1">
            </div>
            <div class="col-lg-10">
                <table class="table table-striped table-bordered table-condensed" id="example">
                    <thead>
                        <th><center>No.</center></th>
                        <th><center>Nombre</center></th>
                        <th><center>Jefe</center></th>
                        <th><center>Teléfono</center></th>
                        <th><center>Opciones</center></th>
                    </thead>
                    <tbody>
                        <s:iterator value="todosDeptosInstitucion" var="dato" status="estado">
                            <tr>
                                <td style="text-align: center"></td>
                                <td><s:property value="deptoInstitucionNombre"/></td>
                                <td><s:property value="deptoInstitucionJefe"/></td>
                                <td><center><s:property value="deptoInstitucionTelefono"/></center></td>
                                <td>
                                    <center>
                                        <s:a action="departamentoEditar" cssStyle="color: navy">
                                        <s:param name="deptoInstitucionId" value="deptoInstitucionId"/>
                                        <i class="glyphicon glyphicon-pencil"></i>
                                    </s:a>
                                    <s:a  action="departamentoVer" cssStyle="color: navy">
                                        <s:param name="deptoInstitucionId" value="deptoInstitucionId"/>
                                        <i class="glyphicon glyphicon-eye-open"></i>
                                    </s:a>
                                    </center>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="col-lg-1">
            </div>
        </div>
        
        <div class="form-group">
            <div class="col-lg-12" style="text-align: center">
                <s:a action="departamentoNuevo" cssClass="btn btn-default" >Nueva departamento</s:a>
            </div>
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
