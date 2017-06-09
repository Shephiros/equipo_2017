package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.ComprasDao;
import dao.DepartamentosInstitucionDao;
import dao.DetalleSolicitudDao;
import dao.InstitucionesDao;
import dao.LicitacionesDao;
import dao.ProveedoresDao;
import dao.SolicitudesDao;
import dao.TipoSolicitudesDao;
import entidades.Compras;
import entidades.DepartamentosInstitucion;
import entidades.DetalleSolicitud;
import entidades.Instituciones;
import entidades.Licitaciones;
import entidades.Proveedores;
import entidades.Solicitudes;
import entidades.TipoSolicitudes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class ComprasControlador extends ActionSupport{
    
//****************************************************************************//
//                                  Variables                                 //
//****************************************************************************//

    private ArrayList<DetalleSolicitud>todosDetalleSolicitudes;
    private ArrayList<Solicitudes>todasSolicitudes;
    private ArrayList<Licitaciones>todasLicitaciones;
    private ArrayList<TipoSolicitudes>todosTipoSolicitudes;
    private ArrayList<DepartamentosInstitucion> todosDeptosInstitucion;
    private ArrayList<Compras>todasCompras;
    private ArrayList<Proveedores>todosProveedores;
    private ArrayList<Instituciones>todasInstituciones;
    private DepartamentosInstitucion deptoInstitucionSeleccionado = new DepartamentosInstitucion();
    private TipoSolicitudes tipoSolicitudesSeleccionado = new TipoSolicitudes();
    private Solicitudes solicitudSeleccionada = new Solicitudes();
    private Solicitudes nuevaSolicitud = new Solicitudes();
    private Compras nuevaCompra = new Compras();
    private BigDecimal proveedorId;
    private BigDecimal institucionId;
    private BigDecimal solicitudId;
    private BigDecimal deptoInstitucionId;
    private BigDecimal tipoSolicitudId;
    
//****************************************************************************//
//                            Métodos para guardar                            //
//****************************************************************************//

    //Método que guarda una nueva solicitud de compra.
    public String guardarSolicitud() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));
        this.todosTipoSolicitudes = new TipoSolicitudesDao().todosTipoSolicitudes();
        SolicitudesDao gSolicitud = new SolicitudesDao();
        DepartamentosInstitucion deptoInstitucionU = new DepartamentosInstitucion();
        deptoInstitucionU.setDeptoInstitucionId(deptoInstitucionId);
        this.nuevaSolicitud.setDepartamentosInstitucion(deptoInstitucionU);
        TipoSolicitudes tipoSolicitudU = new TipoSolicitudes();
        tipoSolicitudU.setTipoSolicitudId(tipoSolicitudId);
        this.nuevaSolicitud.setTipoSolicitudes(tipoSolicitudU);
        this.nuevaSolicitud.setSolicitudEstado(BigDecimal.ONE);
        //this.nuevaSolicitud.setSolicitudFecha(new Date());
        gSolicitud.guardarSolicitud(nuevaSolicitud);
        verListadoSolicitudes();
        return SUCCESS;
    }

    //Método que guarda una nueva compra.
    public String guardarCompra() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            Instituciones institucionU = new Instituciones();
            institucionU.setInstitucionId(institucionId);
            this.nuevaCompra.setInstituciones(institucionU);
        }
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            
        }
        
        
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        ComprasDao gCompra = new ComprasDao();
        Instituciones institucionU = new Instituciones();
        institucionU.setInstitucionId(institucionId);
        this.nuevaCompra.setInstituciones(institucionU);
        gCompra.guardarCompra(nuevaCompra);
        verListadoCompras();
        return SUCCESS;
    }
    
//****************************************************************************//
//                           Métodos para actualizar                          //
//****************************************************************************//


//****************************************************************************//
//                                Otros métodos                               //
//****************************************************************************//
    
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    public String verListadoSolicitudes() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudes();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudesPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    public String verListadoLicitaciones() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.todasLicitaciones = new LicitacionesDao().todasLicitaciones();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasLicitaciones = new LicitacionesDao().todasLicitacionesPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    public String verListadoCompras() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todasCompras = new ComprasDao().todasCompras();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasCompras = new ComprasDao().todasComprasPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    public String nuevaSolicitud(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));
        this.todosTipoSolicitudes = new TipoSolicitudesDao().todosTipoSolicitudes();
        return SUCCESS;
    }
    
    public String nuevaCompra(){
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }
    
    public String verSolicitud(){
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();
        this.todosTipoSolicitudes = new TipoSolicitudesDao().todosTipoSolicitudes();
        SolicitudesDao vSolicitud = new SolicitudesDao();
        this.solicitudSeleccionada = vSolicitud.solicitudPorId(solicitudId);
        DepartamentosInstitucionDao deptosInstitucionDao = new DepartamentosInstitucionDao();
        TipoSolicitudesDao tipoSolicitudesDao = new TipoSolicitudesDao();
        this.deptoInstitucionSeleccionado = deptosInstitucionDao.deptoInstitucionPorId(solicitudSeleccionada.getDepartamentosInstitucion().getDeptoInstitucionId());
        this.tipoSolicitudesSeleccionado = tipoSolicitudesDao.tipoSolicitudPorId(solicitudSeleccionada.getTipoSolicitudes().getTipoSolicitudId());
        this.todosDetalleSolicitudes = new DetalleSolicitudDao().todosDetallePorSolicitud(solicitudSeleccionada.getSolicitudId());
        return SUCCESS;
    }
    
    public String verCompra(){
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();
        this.todosTipoSolicitudes = new TipoSolicitudesDao().todosTipoSolicitudes();
        SolicitudesDao vSolicitud = new SolicitudesDao();
        this.solicitudSeleccionada = vSolicitud.solicitudPorId(solicitudId);
        DepartamentosInstitucionDao deptosInstitucionDao = new DepartamentosInstitucionDao();
        TipoSolicitudesDao tipoSolicitudesDao = new TipoSolicitudesDao();
        this.deptoInstitucionSeleccionado = deptosInstitucionDao.deptoInstitucionPorId(solicitudSeleccionada.getDepartamentosInstitucion().getDeptoInstitucionId());
        this.tipoSolicitudesSeleccionado = tipoSolicitudesDao.tipoSolicitudPorId(solicitudSeleccionada.getTipoSolicitudes().getTipoSolicitudId());
        this.todosDetalleSolicitudes = new DetalleSolicitudDao().todosDetallePorSolicitud(solicitudSeleccionada.getSolicitudId());
        return SUCCESS;
    }
    
//****************************************************************************//
//                      Métodos GET y SET para variables                      //
//****************************************************************************//
    
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

    public ArrayList<DepartamentosInstitucion> getTodosDeptosInstitucion() {
        return todosDeptosInstitucion;
    }
    public void setTodosDeptosInstitucion(ArrayList<DepartamentosInstitucion> todosDeptosInstitucion) {
        this.todosDeptosInstitucion = todosDeptosInstitucion;
    }

    public ArrayList<TipoSolicitudes> getTodosTipoSolicitudes() {
        return todosTipoSolicitudes;
    }
    public void setTodosTipoSolicitudes(ArrayList<TipoSolicitudes> todosTipoSolicitudes) {
        this.todosTipoSolicitudes = todosTipoSolicitudes;
    }

    public Solicitudes getSolicitudSeleccionada() {
        return solicitudSeleccionada;
    }
    public void setSolicitudSeleccionada(Solicitudes solicitudSeleccionada) {
        this.solicitudSeleccionada = solicitudSeleccionada;
    }

    public BigDecimal getSolicitudId() {
        return solicitudId;
    }
    public void setSolicitudId(BigDecimal solicitudId) {
        this.solicitudId = solicitudId;
    }

    public DepartamentosInstitucion getDeptoInstitucionSeleccionado() {
        return deptoInstitucionSeleccionado;
    }
    public void setDeptoInstitucionSeleccionado(DepartamentosInstitucion deptoInstitucionSeleccionado) {
        this.deptoInstitucionSeleccionado = deptoInstitucionSeleccionado;
    }

    public TipoSolicitudes getTipoSolicitudesSeleccionado() {
        return tipoSolicitudesSeleccionado;
    }
    public void setTipoSolicitudesSeleccionado(TipoSolicitudes tipoSolicitudesSeleccionado) {
        this.tipoSolicitudesSeleccionado = tipoSolicitudesSeleccionado;
    }

    public BigDecimal getDeptoInstitucionId() {
        return deptoInstitucionId;
    }
    public void setDeptoInstitucionId(BigDecimal deptoInstitucionId) {
        this.deptoInstitucionId = deptoInstitucionId;
    }

    public Solicitudes getNuevaSolicitud() {
        return nuevaSolicitud;
    }
    public void setNuevaSolicitud(Solicitudes nuevaSolicitud) {
        this.nuevaSolicitud = nuevaSolicitud;
    }

    public BigDecimal getTipoSolicitudId() {
        return tipoSolicitudId;
    }
    public void setTipoSolicitudId(BigDecimal tipoSolicitudId) {
        this.tipoSolicitudId = tipoSolicitudId;
    }

    public ArrayList<DetalleSolicitud> getTodosDetalleSolicitudes() {
        return todosDetalleSolicitudes;
    }
    public void setTodosDetalleSolicitudes(ArrayList<DetalleSolicitud> todosDetalleSolicitudes) {
        this.todosDetalleSolicitudes = todosDetalleSolicitudes;
    }

    public ArrayList<Proveedores> getTodosProveedores() {
        return todosProveedores;
    }
    public void setTodosProveedores(ArrayList<Proveedores> todosProveedores) {
        this.todosProveedores = todosProveedores;
    }

    public ArrayList<Instituciones> getTodasInstituciones() {
        return todasInstituciones;
    }
    public void setTodasInstituciones(ArrayList<Instituciones> todasInstituciones) {
        this.todasInstituciones = todasInstituciones;
    }

    public Compras getNuevaCompra() {
        return nuevaCompra;
    }
    public void setNuevaCompra(Compras nuevaCompra) {
        this.nuevaCompra = nuevaCompra;
    }

    public BigDecimal getProveedorId() {
        return proveedorId;
    }
    public void setProveedorId(BigDecimal proveedorId) {
        this.proveedorId = proveedorId;
    }

    public BigDecimal getInstitucionId() {
        return institucionId;
    }
    public void setInstitucionId(BigDecimal institucionId) {
        this.institucionId = institucionId;
    }
    
}
