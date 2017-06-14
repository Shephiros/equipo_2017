package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.AprobadosDao;
import dao.ComprasDao;
import dao.ContratosDao;
import dao.DepartamentosInstitucionDao;
import dao.DetalleComprasDao;
import dao.DetalleSolicitudDao;
import dao.InstitucionesDao;
import dao.LicitacionesDao;
import dao.OfertasDao;
import dao.ProveedoresDao;
import dao.SolicitudesDao;
import dao.TipoSolicitudesDao;
import entidades.Aprobados;
import entidades.Compras;
import entidades.Contratos;
import entidades.DepartamentosInstitucion;
import entidades.DetalleCompras;
import entidades.DetalleSolicitud;
import entidades.Instituciones;
import entidades.Licitaciones;
import entidades.Ofertas;
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
    private ArrayList<DetalleCompras>todosDetalleCompras;
    private ArrayList<Solicitudes>todasSolicitudes;
    private ArrayList<Licitaciones>todasLicitaciones;
    private ArrayList<TipoSolicitudes>todosTipoSolicitudes;
    private ArrayList<DepartamentosInstitucion> todosDeptosInstitucion;
    private ArrayList<Ofertas>todasOfertas;
    private ArrayList<Compras>todasCompras;
    private ArrayList<Contratos>todosContratos;
    private ArrayList<Proveedores>todosProveedores;
    private ArrayList<Instituciones>todasInstituciones;
    private Instituciones institucionSeleccionada = new Instituciones();
    private DepartamentosInstitucion deptoInstitucionSeleccionado = new DepartamentosInstitucion();
    private Proveedores proveedorSeleccionado = new Proveedores();
    private TipoSolicitudes tipoSolicitudesSeleccionado = new TipoSolicitudes();
    private Aprobados nuevoAprobado = new Aprobados();
    private Aprobados aprobadoSeleccionado = new Aprobados();
    private Solicitudes solicitudSeleccionada = new Solicitudes();
    private Solicitudes nuevaSolicitud = new Solicitudes();
    private Licitaciones nuevaLicitacion = new Licitaciones();
    private Licitaciones licitacionSeleccionada = new Licitaciones();
    private Contratos nuevoContrato = new Contratos();
    private Contratos contratoSeleccionado = new Contratos();
    private Compras nuevaCompra = new Compras();
    private Compras compraSeleccionada = new Compras();
    private Ofertas nuevaOferta = new Ofertas();
    private Ofertas ofertaSeleccionada = new Ofertas();
    private BigDecimal proveedorId;
    private BigDecimal institucionId;
    private BigDecimal solicitudId;
    private BigDecimal compraId;
    private BigDecimal contratoId;
    private BigDecimal ofertaId;
    private BigDecimal licitacionId;
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
        this.nuevaSolicitud.setSolicitudEstado(BigDecimal.ZERO);
        //this.nuevaSolicitud.setSolicitudFecha(new Date());
        gSolicitud.guardarSolicitud(nuevaSolicitud);
        verListadoSolicitudes();
        return SUCCESS;
    }

    //Método que guarda una nueva aporbación de solicitud de compra.
    public String guardarAprobacion() throws Exception{
        AprobadosDao gAprobado = new AprobadosDao();
        this.nuevoAprobado.setSolicitudes(solicitudSeleccionada);
        gAprobado.guardarAprobado(nuevoAprobado);
        
        Solicitudes solicitudActualizar;
        SolicitudesDao solicitudU = new SolicitudesDao();
        solicitudActualizar = solicitudU.solicitudPorId(solicitudSeleccionada.getSolicitudId());
        
        SolicitudesDao gSolicitud = new SolicitudesDao();
        solicitudActualizar.setSolicitudEstado(BigDecimal.TEN);
        gSolicitud.actualizarSolicitud(solicitudActualizar);
        verListadoSolicitudes();
        return SUCCESS;
    }
        
    //Método que cabia estado de solicitud de compra.
    public String denegarSolicitud() throws Exception{
        SolicitudesDao vSolicitud = new SolicitudesDao();
        this.solicitudSeleccionada = vSolicitud.solicitudPorId(solicitudId);
        this.solicitudSeleccionada.setSolicitudEstado(BigDecimal.ONE);
        SolicitudesDao gSolicitud = new SolicitudesDao();
        gSolicitud.actualizarSolicitud(solicitudSeleccionada);
        verListadoSolicitudes();
        return SUCCESS;
    }

    //Método que guarda una nueva licitación de compra.
    public String guardarLicitacion() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudes();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudesPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        LicitacionesDao gLicitacion = new LicitacionesDao();
        Solicitudes solicitudU = new Solicitudes();
        solicitudU.setSolicitudId(solicitudId);
        this.nuevaLicitacion.setSolicitudes(solicitudU);
        gLicitacion.guardarLicitacion(nuevaLicitacion);
        verListadoLicitaciones();
        return SUCCESS;
    }

    //Método que guarda una nueva compra.
    public String guardarCompra() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            Instituciones institucionU = new Instituciones();
            institucionU.setInstitucionId(institucionId);
            this.nuevaCompra.setInstituciones(institucionU);
        }
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.nuevaCompra.setInstituciones((Instituciones)session.getAttribute("institucion"));
        }
        Proveedores proveedorU = new Proveedores();
        proveedorU.setProveedorId(proveedorId);
        this.nuevaCompra.setProveedores(proveedorU);
        ComprasDao gCompra = new ComprasDao();
        gCompra.guardarCompra(nuevaCompra);
        verListadoCompras();
        return SUCCESS;
    }
    
    //Método que guarda una nueva oferta.
    public String guardarOferta() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        Proveedores proveedorU = new Proveedores();
        proveedorU.setProveedorId((BigDecimal)session.getAttribute("proveedor_Id"));
        this.nuevaOferta.setProveedores(proveedorU);
        this.nuevaOferta.setLicitaciones(licitacionSeleccionada);
        OfertasDao gOferta = new OfertasDao();
        gOferta.guardarOferta(nuevaOferta);
        verListadoLicitaciones();
        return SUCCESS;
    }

    //Método que guarda un contrato de compra.
    public String guardarContrato() throws Exception{
        Compras compraU = new Compras();
        compraU.setCompraId(compraId);
        this.nuevoContrato.setCompras(compraU);
        ContratosDao gContrato = new ContratosDao();
        gContrato.guardarContrato(nuevoContrato);
        verListadoContratos();
        return SUCCESS;
    }

//****************************************************************************//
//                                Otros métodos                               //
//****************************************************************************//
    
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    //Método para mostrar listado de solicitudes de compras.
    public String verListadoSolicitudes() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudes();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudesPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    //Método para mostrar listado de licitaciones de compras.
    public String verListadoLicitaciones() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.todasLicitaciones = new LicitacionesDao().todasLicitaciones();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasLicitaciones = new LicitacionesDao().todasLicitacionesPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    //Método para mostrar listado de compras.
    public String verListadoCompras() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todasCompras = new ComprasDao().todasCompras();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasCompras = new ComprasDao().todasComprasPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    //Método para mostrar listado de contratos.
    public String verListadoContratos() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todosContratos = new ContratosDao().todosContratos();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todosContratos = new ContratosDao().todosContratosPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    //Método para mostrar listado de ofertas por licitación.
    public String verListadoOfertas() throws Exception {
        this.todasOfertas = new OfertasDao().todasOfertasPorLicitacionId(licitacionId);
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de nueva solicitud de compra.
    public String nuevaSolicitud(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        this.todosTipoSolicitudes = new TipoSolicitudesDao().todosTipoSolicitudes();
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de nueva licitación de compra.
    public String nuevaLicitacion(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudes();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasSolicitudes = new SolicitudesDao().todasSolicitudesPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de nuevo contrato de compra.
    public String nuevoContrato(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema")){
            this.todasCompras = new ComprasDao().todasCompras();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todasCompras = new ComprasDao().todasComprasPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de nueva compra.
    public String nuevaCompra(){
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de ver solicitud de compra.
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
    
    //Método para mostrar pantalla de ver aprobación de solicitud de compra.
    public String verAprobacion(){
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();
        this.todosTipoSolicitudes = new TipoSolicitudesDao().todosTipoSolicitudes();
        SolicitudesDao vSolicitud = new SolicitudesDao();
        this.solicitudSeleccionada = vSolicitud.solicitudPorId(solicitudId);
        AprobadosDao vAprobado = new AprobadosDao();
        this.aprobadoSeleccionado = vAprobado.aprobadoPorSolicitudId(solicitudId);
        DepartamentosInstitucionDao deptosInstitucionDao = new DepartamentosInstitucionDao();
        TipoSolicitudesDao tipoSolicitudesDao = new TipoSolicitudesDao();
        this.deptoInstitucionSeleccionado = deptosInstitucionDao.deptoInstitucionPorId(solicitudSeleccionada.getDepartamentosInstitucion().getDeptoInstitucionId());
        this.tipoSolicitudesSeleccionado = tipoSolicitudesDao.tipoSolicitudPorId(solicitudSeleccionada.getTipoSolicitudes().getTipoSolicitudId());
        this.todosDetalleSolicitudes = new DetalleSolicitudDao().todosDetallePorSolicitud(solicitudSeleccionada.getSolicitudId());
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de ver licitación de compra.
    public String verLicitacion(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        //this.todasLicitaciones = new LicitacionesDao().todasLicitaciones();No lo ocupo
        OfertasDao vOferta = new OfertasDao();
        this.ofertaSeleccionada = vOferta.ofertaPorProveedorId(licitacionId, (BigDecimal)session.getAttribute("proveedor_Id"));
        LicitacionesDao vLicitacion = new LicitacionesDao();
        this.licitacionSeleccionada = vLicitacion.licitacionPorId(licitacionId);
        SolicitudesDao solicitudDao = new SolicitudesDao();        
        this.solicitudSeleccionada = solicitudDao.solicitudPorId(licitacionSeleccionada.getSolicitudes().getSolicitudId());
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de ver compra.
    public String verCompra(){
        this.todasInstituciones = new InstitucionesDao().todasInstituciones();
        this.todosProveedores = new ProveedoresDao().todosProveedores();
        ComprasDao vCompra = new ComprasDao();
        this.compraSeleccionada = vCompra.compraPorId(compraId);
        InstitucionesDao institucionDao = new InstitucionesDao();
        ProveedoresDao proveedorDao = new ProveedoresDao();
        this.institucionSeleccionada = institucionDao.institucionPorId(compraSeleccionada.getInstituciones().getInstitucionId());
        this.proveedorSeleccionado = proveedorDao.proveedorPorId(compraSeleccionada.getProveedores().getProveedorId());
        this.todosDetalleCompras = new DetalleComprasDao().todosDetallePorCompra(compraSeleccionada.getCompraId());
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de ver contrato.
    public String verContrato(){
        this.todasCompras = new ComprasDao().todasCompras();
        ContratosDao vContrato = new ContratosDao();
        this.contratoSeleccionado = vContrato.contratoPorId(contratoId);
        ComprasDao compraDao = new ComprasDao();
        this.compraSeleccionada = compraDao.compraPorId(contratoSeleccionado.getCompras().getCompraId());
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de aprobación de solicitud de compra.
    public String nuevaAprobacion(){
        this.todosDeptosInstitucion = new DepartamentosInstitucionDao().todosDeptosInstitucion();
        this.todosTipoSolicitudes = new TipoSolicitudesDao().todosTipoSolicitudes();
        SolicitudesDao vSolicitud = new SolicitudesDao();
        this.solicitudSeleccionada = vSolicitud.solicitudPorId(solicitudId);
        this.deptoInstitucionSeleccionado = new DepartamentosInstitucionDao().deptoInstitucionPorId(solicitudSeleccionada.getDepartamentosInstitucion().getDeptoInstitucionId());
        this.tipoSolicitudesSeleccionado = new TipoSolicitudesDao().tipoSolicitudPorId(solicitudSeleccionada.getTipoSolicitudes().getTipoSolicitudId());
        this.todosDetalleSolicitudes = new DetalleSolicitudDao().todosDetallePorSolicitud(solicitudSeleccionada.getSolicitudId());
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de nueva oferta de licitación.
    public String nuevaOferta(){
        LicitacionesDao vLicitacion = new LicitacionesDao();
        this.licitacionSeleccionada = vLicitacion.licitacionPorId(licitacionId);
        return SUCCESS;
    }
    
    //Método para mostrar pantalla de ver oferta.
    public String verOferta(){
        if(licitacionId != null){
            HttpSession session = ServletActionContext.getRequest().getSession(false);
            OfertasDao vOferta = new OfertasDao();
            this.ofertaSeleccionada = vOferta.ofertaPorProveedorId(licitacionId, (BigDecimal)session.getAttribute("proveedor_Id"));
            LicitacionesDao licitacionDao = new LicitacionesDao();
            this.licitacionSeleccionada = licitacionDao.licitacionPorId(licitacionId);
            ProveedoresDao proveedorDao = new ProveedoresDao();
            this.proveedorSeleccionado = proveedorDao.proveedorPorId((BigDecimal)session.getAttribute("proveedor_Id"));
        }
        //Si entro desde listas de ofertas ocupo este bloque if.
        if(ofertaId != null){
            OfertasDao vOfertas = new OfertasDao();
            this.ofertaSeleccionada = vOfertas.ofertaPorId(ofertaId);
            ProveedoresDao proveedorDao = new ProveedoresDao();
            this.proveedorSeleccionado = proveedorDao.proveedorPorId(ofertaSeleccionada.getProveedores().getProveedorId());
            LicitacionesDao licitacionDao = new LicitacionesDao();
            this.licitacionSeleccionada = licitacionDao.licitacionPorId(ofertaSeleccionada.getLicitaciones().getLicitacionId());
        }
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

    public ArrayList<DetalleCompras> getTodosDetalleCompras() {
        return todosDetalleCompras;
    }
    public void setTodosDetalleCompras(ArrayList<DetalleCompras> todosDetalleCompras) {
        this.todosDetalleCompras = todosDetalleCompras;
    }

    public ArrayList<Ofertas> getTodasOfertas() {
        return todasOfertas;
    }
    public void setTodasOfertas(ArrayList<Ofertas> todasOfertas) {
        this.todasOfertas = todasOfertas;
    }

    public ArrayList<Contratos> getTodosContratos() {
        return todosContratos;
    }
    public void setTodosContratos(ArrayList<Contratos> todosContratos) {
        this.todosContratos = todosContratos;
    }
   
    public Solicitudes getSolicitudSeleccionada() {
        return solicitudSeleccionada;
    }
    public void setSolicitudSeleccionada(Solicitudes solicitudSeleccionada) {
        this.solicitudSeleccionada = solicitudSeleccionada;
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

    public Solicitudes getNuevaSolicitud() {
        return nuevaSolicitud;
    }
    public void setNuevaSolicitud(Solicitudes nuevaSolicitud) {
        this.nuevaSolicitud = nuevaSolicitud;
    }

    public Compras getNuevaCompra() {
        return nuevaCompra;
    }
    public void setNuevaCompra(Compras nuevaCompra) {
        this.nuevaCompra = nuevaCompra;
    }

    public Licitaciones getNuevaLicitacion() {
        return nuevaLicitacion;
    }
    public void setNuevaLicitacion(Licitaciones nuevaLicitacion) {
        this.nuevaLicitacion = nuevaLicitacion;
    }

    public Licitaciones getLicitacionSeleccionada() {
        return licitacionSeleccionada;
    }
    public void setLicitacionSeleccionada(Licitaciones licitacionSeleccionada) {
        this.licitacionSeleccionada = licitacionSeleccionada;
    }

    public Compras getCompraSeleccionada() {
        return compraSeleccionada;
    }
    public void setCompraSeleccionada(Compras compraSeleccionada) {
        this.compraSeleccionada = compraSeleccionada;
    }

    public Proveedores getProveedorSeleccionado() {
        return proveedorSeleccionado;
    }
    public void setProveedorSeleccionado(Proveedores proveedorSeleccionado) {
        this.proveedorSeleccionado = proveedorSeleccionado;
    }

    public Instituciones getInstitucionSeleccionada() {
        return institucionSeleccionada;
    }
    public void setInstitucionSeleccionada(Instituciones institucionSeleccionada) {
        this.institucionSeleccionada = institucionSeleccionada;
    }

    public Aprobados getNuevoAprobado() {
        return nuevoAprobado;
    }
    public void setNuevoAprobado(Aprobados nuevoAprobado) {
        this.nuevoAprobado = nuevoAprobado;
    }

    public Aprobados getAprobadoSeleccionado() {
        return aprobadoSeleccionado;
    }
    public void setAprobadoSeleccionado(Aprobados aprobadoSeleccionado) {
        this.aprobadoSeleccionado = aprobadoSeleccionado;
    }

    public Ofertas getNuevaOferta() {
        return nuevaOferta;
    }
    public void setNuevaOferta(Ofertas nuevaOferta) {
        this.nuevaOferta = nuevaOferta;
    }

    public Ofertas getOfertaSeleccionada() {
        return ofertaSeleccionada;
    }
    public void setOfertaSeleccionada(Ofertas ofertaSeleccionada) {
        this.ofertaSeleccionada = ofertaSeleccionada;
    }

    public Contratos getNuevoContrato() {
        return nuevoContrato;
    }
    public void setNuevoContrato(Contratos nuevoContrato) {
        this.nuevoContrato = nuevoContrato;
    }

    public Contratos getContratoSeleccionado() {
        return contratoSeleccionado;
    }
    public void setContratoSeleccionado(Contratos contratoSeleccionado) {
        this.contratoSeleccionado = contratoSeleccionado;
    }
    
    public BigDecimal getDeptoInstitucionId() {
        return deptoInstitucionId;
    }
    public void setDeptoInstitucionId(BigDecimal deptoInstitucionId) {
        this.deptoInstitucionId = deptoInstitucionId;
    }

    public BigDecimal getTipoSolicitudId() {
        return tipoSolicitudId;
    }
    public void setTipoSolicitudId(BigDecimal tipoSolicitudId) {
        this.tipoSolicitudId = tipoSolicitudId;
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

    public BigDecimal getLicitacionId() {
        return licitacionId;
    }
    public void setLicitacionId(BigDecimal licitacionId) {
        this.licitacionId = licitacionId;
    }

    public BigDecimal getCompraId() {
        return compraId;
    }
    public void setCompraId(BigDecimal compraId) {
        this.compraId = compraId;
    }

    public BigDecimal getOfertaId() {
        return ofertaId;
    }
    public void setOfertaId(BigDecimal ofertaId) {
        this.ofertaId = ofertaId;
    }

    public BigDecimal getContratoId() {
        return contratoId;
    }
    public void setContratoId(BigDecimal contratoId) {
        this.contratoId = contratoId;
    }

    public BigDecimal getSolicitudId() {
        return solicitudId;
    }
    public void setSolicitudId(BigDecimal solicitudId) {
        this.solicitudId = solicitudId;
    }
    
}
