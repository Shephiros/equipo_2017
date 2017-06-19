package controladores;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.BitacoraDao;
import dao.PantallasDao;
import dao.PermisosDao;
import dao.RolesDao;
import dao.UsuariosDao;
import entidades.Bitacora;
import entidades.Instituciones;
import entidades.Pantallas;
import entidades.Permisos;
import entidades.Roles;
import entidades.Usuarios;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import seguridad.Encryptado;

public class AdministracionControlador extends ActionSupport{
    
//****************************************************************************//
//                                  Variables                                 //
//****************************************************************************//

    private ArrayList<Permisos> permiso = new ArrayList<Permisos>();
    private ArrayList<Usuarios> todosUsuarios; 
    private ArrayList<Roles> todosRoles;
    private ArrayList<Pantallas> todasPantallas = new ArrayList<Pantallas>();
    private ArrayList<Pantallas> todosPermisosPantallas = new ArrayList<Pantallas>();
    private ArrayList<Bitacora> todasBitacoras;
    private Usuarios nuevoUsuario = new Usuarios();
    private Usuarios usuarioSeleccionado = new Usuarios();
    private Permisos nuevoPermiso = new Permisos();
    private Permisos permisoSeleccionado = new Permisos();
    private Pantallas pantalla;
    private BigDecimal rolId;
    private BigDecimal pantallaId;
    private String usuarioUsuario;
    private String estadoUsuario;
    private String contra;
    private Encryptado ss= new Encryptado();
    private Roles rolSeleccionado=new Roles();
        
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if(session.getAttribute("rol_Nombre").equals("Administrador del Sistema") || session.getAttribute("rol_Nombre").equals("Proveedor")){
            this.todosUsuarios = new UsuariosDao().todosUsuarios();}
        if(session.getAttribute("rol_Nombre").equals("Administrador de Institución") || session.getAttribute("rol_Nombre").equals("Jefe de Unidad")){
            this.todosUsuarios = new UsuariosDao().todosUsuariosPorInstitucion((BigDecimal)session.getAttribute("institucion_Id"));}

        this.todasBitacoras= new BitacoraDao().todasBitacoras();
        return SUCCESS;
    }
    
//****************************************************************************//
//                           Métodos para CRUD Usuarios                       //
//****************************************************************************//    
    
    public String mostrarNuevoUsuario(){
        this.todosRoles = new RolesDao().todosRoles();
        return SUCCESS;
    }
    
    public String guardarUsuario() throws Exception{
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        this.todosRoles = new RolesDao().todosRoles();
        UsuariosDao gUsuario = new UsuariosDao();
        Roles rolU = new Roles();
        rolU.setRolId(rolId);
        this.nuevoUsuario.setRoles(rolU);
        this.nuevoUsuario.setUsuarioEstado(BigDecimal.ONE);
        this.nuevoUsuario.setUsuarioBloqueado(BigDecimal.ONE);
        this.nuevoUsuario.setUsuarioContrasenia(ss.convertir(contra));
        this.nuevoUsuario.setInstituciones((Instituciones)session.getAttribute("institucion"));
        gUsuario.guardarUsuario(nuevoUsuario);
        this.setRolId(BigDecimal.ZERO);
        nuevoUsuario = new Usuarios();
        this.todosRoles = new RolesDao().todosRoles();
        execute();
        return SUCCESS;
    }
    
    public String verUsuario(){
        this.todosRoles = new RolesDao().todosRoles();// Para reutilizar acción para editar y ver usuario se agrega esta linea de codigo si no da error. 
        UsuariosDao vUsuario = new UsuariosDao();
        this.usuarioSeleccionado = vUsuario.usuarioPorUsuario(usuarioUsuario);
        RolesDao rolDao = new RolesDao();
        this.rolSeleccionado = rolDao.rolPorId(usuarioSeleccionado.getRoles().getRolId());
        if(usuarioSeleccionado.getUsuarioEstado().equals(BigDecimal.ONE)){
          this.estadoUsuario= "Activo";
        }else{
          this.estadoUsuario="Inactivo";
        }
        return SUCCESS;
    }
    
    public String actualizarUsuario() throws Exception{
        
        this.todosRoles = new RolesDao().todosRoles();
        UsuariosDao gUsuario = new UsuariosDao(); 
        Roles rolU = new Roles(); 
        rolU.setRolId(rolId);
        this.usuarioSeleccionado.setRoles(rolU);
       
        if(estadoUsuario.equals("Activo"))
        this.usuarioSeleccionado.setUsuarioEstado(BigDecimal.ONE);
        else
        this.usuarioSeleccionado.setUsuarioEstado(BigDecimal.ZERO);
        
        /*Datos que no le muestro en el formulario y es posible que ser vayan como null lo cual provoca un error*/
        Usuarios antiguoDatos= new UsuariosDao().usuarioPorUsuario(usuarioSeleccionado.getUsuarioUsuario());
        this.usuarioSeleccionado.setUsuarioContrasenia(antiguoDatos.getUsuarioContrasenia());
        this.usuarioSeleccionado.setUsuarioBloqueado(antiguoDatos.getUsuarioBloqueado());
        
        /*Guardando y cargando el nuevo rol*/
        gUsuario.actualizarUsuario(usuarioSeleccionado); 
        this.todosRoles = new RolesDao().todosRoles();
        
        /*Mostrando el nuevo rol del usuario, se realiza una nueva carga*/
        RolesDao rolDao = new RolesDao();
        this.rolSeleccionado = rolDao.rolPorId(usuarioSeleccionado.getRoles().getRolId());
        execute();
        return SUCCESS;
    }
    
//****************************************************************************//
//                           Métodos para CRUD Permisos                       //
//****************************************************************************//    
    
    public String verListadoPermiso(){
        for(int i=1; i<41; i++){
            BigDecimal pantallaId = new BigDecimal(i);
            this.permiso = new PermisosDao().buscaPermiso(rolId,pantallaId);
            if(permiso.isEmpty()){}
            else{
                PantallasDao pantallaU = new PantallasDao();
                pantalla=new Pantallas();
                pantalla = pantallaU.pantallaPorPantalla(pantallaId);
                todosPermisosPantallas.add(pantalla);
            }
        }
        return  SUCCESS;
    }
    
    //Método que muestra los permisos por rol.
    public String verPermiso(){
        todasPantallas.clear();
        for(int i=1; i<41; i++){
            BigDecimal pantallaId = new BigDecimal(i);
            this.permiso = new PermisosDao().buscaPermiso(rolId,pantallaId);
            if(permiso.isEmpty()){
                PantallasDao pantallaU = new PantallasDao();
                pantalla=new Pantallas();
                pantalla = pantallaU.pantallaPorPantalla(pantallaId);
                todasPantallas.add(pantalla);
            }
            else{
                PantallasDao pantallaU = new PantallasDao();
                pantalla=new Pantallas();
                pantalla = pantallaU.pantallaPorPantalla(pantallaId);
                todosPermisosPantallas.add(pantalla);
            }
        }
        return SUCCESS;
    }
    
    //Método que guarda un permiso.
    public String guardarPermiso() throws Exception{
        PermisosDao gPermiso = new PermisosDao();
        Pantallas pantallaU = new Pantallas();
        pantallaU.setPantallaId(pantallaId);
        this.nuevoPermiso.setPantallas(pantallaU);
        Roles rolU = new Roles();
        rolU.setRolId(rolId);
        this.nuevoPermiso.setRoles(rolU);
        gPermiso.guardarPermiso(nuevoPermiso);
        verPermiso();
        return SUCCESS;
    }
    
    //Método que elimina un permiso.
    public String eliminarPermiso() throws Exception{
        PermisosDao dPermiso = new PermisosDao();
        System.out.println("rolId: "+rolId);
        System.out.println("pantallaId: "+pantallaId);
        this.permisoSeleccionado = new PermisosDao().permisoPorRolIdPantallaId(rolId, pantallaId);
        System.out.println("Permisos seleccionado: "+permisoSeleccionado);
        dPermiso.eliminarPermiso(permisoSeleccionado);
        verPermiso();
        return SUCCESS;
    }
    
//****************************************************************************//
//                                Otros Métodos                               //
//****************************************************************************//    
    
    public String listadoRoles(){
        this.todosRoles= new RolesDao().todosRoles();
        return  SUCCESS;
    }
    
    public String listadoPantallas(){
        this.todasPantallas = new PantallasDao().todasPantallas();
        return SUCCESS;
    }
      
    public String verPantalla(){
        this.pantalla = new PantallasDao().pantallaPorPantalla(pantallaId);
        return SUCCESS;
    }
    
//****************************************************************************//
//                      Métodos GET y SET para variables                      //
//****************************************************************************//
    
    public ArrayList<Usuarios> getTodosUsuarios() {
        return todosUsuarios;
    }
    public void setTodosUsuarios(ArrayList<Usuarios> todosUsuarios) {
        this.todosUsuarios = todosUsuarios;
    }

    public ArrayList<Roles> getTodosRoles() {
        return todosRoles;
    }
    public void setTodosRoles(ArrayList<Roles> todosRoles) {
        this.todosRoles = todosRoles;
    }

    public Usuarios getNuevoUsuario() {
        return nuevoUsuario;
    }
    public void setNuevoUsuario(Usuarios nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }

    public BigDecimal getRolId() {
        return rolId;
    }
    public void setRolId(BigDecimal rolId) {
        this.rolId = rolId;
    }

    public Usuarios getUsuarioSeleccionado() {
        return usuarioSeleccionado;
    }
    public void setUsuarioSeleccionado(Usuarios usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }

    public String getUsuarioUsuario() {
        return usuarioUsuario;
    }
    public void setUsuarioUsuario(String usuarioUsuario) {
        this.usuarioUsuario = usuarioUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }
    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Roles getRolSeleccionado() {
        return rolSeleccionado;
    }
    public void setRolSeleccionado(Roles rolSeleccionado) {
        this.rolSeleccionado = rolSeleccionado;
    }

    public ArrayList<Pantallas> getTodasPantallas() {
        return todasPantallas;
    }
    public void setTodasPantallas(ArrayList<Pantallas> todasPantallas) {
        this.todasPantallas = todasPantallas;
    }

    public Pantallas getPantalla() {
        return pantalla;
    }
    public void setPantalla(Pantallas pantalla) {
        this.pantalla = pantalla;
    }

    public BigDecimal getPantallaId() {
        return pantallaId;
    }
    public void setPantallaId(BigDecimal pantallaId) {
        this.pantallaId = pantallaId;
    }

    public ArrayList<Bitacora> getTodasBitacoras() {
        return todasBitacoras;
    }
    public void setTodasBitacoras(ArrayList<Bitacora> todasBitacoras) {
        this.todasBitacoras = todasBitacoras;
    }

    public String getContra() {
        return contra;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Pantallas> getTodosPermisosPantallas() {
        return todosPermisosPantallas;
    }

    public void setTodosPermisosPantallas(ArrayList<Pantallas> todosPermisosPantallas) {
        this.todosPermisosPantallas = todosPermisosPantallas;
    }

    public ArrayList<Permisos> getPermiso() {
        return permiso;
    }
    public void setPermiso(ArrayList<Permisos> permiso) {
        this.permiso = permiso;
    }

    public Permisos getNuevoPermiso() {
        return nuevoPermiso;
    }
    public void setNuevoPermiso(Permisos nuevoPermiso) {
        this.nuevoPermiso = nuevoPermiso;
    }

    public Permisos getPermisoSeleccionado() {
        return permisoSeleccionado;
    }
    public void setPermisoSeleccionado(Permisos permisoSeleccionado) {
        this.permisoSeleccionado = permisoSeleccionado;
    }
            
}
