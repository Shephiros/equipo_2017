package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.InstitucionesDao;
import dao.RolesDao;
import dao.UsuariosDao;
import entidades.Instituciones;
import entidades.Roles;
import entidades.Usuarios;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import seguridad.Encryptado;

/**
 *
 * @author Usuario
 */
public class InicioControlador extends ActionSupport implements SessionAware{
    private String usuario;
    private String contrasenya;
    private SessionMap <String,Object> sessionMap;
    private Usuarios us;
    private Roles rol;
    private Instituciones institucion;
    private Encryptado ss;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    public String acceso(){
        us= new UsuariosDao().usuarioPorUsuario(usuario);
        ss= new Encryptado();
        rol = new RolesDao().rolPorId(us.getRoles().getRolId());
        institucion = new InstitucionesDao().institucionPorId(us.getInstituciones().getInstitucionId());
        if(contrasenya.equals(us.getUsuarioContrasenia()) || ss.comparar(contrasenya, us.getUsuarioContrasenia())){
            
            sessionMap.put("nombre",us.getUsuarioNombre());
            sessionMap.put("usuario",us.getUsuarioUsuario());
            sessionMap.put("rol",rol);
            sessionMap.put("institucion",institucion);
            
            return SUCCESS;
        }
        else{
            return ERROR;
        }
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

    
    
}
