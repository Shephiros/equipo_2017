package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.SolicitudesDao;
import entidades.Solicitudes;
import java.util.ArrayList;

public class ComprasControlador extends ActionSupport{
    private ArrayList<Solicitudes>todasSolicitudes;

    @Override
    public String execute() throws Exception {
        this.todasSolicitudes=new SolicitudesDao().todasSolicitudes();
        return SUCCESS;
    }
    
    public ArrayList<Solicitudes> getTodasSolicitudes() {
        return todasSolicitudes;
    }
    public void setTodasSolicitudes(ArrayList<Solicitudes> todasSolicitudes) {
        this.todasSolicitudes = todasSolicitudes;
    }
    
}
