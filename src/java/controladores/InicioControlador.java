package controladores;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.InstitucionesDao;
import dao.PermisosDao;
import dao.ProveedoresDao;
import dao.RolesDao;
import dao.UsuariosDao;
import entidades.Instituciones;
import entidades.Permisos;
import entidades.Proveedores;
import entidades.Roles;
import entidades.Usuarios;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import seguridad.Encryptado;

public class InicioControlador extends ActionSupport implements SessionAware{
    private ArrayList<Permisos> permisoMenu = new ArrayList<Permisos>();
    private boolean permiso [] = new boolean [100];
    private String usuario;
    private String contrasenya;
    private SessionMap <String,Object> sessionMap;
    private Usuarios us;
    private Roles rol;
    private Instituciones institucion;
    private Proveedores proveedor;
    private Encryptado ss;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    public String acceso(){
        us= new UsuariosDao().usuarioPorUsuario(usuario);
        ss= new Encryptado();
        rol = new RolesDao().rolPorId(us.getRoles().getRolId());
        if(rol.getRolNombre().equals("Proveedor")){
            proveedor = new ProveedoresDao().proveedorPorId(us.getProveedores().getProveedorId());}
        if(rol.getRolNombre().equals("Administrador de Institución") || rol.getRolNombre().equals("Jefe de Unidad")){
            institucion = new InstitucionesDao().institucionPorId(us.getInstituciones().getInstitucionId());}
        
        if(contrasenya.equals(us.getUsuarioContrasenia()) || ss.comparar(contrasenya, us.getUsuarioContrasenia())){
            
            sessionMap.put("nombre",us.getUsuarioNombre());
            sessionMap.put("usuario",us.getUsuarioUsuario());
            sessionMap.put("rol_Id",rol.getRolId());
            sessionMap.put("rol_Nombre",rol.getRolNombre());
        
            if (rol.getRolNombre().equals("Proveedor")) {
                sessionMap.put("proveedor",proveedor);
                sessionMap.put("proveedor_Id",proveedor.getProveedorId());
            }
            if (rol.getRolNombre().equals("Administrador de Institución") || rol.getRolNombre().equals("Jefe de Unidad")) {
                sessionMap.put("institucion",institucion);
                sessionMap.put("institucion_Id",institucion.getInstitucionId());
            }

            cargaMenu();
            sessionMap.put("menu", permiso);
            return SUCCESS;
        }
        else{
            return ERROR;
        }
    }
    
    public String cargaMenu(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        for(int i=1; i<41; i++){
            BigDecimal pantallaId = new BigDecimal(i);
            this.permisoMenu = new PermisosDao().buscaPermiso((BigDecimal)session.getAttribute("rol_Id"),pantallaId);
            System.out.println("permisoMenú: "+permisoMenu);
            if(permisoMenu.isEmpty()){
                permiso[i] = false;
                System.out.println("permiso["+i+"]= "+permiso[i]);
            }
            else{
                permiso[i] = true;
                System.out.println("permiso["+i+"]= "+permiso[i]);
            }
            this.permisoMenu.clear();
        }
        return SUCCESS;
    }

    public boolean[] getPermiso() {
        return permiso;
    }
    public void setPermiso(boolean[] permiso) {
        this.permiso = permiso;
    }
    
    public String salir() {
        if (sessionMap != null) {
            sessionMap.invalidate();
        }
        return "salir";
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }
    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap= (SessionMap)map;
    }

    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }
    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public ArrayList<Permisos> getPermisoMenu() {
        return permisoMenu;
    }

    public void setPermisoMenu(ArrayList<Permisos> permisoMenu) {
        this.permisoMenu = permisoMenu;
    }

    
    
}
