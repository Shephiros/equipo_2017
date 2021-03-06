package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Instalaciones generated by hbm2java
 */
public class Instalaciones  implements java.io.Serializable {


     private BigDecimal instalacionId;
     private Contratos contratos;
     private Proveedores proveedores;
     private Date instalacionInicio;
     private Date instalacionFinalizacion;
     private String instalacionResponsable;
     private String instalacionDescripcion;
     private Set detalleInstalacions = new HashSet(0);

    public Instalaciones() {
    }

	
    public Instalaciones(BigDecimal instalacionId, Contratos contratos, Proveedores proveedores, Date instalacionInicio, Date instalacionFinalizacion, String instalacionResponsable) {
        this.instalacionId = instalacionId;
        this.contratos = contratos;
        this.proveedores = proveedores;
        this.instalacionInicio = instalacionInicio;
        this.instalacionFinalizacion = instalacionFinalizacion;
        this.instalacionResponsable = instalacionResponsable;
    }
    public Instalaciones(BigDecimal instalacionId, Contratos contratos, Proveedores proveedores, Date instalacionInicio, Date instalacionFinalizacion, String instalacionResponsable, String instalacionDescripcion, Set detalleInstalacions) {
       this.instalacionId = instalacionId;
       this.contratos = contratos;
       this.proveedores = proveedores;
       this.instalacionInicio = instalacionInicio;
       this.instalacionFinalizacion = instalacionFinalizacion;
       this.instalacionResponsable = instalacionResponsable;
       this.instalacionDescripcion = instalacionDescripcion;
       this.detalleInstalacions = detalleInstalacions;
    }
   
    public BigDecimal getInstalacionId() {
        return this.instalacionId;
    }
    
    public void setInstalacionId(BigDecimal instalacionId) {
        this.instalacionId = instalacionId;
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
    public Date getInstalacionInicio() {
        return this.instalacionInicio;
    }
    
    public void setInstalacionInicio(Date instalacionInicio) {
        this.instalacionInicio = instalacionInicio;
    }
    public Date getInstalacionFinalizacion() {
        return this.instalacionFinalizacion;
    }
    
    public void setInstalacionFinalizacion(Date instalacionFinalizacion) {
        this.instalacionFinalizacion = instalacionFinalizacion;
    }
    public String getInstalacionResponsable() {
        return this.instalacionResponsable;
    }
    
    public void setInstalacionResponsable(String instalacionResponsable) {
        this.instalacionResponsable = instalacionResponsable;
    }
    public String getInstalacionDescripcion() {
        return this.instalacionDescripcion;
    }
    
    public void setInstalacionDescripcion(String instalacionDescripcion) {
        this.instalacionDescripcion = instalacionDescripcion;
    }
    public Set getDetalleInstalacions() {
        return this.detalleInstalacions;
    }
    
    public void setDetalleInstalacions(Set detalleInstalacions) {
        this.detalleInstalacions = detalleInstalacions;
    }




}


