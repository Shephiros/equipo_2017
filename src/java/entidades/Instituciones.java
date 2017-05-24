package entidades;
// Generated 24-may-2017 11:11:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Instituciones generated by hbm2java
 */
public class Instituciones  implements java.io.Serializable {


     private BigDecimal institucionId;
     private Municipios municipios;
     private String institucionNombre;
     private String institucionEncargado;
     private String institucionTelefono;
     private String institucionDireccion;
     private String institucionDescripcion;
     private Set departamentosInstitucions = new HashSet(0);
     private Set usuarioses = new HashSet(0);
     private Set comprases = new HashSet(0);

    public Instituciones() {
    }

	
    public Instituciones(BigDecimal institucionId, Municipios municipios, String institucionNombre, String institucionEncargado) {
        this.institucionId = institucionId;
        this.municipios = municipios;
        this.institucionNombre = institucionNombre;
        this.institucionEncargado = institucionEncargado;
    }
    public Instituciones(BigDecimal institucionId, Municipios municipios, String institucionNombre, String institucionEncargado, String institucionTelefono, String institucionDireccion, String institucionDescripcion, Set departamentosInstitucions, Set usuarioses, Set comprases) {
       this.institucionId = institucionId;
       this.municipios = municipios;
       this.institucionNombre = institucionNombre;
       this.institucionEncargado = institucionEncargado;
       this.institucionTelefono = institucionTelefono;
       this.institucionDireccion = institucionDireccion;
       this.institucionDescripcion = institucionDescripcion;
       this.departamentosInstitucions = departamentosInstitucions;
       this.usuarioses = usuarioses;
       this.comprases = comprases;
    }
   
    public BigDecimal getInstitucionId() {
        return this.institucionId;
    }
    
    public void setInstitucionId(BigDecimal institucionId) {
        this.institucionId = institucionId;
    }
    public Municipios getMunicipios() {
        return this.municipios;
    }
    
    public void setMunicipios(Municipios municipios) {
        this.municipios = municipios;
    }
    public String getInstitucionNombre() {
        return this.institucionNombre;
    }
    
    public void setInstitucionNombre(String institucionNombre) {
        this.institucionNombre = institucionNombre;
    }
    public String getInstitucionEncargado() {
        return this.institucionEncargado;
    }
    
    public void setInstitucionEncargado(String institucionEncargado) {
        this.institucionEncargado = institucionEncargado;
    }
    public String getInstitucionTelefono() {
        return this.institucionTelefono;
    }
    
    public void setInstitucionTelefono(String institucionTelefono) {
        this.institucionTelefono = institucionTelefono;
    }
    public String getInstitucionDireccion() {
        return this.institucionDireccion;
    }
    
    public void setInstitucionDireccion(String institucionDireccion) {
        this.institucionDireccion = institucionDireccion;
    }
    public String getInstitucionDescripcion() {
        return this.institucionDescripcion;
    }
    
    public void setInstitucionDescripcion(String institucionDescripcion) {
        this.institucionDescripcion = institucionDescripcion;
    }
    public Set getDepartamentosInstitucions() {
        return this.departamentosInstitucions;
    }
    
    public void setDepartamentosInstitucions(Set departamentosInstitucions) {
        this.departamentosInstitucions = departamentosInstitucions;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }
    public Set getComprases() {
        return this.comprases;
    }
    
    public void setComprases(Set comprases) {
        this.comprases = comprases;
    }




}


