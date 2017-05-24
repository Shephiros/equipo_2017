package controladores;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.DepartamentosDao;
import dao.DepartamentosInstitucionDao;
import dao.InstitucionesDao;
import dao.MunicipiosDao;
import entidades.Departamentos;
import entidades.DepartamentosInstitucion;
import entidades.Instituciones;
import entidades.Municipios;
import java.math.BigDecimal;
import java.util.ArrayList;

public class InstitucionControlador extends ActionSupport{
    
    private ArrayList<Instituciones> todasInstituciones;
    private ArrayList<Departamentos> todosDepartamentos;
    private ArrayList<DepartamentosInstitucion> todosDeptosInstitucion;
    private ArrayList<Municipios> todosMunicipios;
    private Instituciones nuevaInstitucion = new Instituciones();
    private DepartamentosInstitucion nuevoDeptoInstitucion = new DepartamentosInstitucion();
    private Instituciones institucionSeleccionada = new Instituciones();
    private Municipios municipioSeleccionado = new Municipios();
    private DepartamentosInstitucion deptoInstitucionSeleccionado = new DepartamentosInstitucion();
    private BigDecimal municipioId;
    private BigDecimal institucionId;
    private BigDecimal deptoInstitucionId;
            
    @Override
    public String execute() throws Exception {
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();
        return SUCCESS;
    }

    public String mostrarNuevaInstitucion(){
        this.todosDepartamentos = new DepartamentosDao().todosDepartamentos();
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        return SUCCESS;
    }

    public String guardarNuevaInstitucion() throws Exception{
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
    
    public String verInstitucion(){
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao vInstitucion = new InstitucionesDao();
        this.institucionSeleccionada = vInstitucion.institucionPorId(institucionId);
        MunicipiosDao municipioDao = new MunicipiosDao();
        this.municipioSeleccionado = municipioDao.municipionPorId(institucionSeleccionada.getMunicipios().getMunicipioId());
        //this.institucionSeleccionada.setInstitucionId(institucionId);
        //System.out.println("IdBig: "+getInstitucionId());
        return SUCCESS;
    }
    
    public String editarInstitucion() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao eInstitucion = new InstitucionesDao();
        Municipios municipioU = new Municipios(); 
        municipioU.setMunicipioId(municipioId);
        this.institucionSeleccionada.setMunicipios(municipioU);
        System.out.println("Objeto: "+getInstitucionSeleccionada());
        System.out.println("Nombre: "+getInstitucionSeleccionada().getInstitucionNombre());
        System.out.println("IdBig: "+getInstitucionId());
        System.out.println("Id: "+getInstitucionSeleccionada().getInstitucionId());
        /*Datos que no le muestro en el formulario y es posible que ser vayan como null lo cual provoca un error*/
        //Instituciones antiguoDatos= new InstitucionesDao().institucionPorId(institucionSeleccionada.getInstitucionId());
        //this.institucionSeleccionada.setInstitucionId(institucionId);
        
        /*Guardando y cargando el nuevo rol*/
        eInstitucion.actualizarInstitucion(institucionSeleccionada);
        execute();
        return SUCCESS;
    }
    
    public String mostrarNuevoDepartamento(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }
    
    public String guardarNuevoDepartamento() throws Exception{
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
    
    public String verDepartamento(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        DepartamentosInstitucionDao vDeptoInstitucion = new DepartamentosInstitucionDao();
        this.deptoInstitucionSeleccionado = vDeptoInstitucion.deptoInstitucionPorId(deptoInstitucionId);
        InstitucionesDao institucionDao = new InstitucionesDao();
        this.institucionSeleccionada = institucionDao.institucionPorId(deptoInstitucionSeleccionado.getInstituciones().getInstitucionId());
        return SUCCESS;
    }
    
    /*public String editarDepartamento() throws Exception{
        this.todosMunicipios = new MunicipiosDao().todosMunicipios();
        InstitucionesDao eInstitucion = new InstitucionesDao();
        Municipios municipioU = new Municipios(); 
        municipioU.setMunicipioId(municipioId);
        this.institucionSeleccionada.setMunicipios(municipioU);
        System.out.println("Objeto: "+getInstitucionSeleccionada());
        System.out.println("Nombre: "+getInstitucionSeleccionada().getInstitucionNombre());
        System.out.println("IdBig: "+getInstitucionId());
        System.out.println("Id: "+getInstitucionSeleccionada().getInstitucionId());
        /*Datos que no le muestro en el formulario y es posible que ser vayan como null lo cual provoca un error*/
        //Instituciones antiguoDatos= new InstitucionesDao().institucionPorId(institucionSeleccionada.getInstitucionId());
        //this.institucionSeleccionada.setInstitucionId(institucionId);
        
        /*Guardando y cargando el nuevo rol*//*
        eInstitucion.actualizarInstitucion(institucionSeleccionada);
        execute();
        return SUCCESS;
    }*/
    
/////////////////////////////////////////////////////////////////////////////////////    
/***************************** Métodos Getter y Setter *****************************/    
/////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Instituciones> getTodasInstituciones() {
        return todasInstituciones;
    }
    public void setTodasInstituciones(ArrayList<Instituciones> todasInstituciones) {
        this.todasInstituciones = todasInstituciones;
    }

    public Instituciones getNuevaInstitucion() {
        return nuevaInstitucion;
    }
    public void setNuevaInstitucion(Instituciones nuevaInstitucion) {
        this.nuevaInstitucion = nuevaInstitucion;
    }

    public ArrayList<Departamentos> getTodosDepartamentos() {
        return todosDepartamentos;
    }
    public void setTodosDepartamentos(ArrayList<Departamentos> todosDepartamentos) {
        this.todosDepartamentos = todosDepartamentos;
    }

    public ArrayList<Municipios> getTodosMunicipios() {
        return todosMunicipios;
    }
    public void setTodosMunicipios(ArrayList<Municipios> todosMunicipios) {
        this.todosMunicipios = todosMunicipios;
    }

    public BigDecimal getMunicipioId() {
        return municipioId;
    }
    public void setMunicipioId(BigDecimal municipioId) {
        this.municipioId = municipioId;
    }

    public Instituciones getInstitucionSeleccionada() {
        return institucionSeleccionada;
    }
    public void setInstitucionSeleccionada(Instituciones institucionSeleccionada) {
        this.institucionSeleccionada = institucionSeleccionada;
    }

    public BigDecimal getInstitucionId() {
        return institucionId;
    }
    public void setInstitucionId(BigDecimal institucionId) {
        this.institucionId = institucionId;
    }

    public Municipios getMunicipioSeleccionado() {
        return municipioSeleccionado;
    }
    public void setMunicipioSeleccionado(Municipios municipioSeleccionado) {
        this.municipioSeleccionado = municipioSeleccionado;
    }

    public ArrayList<DepartamentosInstitucion> getTodosDeptosInstitucion() {
        return todosDeptosInstitucion;
    }
    public void setTodosDeptosInstitucion(ArrayList<DepartamentosInstitucion> todosDeptosInstitucion) {
        this.todosDeptosInstitucion = todosDeptosInstitucion;
    }

    public DepartamentosInstitucion getNuevoDeptoInstitucion() {
        return nuevoDeptoInstitucion;
    }
    public void setNuevoDeptoInstitucion(DepartamentosInstitucion nuevoDeptoInstitucion) {
        this.nuevoDeptoInstitucion = nuevoDeptoInstitucion;
    }

    public DepartamentosInstitucion getDeptoInstitucionSeleccionado() {
        return deptoInstitucionSeleccionado;
    }
    public void setDeptoInstitucionSeleccionado(DepartamentosInstitucion deptoInstitucionSeleccionado) {
        this.deptoInstitucionSeleccionado = deptoInstitucionSeleccionado;
    }

    public BigDecimal getDeptoInstitucionId() {
        return deptoInstitucionId;
    }
    public void setDeptoInstitucionId(BigDecimal deptoInstitucionId) {
        this.deptoInstitucionId = deptoInstitucionId;
    }
    
    
}
