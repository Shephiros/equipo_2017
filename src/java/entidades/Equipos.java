package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Equipos generated by hbm2java
 */
public class Equipos  implements java.io.Serializable {


     private BigDecimal equipoId;
     private Compras compras;
     private String equipoNombre;
     private String equipoMarca;
     private String equipoModelo;
     private Date equipoFechaCompra;
     private BigDecimal equipoAnioFabricacion;
     private Double equipoBtu;
     private Double equipoPotencia;
     private Date equipoMantenimiento;
     private BigDecimal equipoEstado;
     private Set detalleInstalacions = new HashSet(0);
     private Set documentoses = new HashSet(0);
     private Set alertases = new HashSet(0);
     private Set detalleMantenimientos = new HashSet(0);

    public Equipos() {
    }

	
    public Equipos(BigDecimal equipoId, Compras compras, String equipoNombre, String equipoMarca, Date equipoFechaCompra, BigDecimal equipoEstado) {
        this.equipoId = equipoId;
        this.compras = compras;
        this.equipoNombre = equipoNombre;
        this.equipoMarca = equipoMarca;
        this.equipoFechaCompra = equipoFechaCompra;
        this.equipoEstado = equipoEstado;
    }
    public Equipos(BigDecimal equipoId, Compras compras, String equipoNombre, String equipoMarca, String equipoModelo, Date equipoFechaCompra, BigDecimal equipoAnioFabricacion, Double equipoBtu, Double equipoPotencia, Date equipoMantenimiento, BigDecimal equipoEstado, Set detalleInstalacions, Set documentoses, Set alertases, Set detalleMantenimientos) {
       this.equipoId = equipoId;
       this.compras = compras;
       this.equipoNombre = equipoNombre;
       this.equipoMarca = equipoMarca;
       this.equipoModelo = equipoModelo;
       this.equipoFechaCompra = equipoFechaCompra;
       this.equipoAnioFabricacion = equipoAnioFabricacion;
       this.equipoBtu = equipoBtu;
       this.equipoPotencia = equipoPotencia;
       this.equipoMantenimiento = equipoMantenimiento;
       this.equipoEstado = equipoEstado;
       this.detalleInstalacions = detalleInstalacions;
       this.documentoses = documentoses;
       this.alertases = alertases;
       this.detalleMantenimientos = detalleMantenimientos;
    }
   
    public BigDecimal getEquipoId() {
        return this.equipoId;
    }
    
    public void setEquipoId(BigDecimal equipoId) {
        this.equipoId = equipoId;
    }
    public Compras getCompras() {
        return this.compras;
    }
    
    public void setCompras(Compras compras) {
        this.compras = compras;
    }
    public String getEquipoNombre() {
        return this.equipoNombre;
    }
    
    public void setEquipoNombre(String equipoNombre) {
        this.equipoNombre = equipoNombre;
    }
    public String getEquipoMarca() {
        return this.equipoMarca;
    }
    
    public void setEquipoMarca(String equipoMarca) {
        this.equipoMarca = equipoMarca;
    }
    public String getEquipoModelo() {
        return this.equipoModelo;
    }
    
    public void setEquipoModelo(String equipoModelo) {
        this.equipoModelo = equipoModelo;
    }
    public Date getEquipoFechaCompra() {
        return this.equipoFechaCompra;
    }
    
    public void setEquipoFechaCompra(Date equipoFechaCompra) {
        this.equipoFechaCompra = equipoFechaCompra;
    }
    public BigDecimal getEquipoAnioFabricacion() {
        return this.equipoAnioFabricacion;
    }
    
    public void setEquipoAnioFabricacion(BigDecimal equipoAnioFabricacion) {
        this.equipoAnioFabricacion = equipoAnioFabricacion;
    }
    public Double getEquipoBtu() {
        return this.equipoBtu;
    }
    
    public void setEquipoBtu(Double equipoBtu) {
        this.equipoBtu = equipoBtu;
    }
    public Double getEquipoPotencia() {
        return this.equipoPotencia;
    }
    
    public void setEquipoPotencia(Double equipoPotencia) {
        this.equipoPotencia = equipoPotencia;
    }
    public Date getEquipoMantenimiento() {
        return this.equipoMantenimiento;
    }
    
    public void setEquipoMantenimiento(Date equipoMantenimiento) {
        this.equipoMantenimiento = equipoMantenimiento;
    }
    public BigDecimal getEquipoEstado() {
        return this.equipoEstado;
    }
    
    public void setEquipoEstado(BigDecimal equipoEstado) {
        this.equipoEstado = equipoEstado;
    }
    public Set getDetalleInstalacions() {
        return this.detalleInstalacions;
    }
    
    public void setDetalleInstalacions(Set detalleInstalacions) {
        this.detalleInstalacions = detalleInstalacions;
    }
    public Set getDocumentoses() {
        return this.documentoses;
    }
    
    public void setDocumentoses(Set documentoses) {
        this.documentoses = documentoses;
    }
    public Set getAlertases() {
        return this.alertases;
    }
    
    public void setAlertases(Set alertases) {
        this.alertases = alertases;
    }
    public Set getDetalleMantenimientos() {
        return this.detalleMantenimientos;
    }
    
    public void setDetalleMantenimientos(Set detalleMantenimientos) {
        this.detalleMantenimientos = detalleMantenimientos;
    }




}


