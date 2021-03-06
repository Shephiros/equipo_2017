package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TipoSolicitudes generated by hbm2java
 */
public class TipoSolicitudes  implements java.io.Serializable {


     private BigDecimal tipoSolicitudId;
     private String tipoSolicitudNombre;
     private String tipoSolicitudDescripcion;
     private Set solicitudeses = new HashSet(0);

    public TipoSolicitudes() {
    }

	
    public TipoSolicitudes(BigDecimal tipoSolicitudId, String tipoSolicitudNombre) {
        this.tipoSolicitudId = tipoSolicitudId;
        this.tipoSolicitudNombre = tipoSolicitudNombre;
    }
    public TipoSolicitudes(BigDecimal tipoSolicitudId, String tipoSolicitudNombre, String tipoSolicitudDescripcion, Set solicitudeses) {
       this.tipoSolicitudId = tipoSolicitudId;
       this.tipoSolicitudNombre = tipoSolicitudNombre;
       this.tipoSolicitudDescripcion = tipoSolicitudDescripcion;
       this.solicitudeses = solicitudeses;
    }
   
    public BigDecimal getTipoSolicitudId() {
        return this.tipoSolicitudId;
    }
    
    public void setTipoSolicitudId(BigDecimal tipoSolicitudId) {
        this.tipoSolicitudId = tipoSolicitudId;
    }
    public String getTipoSolicitudNombre() {
        return this.tipoSolicitudNombre;
    }
    
    public void setTipoSolicitudNombre(String tipoSolicitudNombre) {
        this.tipoSolicitudNombre = tipoSolicitudNombre;
    }
    public String getTipoSolicitudDescripcion() {
        return this.tipoSolicitudDescripcion;
    }
    
    public void setTipoSolicitudDescripcion(String tipoSolicitudDescripcion) {
        this.tipoSolicitudDescripcion = tipoSolicitudDescripcion;
    }
    public Set getSolicitudeses() {
        return this.solicitudeses;
    }
    
    public void setSolicitudeses(Set solicitudeses) {
        this.solicitudeses = solicitudeses;
    }




}


