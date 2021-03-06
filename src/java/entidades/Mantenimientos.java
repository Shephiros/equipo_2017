package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Mantenimientos generated by hbm2java
 */
public class Mantenimientos  implements java.io.Serializable {


     private BigDecimal mantoId;
     private Contratos contratos;
     private Proveedores proveedores;
     private TipoMantenimientos tipoMantenimientos;
     private Date mantoInicio;
     private Date mantoFinalizacion;
     private String mantoResponsable;
     private String mantoDescripcion;
     private String mantoAutorizadoPor;
     private Set detalleMantenimientos = new HashSet(0);

    public Mantenimientos() {
    }

	
    public Mantenimientos(BigDecimal mantoId, Contratos contratos, Proveedores proveedores, TipoMantenimientos tipoMantenimientos, Date mantoInicio, Date mantoFinalizacion, String mantoResponsable, String mantoAutorizadoPor) {
        this.mantoId = mantoId;
        this.contratos = contratos;
        this.proveedores = proveedores;
        this.tipoMantenimientos = tipoMantenimientos;
        this.mantoInicio = mantoInicio;
        this.mantoFinalizacion = mantoFinalizacion;
        this.mantoResponsable = mantoResponsable;
        this.mantoAutorizadoPor = mantoAutorizadoPor;
    }
    public Mantenimientos(BigDecimal mantoId, Contratos contratos, Proveedores proveedores, TipoMantenimientos tipoMantenimientos, Date mantoInicio, Date mantoFinalizacion, String mantoResponsable, String mantoDescripcion, String mantoAutorizadoPor, Set detalleMantenimientos) {
       this.mantoId = mantoId;
       this.contratos = contratos;
       this.proveedores = proveedores;
       this.tipoMantenimientos = tipoMantenimientos;
       this.mantoInicio = mantoInicio;
       this.mantoFinalizacion = mantoFinalizacion;
       this.mantoResponsable = mantoResponsable;
       this.mantoDescripcion = mantoDescripcion;
       this.mantoAutorizadoPor = mantoAutorizadoPor;
       this.detalleMantenimientos = detalleMantenimientos;
    }
   
    public BigDecimal getMantoId() {
        return this.mantoId;
    }
    
    public void setMantoId(BigDecimal mantoId) {
        this.mantoId = mantoId;
    }
    public Contratos getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Contratos contratos) {
        this.contratos = contratos;
    }
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    public TipoMantenimientos getTipoMantenimientos() {
        return this.tipoMantenimientos;
    }
    
    public void setTipoMantenimientos(TipoMantenimientos tipoMantenimientos) {
        this.tipoMantenimientos = tipoMantenimientos;
    }
    public Date getMantoInicio() {
        return this.mantoInicio;
    }
    
    public void setMantoInicio(Date mantoInicio) {
        this.mantoInicio = mantoInicio;
    }
    public Date getMantoFinalizacion() {
        return this.mantoFinalizacion;
    }
    
    public void setMantoFinalizacion(Date mantoFinalizacion) {
        this.mantoFinalizacion = mantoFinalizacion;
    }
    public String getMantoResponsable() {
        return this.mantoResponsable;
    }
    
    public void setMantoResponsable(String mantoResponsable) {
        this.mantoResponsable = mantoResponsable;
    }
    public String getMantoDescripcion() {
        return this.mantoDescripcion;
    }
    
    public void setMantoDescripcion(String mantoDescripcion) {
        this.mantoDescripcion = mantoDescripcion;
    }
    public String getMantoAutorizadoPor() {
        return this.mantoAutorizadoPor;
    }
    
    public void setMantoAutorizadoPor(String mantoAutorizadoPor) {
        this.mantoAutorizadoPor = mantoAutorizadoPor;
    }
    public Set getDetalleMantenimientos() {
        return this.detalleMantenimientos;
    }
    
    public void setDetalleMantenimientos(Set detalleMantenimientos) {
        this.detalleMantenimientos = detalleMantenimientos;
    }




}


