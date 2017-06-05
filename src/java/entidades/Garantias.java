package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Garantias generated by hbm2java
 */
public class Garantias  implements java.io.Serializable {


     private BigDecimal garantiaId;
     private Contratos contratos;
     private Ofertas ofertas;
     private String garantiaTipo;
     private Date garantiaInicio;
     private Date garantiaFinalizacion;
     private String garantiaDescripcion;

    public Garantias() {
    }

	
    public Garantias(BigDecimal garantiaId, String garantiaTipo, Date garantiaInicio, Date garantiaFinalizacion) {
        this.garantiaId = garantiaId;
        this.garantiaTipo = garantiaTipo;
        this.garantiaInicio = garantiaInicio;
        this.garantiaFinalizacion = garantiaFinalizacion;
    }
    public Garantias(BigDecimal garantiaId, Contratos contratos, Ofertas ofertas, String garantiaTipo, Date garantiaInicio, Date garantiaFinalizacion, String garantiaDescripcion) {
       this.garantiaId = garantiaId;
       this.contratos = contratos;
       this.ofertas = ofertas;
       this.garantiaTipo = garantiaTipo;
       this.garantiaInicio = garantiaInicio;
       this.garantiaFinalizacion = garantiaFinalizacion;
       this.garantiaDescripcion = garantiaDescripcion;
    }
   
    public BigDecimal getGarantiaId() {
        return this.garantiaId;
    }
    
    public void setGarantiaId(BigDecimal garantiaId) {
        this.garantiaId = garantiaId;
    }
    public Contratos getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Contratos contratos) {
        this.contratos = contratos;
    }
    public Ofertas getOfertas() {
        return this.ofertas;
    }
    
    public void setOfertas(Ofertas ofertas) {
        this.ofertas = ofertas;
    }
    public String getGarantiaTipo() {
        return this.garantiaTipo;
    }
    
    public void setGarantiaTipo(String garantiaTipo) {
        this.garantiaTipo = garantiaTipo;
    }
    public Date getGarantiaInicio() {
        return this.garantiaInicio;
    }
    
    public void setGarantiaInicio(Date garantiaInicio) {
        this.garantiaInicio = garantiaInicio;
    }
    public Date getGarantiaFinalizacion() {
        return this.garantiaFinalizacion;
    }
    
    public void setGarantiaFinalizacion(Date garantiaFinalizacion) {
        this.garantiaFinalizacion = garantiaFinalizacion;
    }
    public String getGarantiaDescripcion() {
        return this.garantiaDescripcion;
    }
    
    public void setGarantiaDescripcion(String garantiaDescripcion) {
        this.garantiaDescripcion = garantiaDescripcion;
    }




}


