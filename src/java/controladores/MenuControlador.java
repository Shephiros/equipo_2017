package controladores;

import com.opensymphony.xwork2.ActionSupport;
import dao.PermisosDao;
import entidades.Permisos;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class MenuControlador extends ActionSupport {
    
    private ArrayList<Permisos> permisoMenu = new ArrayList<Permisos>();
    private boolean permiso [] = new boolean [20];
    
    public String cargaMenu(){
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        for(int i=1; i<20; i++){
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

    public ArrayList<Permisos> getPermisoMenu() {
        return permisoMenu;
    }
    public void setPermisoMenu(ArrayList<Permisos> permisoMenu) {
        this.permisoMenu = permisoMenu;
    }

    
    
}
