package entidades;
// Generated 19-may-2017 12:01:36 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * DetalleMantenimiento generated by hbm2java
 */
public class DetalleMantenimiento  implements java.io.Serializable {


     private BigDecimal detMantoId;
     private Equipos equipos;
     private Mantenimientos mantenimientos;
     private String detMantoEstadoInicial;
     private String detMantoEstadoFinal;
     private String detMantoDescripcion;

    public DetalleMantenimiento() {
    }

	
    public DetalleMantenimiento(BigDecimal detMantoId, Equipos equipos, Mantenimientos mantenimientos, String detMantoEstadoInicial, String detMantoEstadoFinal) {
        this.detMantoId = detMantoId;
        this.equipos = equipos;
        this.mantenimientos = mantenimientos;
        this.detMantoEstadoInicial = detMantoEstadoInicial;
        this.detMantoEstadoFinal = detMantoEstadoFinal;
    }
    public DetalleMantenimiento(BigDecimal detMantoId, Equipos equipos, Mantenimientos mantenimientos, String detMantoEstadoInicial, String detMantoEstadoFinal, String detMantoDescripcion) {
       this.detMantoId = detMantoId;
       this.equipos = equipos;
       this.mantenimientos = mantenimientos;
       this.detMantoEstadoInicial = detMantoEstadoInicial;
       this.detMantoEstadoFinal = detMantoEstadoFinal;
       this.detMantoDescripcion = detMantoDescripcion;
    }
   
    public BigDecimal getDetMantoId() {
        return this.detMantoId;
    }
    
    public void setDetMantoId(BigDecimal detMantoId) {
        this.detMantoId = detMantoId;
    }
    public Equipos getEquipos() {
        return this.equipos;
    }
    
    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }
    public Mantenimientos getMantenimientos() {
        return this.mantenimientos;
    }
    
    public void setMantenimientos(Mantenimientos mantenimientos) {
        this.mantenimientos = mantenimientos;
    }
    public String getDetMantoEstadoInicial() {
        return this.detMantoEstadoInicial;
    }
    
    public void setDetMantoEstadoInicial(String detMantoEstadoInicial) {
        this.detMantoEstadoInicial = detMantoEstadoInicial;
    }
    public String getDetMantoEstadoFinal() {
        return this.detMantoEstadoFinal;
    }
    
    public void setDetMantoEstadoFinal(String detMantoEstadoFinal) {
        this.detMantoEstadoFinal = detMantoEstadoFinal;
    }
    public String getDetMantoDescripcion() {
        return this.detMantoDescripcion;
    }
    
    public void setDetMantoDescripcion(String detMantoDescripcion) {
        this.detMantoDescripcion = detMantoDescripcion;
    }




}

