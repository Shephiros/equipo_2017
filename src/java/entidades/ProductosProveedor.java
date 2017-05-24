package entidades;
// Generated 19-may-2017 12:01:36 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ProductosProveedor generated by hbm2java
 */
public class ProductosProveedor  implements java.io.Serializable {


     private BigDecimal prodProveedorId;
     private Proveedores proveedores;
     private String prodProveedorNombre;
     private String prodProveedorMarca;
     private String prodProveedorModelo;
     private BigDecimal prodProveedorAnio;
     private Double prodProveedorBtu;
     private Double prodProveedorPotencia;
     private String prodProveedorColor;
     private BigDecimal prodProveedorExistencias;
     private String prodProveedorDescripcion;
     private Double prodProveedorVoltaje;
     private Double prodProveedorArea;

    public ProductosProveedor() {
    }

	
    public ProductosProveedor(BigDecimal prodProveedorId, Proveedores proveedores, String prodProveedorNombre, String prodProveedorMarca, String prodProveedorModelo) {
        this.prodProveedorId = prodProveedorId;
        this.proveedores = proveedores;
        this.prodProveedorNombre = prodProveedorNombre;
        this.prodProveedorMarca = prodProveedorMarca;
        this.prodProveedorModelo = prodProveedorModelo;
    }
    public ProductosProveedor(BigDecimal prodProveedorId, Proveedores proveedores, String prodProveedorNombre, String prodProveedorMarca, String prodProveedorModelo, BigDecimal prodProveedorAnio, Double prodProveedorBtu, Double prodProveedorPotencia, String prodProveedorColor, BigDecimal prodProveedorExistencias, String prodProveedorDescripcion, Double prodProveedorVoltaje, Double prodProveedorArea) {
       this.prodProveedorId = prodProveedorId;
       this.proveedores = proveedores;
       this.prodProveedorNombre = prodProveedorNombre;
       this.prodProveedorMarca = prodProveedorMarca;
       this.prodProveedorModelo = prodProveedorModelo;
       this.prodProveedorAnio = prodProveedorAnio;
       this.prodProveedorBtu = prodProveedorBtu;
       this.prodProveedorPotencia = prodProveedorPotencia;
       this.prodProveedorColor = prodProveedorColor;
       this.prodProveedorExistencias = prodProveedorExistencias;
       this.prodProveedorDescripcion = prodProveedorDescripcion;
       this.prodProveedorVoltaje = prodProveedorVoltaje;
       this.prodProveedorArea = prodProveedorArea;
    }
   
    public BigDecimal getProdProveedorId() {
        return this.prodProveedorId;
    }
    
    public void setProdProveedorId(BigDecimal prodProveedorId) {
        this.prodProveedorId = prodProveedorId;
    }
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    public String getProdProveedorNombre() {
        return this.prodProveedorNombre;
    }
    
    public void setProdProveedorNombre(String prodProveedorNombre) {
        this.prodProveedorNombre = prodProveedorNombre;
    }
    public String getProdProveedorMarca() {
        return this.prodProveedorMarca;
    }
    
    public void setProdProveedorMarca(String prodProveedorMarca) {
        this.prodProveedorMarca = prodProveedorMarca;
    }
    public String getProdProveedorModelo() {
        return this.prodProveedorModelo;
    }
    
    public void setProdProveedorModelo(String prodProveedorModelo) {
        this.prodProveedorModelo = prodProveedorModelo;
    }
    public BigDecimal getProdProveedorAnio() {
        return this.prodProveedorAnio;
    }
    
    public void setProdProveedorAnio(BigDecimal prodProveedorAnio) {
        this.prodProveedorAnio = prodProveedorAnio;
    }
    public Double getProdProveedorBtu() {
        return this.prodProveedorBtu;
    }
    
    public void setProdProveedorBtu(Double prodProveedorBtu) {
        this.prodProveedorBtu = prodProveedorBtu;
    }
    public Double getProdProveedorPotencia() {
        return this.prodProveedorPotencia;
    }
    
    public void setProdProveedorPotencia(Double prodProveedorPotencia) {
        this.prodProveedorPotencia = prodProveedorPotencia;
    }
    public String getProdProveedorColor() {
        return this.prodProveedorColor;
    }
    
    public void setProdProveedorColor(String prodProveedorColor) {
        this.prodProveedorColor = prodProveedorColor;
    }
    public BigDecimal getProdProveedorExistencias() {
        return this.prodProveedorExistencias;
    }
    
    public void setProdProveedorExistencias(BigDecimal prodProveedorExistencias) {
        this.prodProveedorExistencias = prodProveedorExistencias;
    }
    public String getProdProveedorDescripcion() {
        return this.prodProveedorDescripcion;
    }
    
    public void setProdProveedorDescripcion(String prodProveedorDescripcion) {
        this.prodProveedorDescripcion = prodProveedorDescripcion;
    }
    public Double getProdProveedorVoltaje() {
        return this.prodProveedorVoltaje;
    }
    
    public void setProdProveedorVoltaje(Double prodProveedorVoltaje) {
        this.prodProveedorVoltaje = prodProveedorVoltaje;
    }
    public Double getProdProveedorArea() {
        return this.prodProveedorArea;
    }
    
    public void setProdProveedorArea(Double prodProveedorArea) {
        this.prodProveedorArea = prodProveedorArea;
    }




}

