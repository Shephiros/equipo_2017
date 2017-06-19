package controladores;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.CondicionesDao;
import dao.InstitucionesDao;
import dao.MunicipiosDao;
import dao.ProductosProveedorDao;
import dao.ProveedoresDao;
import dao.UsuariosDao;
import entidades.Condiciones;
import entidades.Instituciones;
import entidades.Municipios;
import entidades.ProductosProveedor;
import entidades.Proveedores;
import entidades.Roles;
import entidades.Usuarios;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class ProveedorControlador extends ActionSupport{

//****************************************************************************//
//                                  Variables                                 //
//****************************************************************************//

    private ArrayList<Municipios> todosMunicipios;
    private ArrayList<Proveedores> todosProveedores;
    private ArrayList<ProductosProveedor> todosProductosProveedor;
    private Municipios municipioSeleccionado = new Municipios();
    private Instituciones institucionSeleccionada = new Instituciones();
    private Proveedores proveedorSeleccionado = new Proveedores();
    private Condiciones condicionSeleccionada= new Condiciones();
    private Proveedores nuevoProveedor = new Proveedores();
    private Usuarios nuevoUsuario = new Usuarios();
    private ProductosProveedor prodProveedorSeleccionado = new ProductosProveedor();
    private ProductosProveedor nuevoProdProveedor = new ProductosProveedor();
    private BigDecimal proveedorId;
    private BigDecimal prodProveedorId;
    private BigDecimal municipioId;
    private String condicionInstalacion;
    
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
//****************************************************************************//
//                         Métodos para CRUD Proveedores                      //
//****************************************************************************//
    
    //Método para mostrar listado de proveedores.
    public String verListadoProveedores()throws Exception {
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        return SUCCESS;
    }

    //Método para mostrar pantalla de nuevo proveedor.
    public String nuevoProveedor(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        return SUCCESS;
    }

    //Método que guarda un proveedor y crea su respectivo usuario.
    public String guardarProveedor() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        ProveedoresDao gProveedor = new ProveedoresDao();
        Municipios municipioU = new Municipios();
        municipioU.setMunicipioId(municipioId);
        this.nuevoProveedor.setMunicipios(municipioU);
        gProveedor.guardarProveedor(nuevoProveedor);
        UsuariosDao gUsuario = new UsuariosDao();
        Roles rolU = new Roles();
        rolU.setRolId(BigDecimal.ONE);
        this.nuevoUsuario.setProveedores(nuevoProveedor);
        this.nuevoUsuario.setRoles(rolU);
        this.nuevoUsuario.setUsuarioBloqueado(BigDecimal.ONE);
        this.nuevoUsuario.setUsuarioEstado(BigDecimal.ONE);
        gUsuario.guardarUsuario(nuevoUsuario);
        verListadoProveedores();
        return SUCCESS;
    }
    
    //Método que actualiza un proveedor.
    public String actualizarProveedor() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        ProveedoresDao eProveedor = new ProveedoresDao();
        Municipios municipioU = new Municipios(); 
        municipioU.setMunicipioId(municipioId);
        this.proveedorSeleccionado.setMunicipios(municipioU);
        eProveedor.actualizarProveedor(proveedorSeleccionado);
        verListadoProveedores();
        return SUCCESS;
    }
    
    //Método que muestra un proveedor.
    public String verProveedor(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        ProveedoresDao vProveedor = new ProveedoresDao();
        this.proveedorSeleccionado = vProveedor.proveedorPorId(proveedorId);
        MunicipiosDao municipioDao = new MunicipiosDao();
        this.municipioSeleccionado = municipioDao.municipionPorId(proveedorSeleccionado.getMunicipios().getMunicipioId());
        return SUCCESS;
    }
    
    //Método que muestra una condición.
    public String verCondicion(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        ProveedoresDao proveedorU = new ProveedoresDao();
        this.proveedorSeleccionado = proveedorU.proveedorPorId(proveedorId);
        InstitucionesDao institucionU = new InstitucionesDao();
        this.institucionSeleccionada = institucionU.institucionPorId((BigDecimal)session.getAttribute("institucion_Id"));
        CondicionesDao condicionU = new CondicionesDao();
        this.condicionSeleccionada = condicionU.condicionPorInstitucionIdProveedorId((BigDecimal)session.getAttribute("institucion_Id"), proveedorId);
        
        if(condicionSeleccionada.getCondicionInstalacion().equals(BigDecimal.ONE)){
          this.condicionInstalacion = "Permite instalación";
        }else{
          this.condicionInstalacion = "No permite instalación";
        }
        return SUCCESS;
    }
    
    //Método que actualiza una condicion de proveedor.
    public String actualizarCondicionM() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        CondicionesDao eCondicion = new CondicionesDao();
        ProveedoresDao proveedorU = new ProveedoresDao();
        this.condicionSeleccionada.setProveedores(proveedorU.proveedorPorId(proveedorSeleccionado.getProveedorId()));
        this.condicionSeleccionada.setInstituciones((Instituciones)session.getAttribute("institucion"));
        if(condicionInstalacion.equals("Permite instalación")){
        this.condicionSeleccionada.setCondicionInstalacion(BigDecimal.ONE);}
        else{
        this.condicionSeleccionada.setCondicionInstalacion(BigDecimal.ZERO);}
        eCondicion.actualizarCondicion(condicionSeleccionada);
        verListadoProveedores();
        return SUCCESS;
    }
    
//****************************************************************************//
//                      Métodos para CRUD ProductosProveedor                  //
//****************************************************************************//
    
    //Método para mostrar listado de proveedores.
    public String verListadoProdProveedor()throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.todosProductosProveedor = new ProductosProveedorDao().todosProductosPorProveedor((BigDecimal)session.getAttribute("proveedor_Id"));}
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todosProductosProveedor = new ProductosProveedorDao().todosProductosProveedor();}
        return SUCCESS;
    }

    //Método para mostrar pantalla de nuevo producto de proveedor.
    public String nuevoProdProveedor(){
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        return SUCCESS;
    }
    
    //Método que guarda un nuevo producto de proveedor.
    public String guardarProdProveedor() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            Proveedores proveedorU = new Proveedores();
            proveedorU.setProveedorId(proveedorId);
            this.nuevoProdProveedor.setProveedores(proveedorU);}
        if(session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.nuevoProdProveedor.setProveedores((Proveedores)session.getAttribute("proveedor"));}
        ProductosProveedorDao gProdProveedor = new ProductosProveedorDao();
        gProdProveedor.guardarProductosProveedor(nuevoProdProveedor);
        verListadoProdProveedor();
        return SUCCESS;
    }
    
    public String guardarProveedorProced() throws Exception{
        ProveedoresDao guardar= new ProveedoresDao();
        guardar.pro_proveedor_usuario(municipioId, nuevoProveedor.getProveedorEmpresa(), 
                                      nuevoProveedor.getProveedorContacto(),
                                      nuevoUsuario.getUsuarioUsuario(),
                                      nuevoUsuario.getUsuarioNombre(), 
                                      nuevoUsuario.getUsuarioCorreo(),
                                      nuevoUsuario.getUsuarioContrasenia());
        execute();
        return SUCCESS;
    }
    
    //Método que actualiza un producto de proveedor.
    public String actualizarProdProveedor() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            Proveedores proveedorU = new Proveedores();
            proveedorU.setProveedorId(proveedorId);
            this.prodProveedorSeleccionado.setProveedores(proveedorU);}
        if(session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.prodProveedorSeleccionado.setProveedores((Proveedores)session.getAttribute("proveedor"));}
        ProductosProveedorDao eProdProveedor = new ProductosProveedorDao();
        eProdProveedor.actualizarProdProveedor(prodProveedorSeleccionado);
        verListadoProdProveedor();
        return SUCCESS;
    }
    
    //Método que muestra un producto de proveedor.
    public String verProdProveedor(){
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        ProductosProveedorDao vProdProveedor = new ProductosProveedorDao();
        this.prodProveedorSeleccionado = vProdProveedor.prodProveedorPorId(prodProveedorId);
        ProveedoresDao proveedorDao = new ProveedoresDao();
        this.proveedorSeleccionado = proveedorDao.proveedorPorId(prodProveedorSeleccionado.getProveedores().getProveedorId());
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

    public Proveedores getNuevoProveedor() {
        return nuevoProveedor;
    }
    public void setNuevoProveedor(Proveedores nuevoProveedor) {
        this.nuevoProveedor = nuevoProveedor;
    }

    public Usuarios getNuevoUsuario() {
        return nuevoUsuario;
    }
    public void setNuevoUsuario(Usuarios nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }

    public Instituciones getInstitucionSeleccionada() {
        return institucionSeleccionada;
    }
    public void setInstitucionSeleccionada(Instituciones institucionSeleccionada) {
        this.institucionSeleccionada = institucionSeleccionada;
    }

    public Condiciones getCondicionSeleccionada() {
        return condicionSeleccionada;
    }
    public void setCondicionSeleccionada(Condiciones condicionSeleccionada) {
        this.condicionSeleccionada = condicionSeleccionada;
    }

    public String getCondicionInstalacion() {
        return condicionInstalacion;
    }
    public void setCondicionInstalacion(String condicionInstalacion) {
        this.condicionInstalacion = condicionInstalacion;
    }

    
    
}
