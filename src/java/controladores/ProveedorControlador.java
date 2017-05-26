package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.MunicipiosDao;
import dao.ProveedoresDao;
import entidades.Municipios;
import entidades.Proveedores;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ProveedorControlador extends ActionSupport{

//****************************************************************************//
//                                  Variables                                 //
//****************************************************************************//

    private ArrayList<Municipios> todosMunicipios;
    private ArrayList<Proveedores> todosProveedores;
    private Municipios municipioSeleccionado = new Municipios();
    private Proveedores proveedorSeleccionado = new Proveedores();
    private BigDecimal proveedorId;
    
//****************************************************************************//
//                                Otros métodos                               //
//****************************************************************************//

    @Override
    public String execute() throws Exception {
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        return SUCCESS;
    }
    
    public String verProveedor(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        ProveedoresDao vProveedor = new ProveedoresDao();
        this.proveedorSeleccionado = vProveedor.proveedorPorId(proveedorId);
        MunicipiosDao municipioDao = new MunicipiosDao();
        this.municipioSeleccionado = municipioDao.municipionPorId(proveedorSeleccionado.getMunicipios().getMunicipioId());
        return SUCCESS;
    }
    
//****************************************************************************//
//                      Métodos GET y SET para variables                      //
//****************************************************************************//

    public ArrayList<Municipios> getTodosMunicipios() {
        return todosMunicipios;
    }
    public void setTodosMunicipios(ArrayList<Municipios> todosMunicipios) {
        this.todosMunicipios = todosMunicipios;
    }

    public ArrayList<Proveedores> getTodosProveedores() {
        return todosProveedores;
    }
    public void setTodosProveedores(ArrayList<Proveedores> todosProveedores) {
        this.todosProveedores = todosProveedores;
    }

    public BigDecimal getProveedorId() {
        return proveedorId;
    }
    public void setProveedorId(BigDecimal proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Municipios getMunicipioSeleccionado() {
        return municipioSeleccionado;
    }
    public void setMunicipioSeleccionado(Municipios municipioSeleccionado) {
        this.municipioSeleccionado = municipioSeleccionado;
    }

    public Proveedores getProveedorSeleccionado() {
        return proveedorSeleccionado;
    }
    public void setProveedorSeleccionado(Proveedores proveedorSeleccionado) {
        this.proveedorSeleccionado = proveedorSeleccionado;
    }
    
}
