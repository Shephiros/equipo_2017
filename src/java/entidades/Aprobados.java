package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Aprobados generated by hbm2java
 */
public class Aprobados  implements java.io.Serializable {


     private BigDecimal aprobadoId;
     private Solicitudes solicitudes;
     private Date aprobadoFecha;
     private String aprobadoResponsable;
     private String aprobadoObservaciones;

    public Aprobados() {
    }

	
    public Aprobados(BigDecimal aprobadoId, Solicitudes solicitudes, Date aprobadoFecha, String aprobadoResponsable) {
        this.aprobadoId = aprobadoId;
        this.solicitudes = solicitudes;
        this.aprobadoFecha = aprobadoFecha;
        this.aprobadoResponsable = aprobadoResponsable;
    }
    public Aprobados(BigDecimal aprobadoId, Solicitudes solicitudes, Date aprobadoFecha, String aprobadoResponsable, String aprobadoObservaciones) {
       this.aprobadoId = aprobadoId;
       this.solicitudes = solicitudes;
       this.aprobadoFecha = aprobadoFecha;
       this.aprobadoResponsable = aprobadoResponsable;
       this.aprobadoObservaciones = aprobadoObservaciones;
    }
   
    public BigDecimal getAprobadoId() {
        return this.aprobadoId;
    }
    
    public void setAprobadoId(BigDecimal aprobadoId) {
        this.aprobadoId = aprobadoId;
    }
    public Solicitudes getSolicitudes() {
        return this.solicitudes;
    }
    
    public void setSolicitudes(Solicitudes solicitudes) {
        this.solicitudes = solicitudes;
    }
    public Date getAprobadoFecha() {
        return this.aprobadoFecha;
    }
    
    public void setAprobadoFecha(Date aprobadoFecha) {
        this.aprobadoFecha = aprobadoFecha;
    }
    public String getAprobadoResponsable() {
        return this.aprobadoResponsable;
    }
    
    public void setAprobadoResponsable(String aprobadoResponsable) {
        this.aprobadoResponsable = aprobadoResponsable;
    }
    public String getAprobadoObservaciones() {
        return this.aprobadoObservaciones;
    }
    
    public void setAprobadoObservaciones(String aprobadoObservaciones) {
        this.aprobadoObservaciones = aprobadoObservaciones;
    }




}


