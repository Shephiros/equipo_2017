package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductosInstitucion generated by hbm2java
 */
public class ProductosInstitucion  implements java.io.Serializable {


     private BigDecimal prodInstitucionId;
     private Instituciones instituciones;
     private String prodInstitucionNombre;
     private String prodInstitucionDescripcion;
     private Set detalleSolicituds = new HashSet(0);

    public ProductosInstitucion() {
    }

	
    public ProductosInstitucion(BigDecimal prodInstitucionId, Instituciones instituciones, String prodInstitucionNombre, String prodInstitucionDescripcion) {
        this.prodInstitucionId = prodInstitucionId;
        this.instituciones = instituciones;
        this.prodInstitucionNombre = prodInstitucionNombre;
        this.prodInstitucionDescripcion = prodInstitucionDescripcion;
    }
    public ProductosInstitucion(BigDecimal prodInstitucionId, Instituciones instituciones, String prodInstitucionNombre, String prodInstitucionDescripcion, Set detalleSolicituds) {
       this.prodInstitucionId = prodInstitucionId;
       this.instituciones = instituciones;
       this.prodInstitucionNombre = prodInstitucionNombre;
       this.prodInstitucionDescripcion = prodInstitucionDescripcion;
       this.detalleSolicituds = detalleSolicituds;
    }
   
    public BigDecimal getProdInstitucionId() {
        return this.prodInstitucionId;
    }
    
    public void setProdInstitucionId(BigDecimal prodInstitucionId) {
        this.prodInstitucionId = prodInstitucionId;
    }
    public Instituciones getInstituciones() {
        return this.instituciones;
    }
    
    public void setInstituciones(Instituciones instituciones) {
        this.instituciones = instituciones;
    }
    public String getProdInstitucionNombre() {
        return this.prodInstitucionNombre;
    }
    
    public void setProdInstitucionNombre(String prodInstitucionNombre) {
        this.prodInstitucionNombre = prodInstitucionNombre;
    }
    public String getProdInstitucionDescripcion() {
        return this.prodInstitucionDescripcion;
    }
    
    public void setProdInstitucionDescripcion(String prodInstitucionDescripcion) {
        this.prodInstitucionDescripcion = prodInstitucionDescripcion;
    }
    public Set getDetalleSolicituds() {
        return this.detalleSolicituds;
    }
    
    public void setDetalleSolicituds(Set detalleSolicituds) {
        this.detalleSolicituds = detalleSolicituds;
    }




}


