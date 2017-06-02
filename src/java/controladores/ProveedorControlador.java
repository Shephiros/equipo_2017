package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.MunicipiosDao;
import dao.ProductosProveedorDao;
import dao.ProveedoresDao;
import entidades.Municipios;
import entidades.ProductosProveedor;
import entidades.Proveedores;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ProveedorControlador extends ActionSupport{

//****************************************************************************//
//                                  Variables                                 //
//****************************************************************************//

    private ArrayList<Municipios> todosMunicipios;
    private ArrayList<Proveedores> todosProveedores;
    private ArrayList<ProductosProveedor> todosProductosProveedor;
    private Municipios municipioSeleccionado = new Municipios();
    private Proveedores proveedorSeleccionado = new Proveedores();
    private ProductosProveedor prodProveedorSeleccionado = new ProductosProveedor();
    private ProductosProveedor nuevoProdProveedor = new ProductosProveedor();
    private BigDecimal proveedorId;
    private BigDecimal prodProveedorId;
    private BigDecimal municipioId;
    
//****************************************************************************//
//                            Métodos para guardar                            //
//****************************************************************************//

    public String guardarProdProveedor() throws Exception{
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        ProductosProveedorDao gProdProveedor = new ProductosProveedorDao();
        Proveedores proveedorU = new Proveedores();
        proveedorU.setProveedorId(proveedorId);
        this.nuevoProdProveedor.setProveedores(proveedorU);
        gProdProveedor.guardarProductosProveedor(nuevoProdProveedor);
        this.setProveedorId(BigDecimal.ZERO);
        nuevoProdProveedor = new ProductosProveedor();
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        execute();
        return SUCCESS;
    }
    
//****************************************************************************//
//                           Métodos para actualizar                          //
//****************************************************************************//

    public String actualizarProdProveedor() throws Exception{
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        ProductosProveedorDao eProdProveedor = new ProductosProveedorDao();
        Proveedores proveedorU = new Proveedores(); 
        proveedorU.setProveedorId(proveedorId);
        this.prodProveedorSeleccionado.setProveedores(proveedorU);
        /*Guardando y cargando el nuevo rol*/
        eProdProveedor.actualizarProdProveedor(prodProveedorSeleccionado);
        execute();
        return SUCCESS;
    }
    
    public String actualizarProveedor() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        ProveedoresDao eProveedor = new ProveedoresDao();
        Municipios municipioU = new Municipios(); 
        municipioU.setMunicipioId(municipioId);
        this.proveedorSeleccionado.setMunicipios(municipioU);
        /*Guardando y cargando el nuevo rol*/
        eProveedor.actualizarProveedor(proveedorSeleccionado);
        execute();
        return SUCCESS;
    }
    
//****************************************************************************//
//                                Otros métodos                               //
//****************************************************************************//

    @Override
    public String execute() throws Exception {
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        this.todosProductosProveedor = new ProductosProveedorDao().todosProductosProveedor();
        return SUCCESS;
    }
    
    public String nuevoProdProveedor(){
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        return SUCCESS;
    }
    
    public String verProdProveedor(){
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        ProductosProveedorDao vProdProveedor = new ProductosProveedorDao();
        this.prodProveedorSeleccionado = vProdProveedor.prodProveedorPorId(prodProveedorId);
        ProveedoresDao proveedorDao = new ProveedoresDao();
        this.proveedorSeleccionado = proveedorDao.proveedorPorId(prodProveedorSeleccionado.getProveedores().getProveedorId());
        return SUCCESS;
    }
    
    public String nuevoProveedor(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
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

    public ArrayList<ProductosProveedor> getTodosProductosProveedor() {
        return todosProductosProveedor;
    }
    public void setTodosProductosProveedor(ArrayList<ProductosProveedor> todosProductosProveedor) {
        this.todosProductosProveedor = todosProductosProveedor;
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

    public BigDecimal getProdProveedorId() {
        return prodProveedorId;
    }
    public void setProdProveedorId(BigDecimal prodProveedorId) {
        this.prodProveedorId = prodProveedorId;
    }

    public ProductosProveedor getNuevoProdProveedor() {
        return nuevoProdProveedor;
    }
    public void setNuevoProdProveedor(ProductosProveedor nuevoProdProveedor) {
        this.nuevoProdProveedor = nuevoProdProveedor;
    }

    public ProductosProveedor getProdProveedorSeleccionado() {
        return prodProveedorSeleccionado;
    }
    public void setProdProveedorSeleccionado(ProductosProveedor prodProveedorSeleccionado) {
        this.prodProveedorSeleccionado = prodProveedorSeleccionado;
    }

    public BigDecimal getMunicipioId() {
        return municipioId;
    }
    public void setMunicipioId(BigDecimal municipioId) {
        this.municipioId = municipioId;
    }

}
