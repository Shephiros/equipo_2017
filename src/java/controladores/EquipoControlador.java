package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.EquiposDao;
import entidades.Equipos;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class EquipoControlador extends ActionSupport {

    private ArrayList<Equipos>todosEquipos;
        
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
    
    public ArrayList<Equipos> getTodosEquipos() {
        return todosEquipos;
    }
    public void setTodosEquipos(ArrayList<Equipos> todosEquipos) {
        this.todosEquipos = todosEquipos;
    }
    
}
