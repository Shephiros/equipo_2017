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
    
//****************************************************************************//
//                            Métodos para guardar                            //
//****************************************************************************//
    
    public String guardarDepartamento() throws Exception{
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        DepartamentosInstitucionDao gDepartamento = new DepartamentosInstitucionDao();
        Instituciones institucionU = new Instituciones();
        institucionU.setInstitucionId(institucionId);
        this.nuevoDeptoInstitucion.setInstituciones(institucionU);
        gDepartamento.guardarDeptoInstitucion(nuevoDeptoInstitucion);
        this.setInstitucionId(BigDecimal.ZERO);
        nuevoDeptoInstitucion = new DepartamentosInstitucion();
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        execute();
        return SUCCESS;
    }
    
    public String guardarInstitucion() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao gInstitucion = new InstitucionesDao();
        Municipios municipioU = new Municipios();
        municipioU.setMunicipioId(municipioId);
        this.nuevaInstitucion.setMunicipios(municipioU);
        gInstitucion.guardarInstitucion(nuevaInstitucion);
        this.setMunicipioId(BigDecimal.ZERO);
        nuevaInstitucion = new Instituciones();
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        this.todosDepartamentos = new DepartamentosDao().todosDepartamentos();
        execute();
        return SUCCESS;
    }
    
    public String guardarProdInstitucion() throws Exception{
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        ProductosInstitucionDao gProdInstitucion = new ProductosInstitucionDao();
        Instituciones institucionU = new Instituciones();
        institucionU.setInstitucionId(institucionId);
        this.nuevoProdInstitucion.setInstituciones(institucionU);
        gProdInstitucion.guardarProductosInstitucion(nuevoProdInstitucion);
        this.setInstitucionId(BigDecimal.ZERO);
        nuevoProdInstitucion = new ProductosInstitucion();
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        execute();
        return SUCCESS;
    }

//****************************************************************************//
//                           Métodos para actualizar                          //
//****************************************************************************//
    
    public String actualizarDepartamento() throws Exception{
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        DepartamentosInstitucionDao eDepartamento = new DepartamentosInstitucionDao();
        Instituciones institucionU = new Instituciones(); 
        institucionU.setInstitucionId(institucionId);
        this.deptoInstitucionSeleccionado.setInstituciones(institucionU);
        /*Guardando y cargando el nuevo rol*/
        eDepartamento.actualizarDeptoInstitucion(deptoInstitucionSeleccionado);
        execute();
        return SUCCESS;
    }
    
    public String actualizarInstitucion() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao eInstitucion = new InstitucionesDao();
        Municipios municipioU = new Municipios(); 
        municipioU.setMunicipioId(municipioId);
        this.institucionSeleccionada.setMunicipios(municipioU);
        System.out.println("Objeto: "+getInstitucionSeleccionada());
        System.out.println("Nombre: "+getInstitucionSeleccionada().getInstitucionNombre());
        System.out.println("IdBig: "+getInstitucionId());
        System.out.println("Id: "+getInstitucionSeleccionada().getInstitucionId());
        /*Guardando y cargando el nuevo rol*/
        eInstitucion.actualizarInstitucion(institucionSeleccionada);
        execute();
        return SUCCESS;
    }
    
    public String actualizarProdInstitucion() throws Exception{
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        ProductosInstitucionDao eProdInstitucion = new ProductosInstitucionDao();
        Instituciones institucionU = new Instituciones(); 
        institucionU.setInstitucionId(institucionId);
        this.prodInstitucionSeleccionado.setInstituciones(institucionU);
        /*Guardando y cargando el nuevo rol*/
        eProdInstitucion.actualizarProdInstitucion(prodInstitucionSeleccionado);
        execute();
        return SUCCESS;
    }
        
//****************************************************************************//
//                                Otros métodos                               //
//****************************************************************************//
    
    @Override
    public String execute() throws Exception {
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();
        this.todosProductosInstitucion = new ProductosInstitucionDao().todosProductosInstitucion();
        return SUCCESS;
    }

    public String nuevaInstitucion(){
        this.todosDepartamentos = new DepartamentosDao().todosDepartamentos();
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        return SUCCESS;
    }

    public String nuevoDepartamento(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }
    
    public String nuevoProdInstitucion(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }
    
    public String verDepartamento(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        DepartamentosInstitucionDao vDeptoInstitucion = new DepartamentosInstitucionDao();
        this.deptoInstitucionSeleccionado = vDeptoInstitucion.deptoInstitucionPorId(deptoInstitucionId);
        InstitucionesDao institucionDao = new InstitucionesDao();
        this.institucionSeleccionada = institucionDao.institucionPorId(deptoInstitucionSeleccionado.getInstituciones().getInstitucionId());
        return SUCCESS;
    }
    
    public String verInstitucion(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao vInstitucion = new InstitucionesDao();
        this.institucionSeleccionada = vInstitucion.institucionPorId(institucionId);
        MunicipiosDao municipioDao = new MunicipiosDao();
        this.municipioSeleccionado = municipioDao.municipionPorId(institucionSeleccionada.getMunicipios().getMunicipioId());
        return SUCCESS;
    }
    
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
