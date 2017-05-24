package entidades;
// Generated 24-may-2017 11:11:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Compras generated by hbm2java
 */
public class Compras  implements java.io.Serializable {


     private BigDecimal compraId;
     private Instituciones instituciones;
     private Proveedores proveedores;
     private String compraFactura;
     private Date compraFecha;
     private String compraVendedor;
     private BigDecimal compraSolicitudCodigo;
     private String compraResponsable;
     private Set contratoses = new HashSet(0);
     private Set detalleComprases = new HashSet(0);

    public Compras() {
    }

	
    public Compras(BigDecimal compraId, Instituciones instituciones, String compraFactura, Date compraFecha) {
        this.compraId = compraId;
        this.instituciones = instituciones;
        this.compraFactura = compraFactura;
        this.compraFecha = compraFecha;
    }
    public Compras(BigDecimal compraId, Instituciones instituciones, Proveedores proveedores, String compraFactura, Date compraFecha, String compraVendedor, BigDecimal compraSolicitudCodigo, String compraResponsable, Set contratoses, Set detalleComprases) {
       this.compraId = compraId;
       this.instituciones = instituciones;
       this.proveedores = proveedores;
       this.compraFactura = compraFactura;
       this.compraFecha = compraFecha;
       this.compraVendedor = compraVendedor;
       this.compraSolicitudCodigo = compraSolicitudCodigo;
       this.compraResponsable = compraResponsable;
       this.contratoses = contratoses;
       this.detalleComprases = detalleComprases;
    }
   
    public BigDecimal getCompraId() {
        return this.compraId;
    }
    
    public void setCompraId(BigDecimal compraId) {
        this.compraId = compraId;
    }
    public Instituciones getInstituciones() {
        return this.instituciones;
    }
    
    public void setInstituciones(Instituciones instituciones) {
        this.instituciones = instituciones;
    }
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    public String getCompraFactura() {
        return this.compraFactura;
    }
    
    public void setCompraFactura(String compraFactura) {
        this.compraFactura = compraFactura;
    }
    public Date getCompraFecha() {
        return this.compraFecha;
    }
    
    public void setCompraFecha(Date compraFecha) {
        this.compraFecha = compraFecha;
    }
    public String getCompraVendedor() {
        return this.compraVendedor;
    }
    
    public void setCompraVendedor(String compraVendedor) {
        this.compraVendedor = compraVendedor;
    }
    public BigDecimal getCompraSolicitudCodigo() {
        return this.compraSolicitudCodigo;
    }
    
    public void setCompraSolicitudCodigo(BigDecimal compraSolicitudCodigo) {
        this.compraSolicitudCodigo = compraSolicitudCodigo;
    }
    public String getCompraResponsable() {
        return this.compraResponsable;
    }
    
    public void setCompraResponsable(String compraResponsable) {
        this.compraResponsable = compraResponsable;
    }
    public Set getContratoses() {
        return this.contratoses;
    }
    
    public void setContratoses(Set contratoses) {
        this.contratoses = contratoses;
    }
    public Set getDetalleComprases() {
        return this.detalleComprases;
    }
    
    public void setDetalleComprases(Set detalleComprases) {
        this.detalleComprases = detalleComprases;
    }




}


