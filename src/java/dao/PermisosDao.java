package dao;

import entidades.Permisos;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PermisosDao {
    
    //Método que obtiene un permiso por Id.
    public ArrayList<Permisos> buscaPermiso(BigDecimal rolId, BigDecimal pantallaId){
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Permisos> arreglo = new ArrayList<Permisos>();
        Query q=session.createQuery("from Permisos where roles.rolId = "+rolId+" and pantallas.pantallaId = "+pantallaId);
        List<Permisos> lista=q.list();
        Iterator<Permisos> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Permisos permiso = (Permisos) iter.next();
            arreglo.add(permiso);
        }
        return arreglo;
    }
        
    //Método que guarda los permisos.
    public void guardarPermiso(Permisos permiso){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(permiso);
        tx.commit();
        session.close();
    }
    
    //Método que actualiza los permisos.
    public void actualizarPermiso(Permisos permisoId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(permisoId);
        tx.commit();
        session.close();
    }
    
    //Método que elimina los permisos.
    public void eliminarPermiso(Permisos permiso){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(permiso);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene una permiso por Id.
    public Permisos permisosPorId(BigDecimal permisoId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Permisos perm = (Permisos)session.get(Permisos.class, permisoId);
        tx.commit();
        session.close();
        return perm;
    }
    
    //Método que obtiene un permiso por rol Id y pantalla Id.
    public Permisos permisoPorRolIdPantallaId(BigDecimal rolId, BigDecimal pantallaId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Query q=session.createQuery("from Permisos where roles.rolId = "+rolId+" and pantallas.pantallaId = "+pantallaId);
        Permisos pant = (Permisos) q.uniqueResult();
        tx.commit();
        session.close();
        return pant;
    }
    
}
