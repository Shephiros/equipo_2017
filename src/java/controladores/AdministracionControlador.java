package controladores;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.PantallasDao;
import dao.RolesDao;
import dao.UsuariosDao;
import entidades.Pantallas;
import entidades.Roles;
import entidades.Usuarios;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Grupo 4 BAD115
 */
public class AdministracionControlador extends ActionSupport{
    
    private ArrayList<Usuarios> todosUsuarios; 
    private ArrayList<Roles> todosRoles;
    private ArrayList<Pantallas> todasPantallas;
    private Usuarios nuevoUsuario = new Usuarios();
    private Usuarios usuarioSeleccionado = new Usuarios();
    private Pantallas pantalla = new Pantallas();
    private BigDecimal rolId;
    private BigDecimal pantallaId;
    private String usuarioUsuario;
    private String estadoUsuario;
    //para sacar rol
    private Roles rolSeleccionado=new Roles();
        
    @Override
    public String execute() throws Exception {
        this.todosUsuarios = new UsuariosDao().todosUsuarios();
        return SUCCESS;
    }
    
    public String listadoRoles(){
        this.todosRoles= new RolesDao().todosRoles();
        return  SUCCESS;
    }
    
    public String listadoPantallas(){
        this.todasPantallas = new PantallasDao().todasPantallas();
        return SUCCESS;
    }

    public String mostrarNuevoUsuario(){
        this.todosRoles = new RolesDao().todosRoles();
        return SUCCESS;
    }
    
    public String guardarNuevoUsuario(){
        this.todosRoles = new RolesDao().todosRoles();
        UsuariosDao gUsuario = new UsuariosDao();
        Roles rolU = new Roles();
        rolU.setRolId(rolId);
        this.nuevoUsuario.setRoles(rolU);
        this.nuevoUsuario.setUsuarioEstado(BigDecimal.ONE);
        this.nuevoUsuario.setUsuarioBloqueado(BigDecimal.ONE);
        gUsuario.guardarUsuario(nuevoUsuario);
        this.setRolId(BigDecimal.ZERO);
        nuevoUsuario = new Usuarios();
        this.todosRoles = new RolesDao().todosRoles();
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
    
    public String guardarSeleccionadoUsuario(){
        
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
        
        return SUCCESS;
    }
    
    public String verPantalla(){
        this.pantalla = new PantallasDao().pantallaPorPantalla(pantallaId);
        return SUCCESS;
    }
    
    
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

  
    
}
