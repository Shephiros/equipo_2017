package entidades;
// Generated 19-may-2017 12:01:36 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Municipios generated by hbm2java
 */
public class Municipios  implements java.io.Serializable {


     private BigDecimal municipioId;
     private Departamentos departamentos;
     private String municipioNombre;
     private Set proveedoreses = new HashSet(0);
     private Set institucioneses = new HashSet(0);

    public Municipios() {
    }

	
    public Municipios(BigDecimal municipioId, Departamentos departamentos, String municipioNombre) {
        this.municipioId = municipioId;
        this.departamentos = departamentos;
        this.municipioNombre = municipioNombre;
    }
    public Municipios(BigDecimal municipioId, Departamentos departamentos, String municipioNombre, Set proveedoreses, Set institucioneses) {
       this.municipioId = municipioId;
       this.departamentos = departamentos;
       this.municipioNombre = municipioNombre;
       this.proveedoreses = proveedoreses;
       this.institucioneses = institucioneses;
    }
   
    public BigDecimal getMunicipioId() {
        return this.municipioId;
    }
    
    public void setMunicipioId(BigDecimal municipioId) {
        this.municipioId = municipioId;
    }
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public String getMunicipioNombre() {
        return this.municipioNombre;
    }
    
    public void setMunicipioNombre(String municipioNombre) {
        this.municipioNombre = municipioNombre;
    }
    public Set getProveedoreses() {
        return this.proveedoreses;
    }
    
    public void setProveedoreses(Set proveedoreses) {
        this.proveedoreses = proveedoreses;
    }
    public Set getInstitucioneses() {
        return this.institucioneses;
    }
    
    public void setInstitucioneses(Set institucioneses) {
        this.institucioneses = institucioneses;
    }




}


