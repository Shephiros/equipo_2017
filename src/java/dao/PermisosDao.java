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
        
    
    
}
