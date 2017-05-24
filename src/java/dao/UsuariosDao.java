
package dao;

//@author Grupo 4 BAD115

import entidades.Usuarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 
public class UsuariosDao implements Serializable{
    
    public ArrayList<Usuarios> todosUsuarios()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
                ArrayList<Usuarios> arreglo = new ArrayList<Usuarios>();
                Query q=session.createQuery("from Usuarios");
                List<Usuarios> lista=q.list();
                Iterator<Usuarios> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            Usuarios noti = (Usuarios) iter.next();
            arreglo.add(noti);
        }
        return arreglo;
    }
      
    public Usuarios usuarioPorUsuario(String id_usuario){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Usuarios us = (Usuarios)session.get(Usuarios.class, id_usuario);
        tx.commit();
        session.close();
        return us;
    }
    
    public void actualizarUsuario(Usuarios usuario){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        //Usuarios us = (Usuarios)session.get(Usuarios.class, usuario);
        session.update(usuario);
        tx.commit();
        session.close();
    }
    
    //Este metodo deberia dar de baja y no eliminar F. Erick
    public void eliminarUsuario(int id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Usuarios us = (Usuarios)session.get(Usuarios.class, id);
        session.delete(us);
        tx.commit();
        session.close();
    }
    
    public void guardarUsuario(Usuarios usuario){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(usuario);
        tx.commit();
        session.close();
    }
    
}
