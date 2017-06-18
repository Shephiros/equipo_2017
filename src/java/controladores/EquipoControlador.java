package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.ComprasDao;
import dao.EquiposDao;
import entidades.Compras;
import entidades.Equipos;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class EquipoControlador extends ActionSupport {

    private ArrayList<Equipos>todosEquipos;
    private ArrayList<Compras>todasCompras;
    private String estadoE;
    private Equipos nuevoEquipo;
    private BigDecimal compraId;
        
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    //Método para mostrar listado de equipos.
    public String verListadoEquipos() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todosEquipos = new EquiposDao().todosEquipos();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todosEquipos = new EquiposDao().todosEquiposPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    //Metodo para ver pantalla guardar se puede ir en el execute
    public String nuevoEquipo() {
        this.todasCompras = new ComprasDao().todasCompras();
        return SUCCESS;
    }
    
    //Metodo para guardar equipo utilizando procedimiento
    public String guardarEquipoPro(){
        EquiposDao guardar= new EquiposDao();
        if(estadoE.equals("Activo"))
            this.nuevoEquipo.setEquipoEstado(BigDecimal.ONE);
        else
            this.nuevoEquipo.setEquipoEstado(BigDecimal.ZERO);
        
        guardar.equipo_ingreso_pro(compraId, 
                                   nuevoEquipo.getEquipoNombre(), 
                                   nuevoEquipo.getEquipoMarca(), 
                                   nuevoEquipo.getEquipoModelo(), 
                                   nuevoEquipo.getEquipoAnioFabricacion(), 
                                   nuevoEquipo.getEquipoBtu(), 
                                   nuevoEquipo.getEquipoPotencia(), 
                                   nuevoEquipo.getEquipoEstado());
        return SUCCESS;
    }
    
    public ArrayList<Equipos> getTodosEquipos() {
        return todosEquipos;
    }
    public void setTodosEquipos(ArrayList<Equipos> todosEquipos) {
        this.todosEquipos = todosEquipos;
    }

    public ArrayList<Compras> getTodasCompras() {
        return todasCompras;
    }
    public void setTodasCompras(ArrayList<Compras> todasCompras) {
        this.todasCompras = todasCompras;
    }

    public String getEstadoE() {
        return estadoE;
    }
    public void setEstadoE(String estadoE) {
        this.estadoE = estadoE;
    }

    public Equipos getNuevoEquipo() {
        return nuevoEquipo;
    }
    public void setNuevoEquipo(Equipos nuevoEquipo) {
        this.nuevoEquipo = nuevoEquipo;
    }

    public BigDecimal getCompraId() {
        return compraId;
    }
    public void setCompraId(BigDecimal compraId) {
        this.compraId = compraId;
    }
    
    
}
