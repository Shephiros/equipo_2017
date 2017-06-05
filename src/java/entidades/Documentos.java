package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Documentos generated by hbm2java
 */
public class Documentos  implements java.io.Serializable {


     private BigDecimal docuId;
     private Equipos equipos;
     private String docuNombre;
     private String docuUrl;

    public Documentos() {
    }

    public Documentos(BigDecimal docuId, Equipos equipos, String docuNombre, String docuUrl) {
       this.docuId = docuId;
       this.equipos = equipos;
       this.docuNombre = docuNombre;
       this.docuUrl = docuUrl;
    }
   
    public BigDecimal getDocuId() {
        return this.docuId;
    }
    
    public void setDocuId(BigDecimal docuId) {
        this.docuId = docuId;
    }
    public Equipos getEquipos() {
        return this.equipos;
    }
    
    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }
    public String getDocuNombre() {
        return this.docuNombre;
    }
    
    public void setDocuNombre(String docuNombre) {
        this.docuNombre = docuNombre;
    }
    public String getDocuUrl() {
        return this.docuUrl;
    }
    
    public void setDocuUrl(String docuUrl) {
        this.docuUrl = docuUrl;
    }




}


