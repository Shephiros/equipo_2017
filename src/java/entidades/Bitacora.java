package entidades;
// Generated 06-04-2017 06:18:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Bitacora generated by hbm2java
 */
public class Bitacora  implements java.io.Serializable {


     private BigDecimal bitacoraId;
     private String bitacoraUsuario;
     private Date bitacoraFecha;
     private String bitacoraMovimiento;

    public Bitacora() {
    }

    public Bitacora(BigDecimal bitacoraId, String bitacoraUsuario, Date bitacoraFecha, String bitacoraMovimiento) {
       this.bitacoraId = bitacoraId;
       this.bitacoraUsuario = bitacoraUsuario;
       this.bitacoraFecha = bitacoraFecha;
       this.bitacoraMovimiento = bitacoraMovimiento;
    }
   
    public BigDecimal getBitacoraId() {
        return this.bitacoraId;
    }
    
    public void setBitacoraId(BigDecimal bitacoraId) {
        this.bitacoraId = bitacoraId;
    }
    public String getBitacoraUsuario() {
        return this.bitacoraUsuario;
    }
    
    public void setBitacoraUsuario(String bitacoraUsuario) {
        this.bitacoraUsuario = bitacoraUsuario;
    }
    public Date getBitacoraFecha() {
        return this.bitacoraFecha;
    }
    
    public void setBitacoraFecha(Date bitacoraFecha) {
        this.bitacoraFecha = bitacoraFecha;
    }
    public String getBitacoraMovimiento() {
        return this.bitacoraMovimiento;
    }
    
    public void setBitacoraMovimiento(String bitacoraMovimiento) {
        this.bitacoraMovimiento = bitacoraMovimiento;
    }




}


