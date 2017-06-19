<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.0.272/jspdf.debug.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/2.3.2/jspdf.plugin.autotable.js"></script>
<script src="https://rawgit.com/someatoms/jsPDF-AutoTable/master/dist/jspdf.plugin.autotable.js"></script>

<!DOCTYPE html>
<h2 style="color: navy"><b><center>REPORTE DE COMPRAS</center></b></h2><br>
<s:label name="depto" value ="Resultados encontrados:"></s:label>

<script src="recursos/js/jspdf.debug.js"></script>
<script src="recursos/js/jspdf.plugin.autotable.js"></script>
<script>
  function demoPDF() {
  var pdfsize = 'compras';
  var pdf = new jsPDF('l', 'pt');
  pdf.setFontSize(20);
  pdf.text('Reporte de Compras \n', 14, 24);
  pdf.setFontSize(11);
  pdf.setTextColor(100);
  var usuario = '<s:property value="#session.usuario"/>';
  var fecha = new Date();
  var y = fecha.getFullYear();
  var m = fecha.getMonth() + 1;
  var d = fecha.getDate();
  
  pdf.text('recuperado por: '+usuario+', el '+d+'/'+m+'/'+y,14,34);
  var res = pdf.autoTableHtmlToJson(document.getElementById("example"));
  pdf.autoTable(res.columns, res.data,  {});
  pdf.save(pdfsize+ ".pdf");
};
</script>

<div class="form-row">
    <div class="col-lg-1">
    </div>
    <div class="col-lg-10">
        <table class="table table-striped table-bordered table-condensed" id="example">
            <thead>
            <th><center>No.</center></th>
            <th><center>Fecha</center></th>
            <th><center>Factura</center></th>
            <th><center>Responsable</center></th>
            </thead>
            <tbody>
            <s:iterator value="todasCompras" var="dato" status="estado">
                <tr>
                        <td style="text-align: center"></td>
                        <td><center><s:property value="compraFecha"/></center></td>
                        <td><center><s:property value="compraFactura"/></center></td>
                        <td><s:property value="compraResponsable"/></td>
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
        <button style="display: inline" class="btn btn-primary" onclick ="demoPDF();">Generar PDF!</button>
    </div>
</div>