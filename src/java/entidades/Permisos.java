package entidades;
// Generated 19-may-2017 12:01:36 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Permisos generated by hbm2java
 */
public class Permisos  implements java.io.Serializable {


     private BigDecimal permisoId;
     private Pantallas pantallas;
     private Roles roles;

    public Permisos() {
    }

    public Permisos(BigDecimal permisoId, Pantallas pantallas, Roles roles) {
       this.permisoId = permisoId;
       this.pantallas = pantallas;
       this.roles = roles;
    }
   
    public BigDecimal getPermisoId() {
        return this.permisoId;
    }
    
    public void setPermisoId(BigDecimal permisoId) {
        this.permisoId = permisoId;
    }
    public Pantallas getPantallas() {
        return this.pantallas;
    }
    
    public void setPantallas(Pantallas pantallas) {
        this.pantallas = pantallas;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }




}

