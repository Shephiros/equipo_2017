package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.ComprasDao;
import dao.LicitacionesDao;
import dao.SolicitudesDao;
import entidades.Compras;
import entidades.Licitaciones;
import entidades.Solicitudes;
import java.util.ArrayList;

public class ComprasControlador extends ActionSupport{
    private ArrayList<Solicitudes>todasSolicitudes;
    private ArrayList<Licitaciones>todasLicitaciones;
    private ArrayList<Compras>todasCompras;
    
    @Override
    public String execute() throws Exception {
        this.todasSolicitudes = new SolicitudesDao().todasSolicitudes();
        this.todasLicitaciones = new LicitacionesDao().todasLicitaciones();
        this.todasCompras = new ComprasDao().todasCompras();
        return SUCCESS;
    }
    
    public ArrayList<Solicitudes> getTodasSolicitudes() {
        return todasSolicitudes;
    }
    public void setTodasSolicitudes(ArrayList<Solicitudes> todasSolicitudes) {
        this.todasSolicitudes = todasSolicitudes;
    }

    public ArrayList<Licitaciones> getTodasLicitaciones() {
        return todasLicitaciones;
    }
    public void setTodasLicitaciones(ArrayList<Licitaciones> todasLicitaciones) {
        this.todasLicitaciones = todasLicitaciones;
    }

    public ArrayList<Compras> getTodasCompras() {
        return todasCompras;
    }
    public void setTodasCompras(ArrayList<Compras> todasCompras) {
        this.todasCompras = todasCompras;
    }

}
