package controladores;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.DepartamentosDao;
import dao.DepartamentosInstitucionDao;
import dao.InstitucionesDao;
import dao.MunicipiosDao;
import dao.ProductosInstitucionDao;
import entidades.Departamentos;
import entidades.DepartamentosInstitucion;
import entidades.Instituciones;
import entidades.Municipios;
import entidades.ProductosInstitucion;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class InstitucionControlador extends ActionSupport{
    
//****************************************************************************//
//                                  Variables                                 //
//****************************************************************************//
    
    private ArrayList<Departamentos> todosDepartamentos;
    private ArrayList<DepartamentosInstitucion> todosDeptosInstitucion;
    private ArrayList<Instituciones> todasInstituciones;
    private ArrayList<Municipios> todosMunicipios;
    private ArrayList<ProductosInstitucion> todosProductosInstitucion;
    private DepartamentosInstitucion nuevoDeptoInstitucion = new DepartamentosInstitucion();
    private DepartamentosInstitucion deptoInstitucionSeleccionado = new DepartamentosInstitucion();
    private Instituciones nuevaInstitucion = new Instituciones();
    private Instituciones institucionSeleccionada = new Instituciones();
    private Municipios municipioSeleccionado = new Municipios();
    private ProductosInstitucion nuevoProdInstitucion = new ProductosInstitucion();
    private ProductosInstitucion prodInstitucionSeleccionado = new ProductosInstitucion();
    private BigDecimal deptoInstitucionId;
    private BigDecimal institucionId;
    private BigDecimal municipioId;
    private BigDecimal prodInstitucionId;
    
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
//****************************************************************************//
//                        Métodos para CRUD Instituciones                     //
//****************************************************************************//
    
    //Método para mostrar listado de instituciones.
    public String verListadoInstituciones()throws Exception {
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }

    //Método para mostrar pantalla de nueva institución.
    public String nuevaInstitucion(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        return SUCCESS;
    }

    //Método que guarda una nueva institución.
    public String guardarInstitucion() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao gInstitucion = new InstitucionesDao();
        Municipios municipioU = new Municipios();
        municipioU.setMunicipioId(municipioId);
        this.nuevaInstitucion.setMunicipios(municipioU);
        gInstitucion.guardarInstitucion(nuevaInstitucion);
        verListadoInstituciones();
        return SUCCESS;
    }
    
    //Método que actualiza una institución.
    public String actualizarInstitucion() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao eInstitucion = new InstitucionesDao();
        Municipios municipioU = new Municipios(); 
        municipioU.setMunicipioId(municipioId);
        this.institucionSeleccionada.setMunicipios(municipioU);
        eInstitucion.actualizarInstitucion(institucionSeleccionada);
        verListadoInstituciones();
        return SUCCESS;
    }
    
    //Método que muestra una institución.
    public String verInstitucion(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao vInstitucion = new InstitucionesDao();
        this.institucionSeleccionada = vInstitucion.institucionPorId(institucionId);
        MunicipiosDao municipioDao = new MunicipiosDao();
        this.municipioSeleccionado = municipioDao.municipionPorId(institucionSeleccionada.getMunicipios().getMunicipioId());
        return SUCCESS;
    }
    
//****************************************************************************//
//                       Métodos para CRUD Departamentos                      //
//****************************************************************************//
    
    //Método para mostrar listado de unidades institucionales.
    public String verListadoDepartamentos()throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }

    //Método para mostrar pantalla de nueva unidad institucional.
    public String nuevoDepartamento(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }
    
    //Método que guarda una nueva uniad institucional.
    public String guardarDepartamento() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            Instituciones institucionU = new Instituciones(); 
            institucionU.setInstitucionId(institucionId);
            this.nuevoDeptoInstitucion.setInstituciones(institucionU);}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.nuevoDeptoInstitucion.setInstituciones((Instituciones)session.getAttribute("institucion"));}
        DepartamentosInstitucionDao gDepartamento = new DepartamentosInstitucionDao();
        gDepartamento.guardarDeptoInstitucion(nuevoDeptoInstitucion);
        verListadoDepartamentos();
        return SUCCESS;
    }
    
    //Método que actualiza una unidad institucional.
    public String actualizarDepartamento() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            Instituciones institucionU = new Instituciones(); 
            institucionU.setInstitucionId(institucionId);
            this.deptoInstitucionSeleccionado.setInstituciones(institucionU);}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.deptoInstitucionSeleccionado.setInstituciones((Instituciones)session.getAttribute("institucion"));}
        DepartamentosInstitucionDao eDepartamento = new DepartamentosInstitucionDao();
        eDepartamento.actualizarDeptoInstitucion(deptoInstitucionSeleccionado);
        verListadoDepartamentos();
        return SUCCESS;
    }
    
    //Método que muestra una unidad institucional.
    public String verDepartamento(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        DepartamentosInstitucionDao vDeptoInstitucion = new DepartamentosInstitucionDao();
        this.deptoInstitucionSeleccionado = vDeptoInstitucion.deptoInstitucionPorId(deptoInstitucionId);
        InstitucionesDao institucionDao = new InstitucionesDao();
        this.institucionSeleccionada = institucionDao.institucionPorId(deptoInstitucionSeleccionado.getInstituciones().getInstitucionId());
        return SUCCESS;
    }
    
//****************************************************************************//
//                    Métodos para CRUD ProductosInstitucion                  //
//****************************************************************************//
    
    //Método para mostrar listado de productos de institución.
    public String verListadoProdInstitucion()throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.todosProductosInstitucion = new ProductosInstitucionDao().todosProductosInstitucion();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todosProductosInstitucion = new ProductosInstitucionDao().todosProductosPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }

    //Método para mostrar pantalla de nuevo producto de institución.
    public String nuevoProdInstitucion(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }
    
    //Método que guarda un nuevo producto de institución.
    public String guardarProdInstitucion() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            Instituciones institucionU = new Instituciones(); 
            institucionU.setInstitucionId(institucionId);
            this.nuevoProdInstitucion.setInstituciones(institucionU);}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.nuevoProdInstitucion.setInstituciones((Instituciones)session.getAttribute("institucion"));}
        ProductosInstitucionDao gProdInstitucion = new ProductosInstitucionDao();
        gProdInstitucion.guardarProductosInstitucion(nuevoProdInstitucion);
        verListadoProdInstitucion();
        return SUCCESS;
    }

    //Método que actualiza un producto de institución.
    public String actualizarProdInstitucion() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            Instituciones institucionU = new Instituciones(); 
            institucionU.setInstitucionId(institucionId);
            this.prodInstitucionSeleccionado.setInstituciones(institucionU);}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.prodInstitucionSeleccionado.setInstituciones((Instituciones)session.getAttribute("institucion"));}
        ProductosInstitucionDao eProdInstitucion = new ProductosInstitucionDao();
        eProdInstitucion.actualizarProdInstitucion(prodInstitucionSeleccionado);
        verListadoProdInstitucion();
        return SUCCESS;
    }
    
    //Método que muestra un producto de institución.
    public String verProdInstitucion(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        ProductosInstitucionDao vProdInstitucion = new ProductosInstitucionDao();
        this.prodInstitucionSeleccionado = vProdInstitucion.prodInstitucionPorId(prodInstitucionId);
        InstitucionesDao institucionDao = new InstitucionesDao();
        this.institucionSeleccionada = institucionDao.institucionPorId(prodInstitucionSeleccionado.getInstituciones().getInstitucionId());
        return SUCCESS;
    }
    
//****************************************************************************//
//                      Métodos GET y SET para variables                      //
//****************************************************************************//
    
    public ArrayList<Departamentos> getTodosDepartamentos() {
        return todosDepartamentos;
    }
    public void setTodosDepartamentos(ArrayList<Departamentos> todosDepartamentos) {
        this.todosDepartamentos = todosDepartamentos;
    }

    public ArrayList<DepartamentosInstitucion> getTodosDeptosInstitucion() {
        return todosDeptosInstitucion;
    }
    public void setTodosDeptosInstitucion(ArrayList<DepartamentosInstitucion> todosDeptosInstitucion) {
        this.todosDeptosInstitucion = todosDeptosInstitucion;
    }

    public ArrayList<Instituciones> getTodasInstituciones() {
        return todasInstituciones;
    }
    public void setTodasInstituciones(ArrayList<Instituciones> todasInstituciones) {
        this.todasInstituciones = todasInstituciones;
    }

    public ArrayList<Municipios> getTodosMunicipios() {
        return todosMunicipios;
    }
    public void setTodosMunicipios(ArrayList<Municipios> todosMunicipios) {
        this.todosMunicipios = todosMunicipios;
    }

    public ArrayList<ProductosInstitucion> getTodosProductosInstitucion() {
        return todosProductosInstitucion;
    }
    public void setTodosProductosInstitucion(ArrayList<ProductosInstitucion> todosProductosInstitucion) {
        this.todosProductosInstitucion = todosProductosInstitucion;
    }

    public DepartamentosInstitucion getNuevoDeptoInstitucion() {
        return nuevoDeptoInstitucion;
    }
    public void setNuevoDeptoInstitucion(DepartamentosInstitucion nuevoDeptoInstitucion) {
        this.nuevoDeptoInstitucion = nuevoDeptoInstitucion;
    }

    public Instituciones getNuevaInstitucion() {
        return nuevaInstitucion;
    }
    public void setNuevaInstitucion(Instituciones nuevaInstitucion) {
        this.nuevaInstitucion = nuevaInstitucion;
    }

    public ProductosInstitucion getNuevoProdInstitucion() {
        return nuevoProdInstitucion;
    }
    public void setNuevoProdInstitucion(ProductosInstitucion nuevoProdInstitucion) {
        this.nuevoProdInstitucion = nuevoProdInstitucion;
    }
    
    public BigDecimal getDeptoInstitucionId() {
        return deptoInstitucionId;
    }
    public void setDeptoInstitucionId(BigDecimal deptoInstitucionId) {
        this.deptoInstitucionId = deptoInstitucionId;
    }

    public BigDecimal getInstitucionId() {
        return institucionId;
    }
    public void setInstitucionId(BigDecimal institucionId) {
        this.institucionId = institucionId;
    }

    public BigDecimal getMunicipioId() {
        return municipioId;
    }
    public void setMunicipioId(BigDecimal municipioId) {
        this.municipioId = municipioId;
    }

    public BigDecimal getProdInstitucionId() {
        return prodInstitucionId;
    }
    public void setProdInstitucionId(BigDecimal prodInstitucionId) {
        this.prodInstitucionId = prodInstitucionId;
    }
        
    public DepartamentosInstitucion getDeptoInstitucionSeleccionado() {
        return deptoInstitucionSeleccionado;
    }
    public void setDeptoInstitucionSeleccionado(DepartamentosInstitucion deptoInstitucionSeleccionado) {
        this.deptoInstitucionSeleccionado = deptoInstitucionSeleccionado;
    }

    public Instituciones getInstitucionSeleccionada() {
        return institucionSeleccionada;
    }
    public void setInstitucionSeleccionada(Instituciones institucionSeleccionada) {
        this.institucionSeleccionada = institucionSeleccionada;
    }

    public Municipios getMunicipioSeleccionado() {
        return municipioSeleccionado;
    }
    public void setMunicipioSeleccionado(Municipios municipioSeleccionado) {
        this.municipioSeleccionado = municipioSeleccionado;
    }

    public ProductosInstitucion getProdInstitucionSeleccionado() {
        return prodInstitucionSeleccionado;
    }
    public void setProdInstitucionSeleccionado(ProductosInstitucion prodInstitucionSeleccionado) {
        this.prodInstitucionSeleccionado = prodInstitucionSeleccionado;
    }
    
}
