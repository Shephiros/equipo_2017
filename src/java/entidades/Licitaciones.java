package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Licitaciones generated by hbm2java
 */
public class Licitaciones  implements java.io.Serializable {


     private BigDecimal licitacionId;
     private Solicitudes solicitudes;
     private BigDecimal licitacionNumero;
     private BigDecimal licitacionAnio;
     private Date licitacionInicio;
     private Date licitacionFinalizacion;
     private String licitacionDescripcion;
     private Set ofertases = new HashSet(0);

    public Licitaciones() {
    }

	
    public Licitaciones(BigDecimal licitacionId, Solicitudes solicitudes, BigDecimal licitacionNumero, BigDecimal licitacionAnio, Date licitacionInicio, Date licitacionFinalizacion, String licitacionDescripcion) {
        this.licitacionId = licitacionId;
        this.solicitudes = solicitudes;
        this.licitacionNumero = licitacionNumero;
        this.licitacionAnio = licitacionAnio;
        this.licitacionInicio = licitacionInicio;
        this.licitacionFinalizacion = licitacionFinalizacion;
        this.licitacionDescripcion = licitacionDescripcion;
    }
    public Licitaciones(BigDecimal licitacionId, Solicitudes solicitudes, BigDecimal licitacionNumero, BigDecimal licitacionAnio, Date licitacionInicio, Date licitacionFinalizacion, String licitacionDescripcion, Set ofertases) {
       this.licitacionId = licitacionId;
       this.solicitudes = solicitudes;
       this.licitacionNumero = licitacionNumero;
       this.licitacionAnio = licitacionAnio;
       this.licitacionInicio = licitacionInicio;
       this.licitacionFinalizacion = licitacionFinalizacion;
       this.licitacionDescripcion = licitacionDescripcion;
       this.ofertases = ofertases;
    }
   
    public BigDecimal getLicitacionId() {
        return this.licitacionId;
    }
    
    public void setLicitacionId(BigDecimal licitacionId) {
        this.licitacionId = licitacionId;
    }
    public Solicitudes getSolicitudes() {
        return this.solicitudes;
    }
    
    public void setSolicitudes(Solicitudes solicitudes) {
        this.solicitudes = solicitudes;
    }
    public BigDecimal getLicitacionNumero() {
        return this.licitacionNumero;
    }
    
    public void setLicitacionNumero(BigDecimal licitacionNumero) {
        this.licitacionNumero = licitacionNumero;
    }
    public BigDecimal getLicitacionAnio() {
        return this.licitacionAnio;
    }
    
    public void setLicitacionAnio(BigDecimal licitacionAnio) {
        this.licitacionAnio = licitacionAnio;
    }
    public Date getLicitacionInicio() {
        return this.licitacionInicio;
    }
    
    public void setLicitacionInicio(Date licitacionInicio) {
        this.licitacionInicio = licitacionInicio;
    }
    public Date getLicitacionFinalizacion() {
        return this.licitacionFinalizacion;
    }
    
    public void setLicitacionFinalizacion(Date licitacionFinalizacion) {
        this.licitacionFinalizacion = licitacionFinalizacion;
    }
    public String getLicitacionDescripcion() {
        return this.licitacionDescripcion;
    }
    
    public void setLicitacionDescripcion(String licitacionDescripcion) {
        this.licitacionDescripcion = licitacionDescripcion;
    }
    public Set getOfertases() {
        return this.ofertases;
    }
    
    public void setOfertases(Set ofertases) {
        this.ofertases = ofertases;
    }




}


