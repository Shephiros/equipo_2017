package dao;

import entidades.Instituciones;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InstitucionesDao {
    
    //Método que obtiene una lista de todas las instituciones.
    public ArrayList<Instituciones> todasInstituciones()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Instituciones> arreglo = new ArrayList<Instituciones>();
        Query q=session.createQuery("from Instituciones");
        List<Instituciones> lista=q.list();
        Iterator<Instituciones> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Instituciones rol = (Instituciones) iter.next();
            arreglo.add(rol);
        }
        return arreglo;
    }
    
    //Método que guarda las instituciones.
    public void guardarInstitucion(Instituciones institucion){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(institucion);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene una institución por Id.
    public Instituciones institucionPorId(BigDecimal institucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Instituciones inst = (Instituciones)session.get(Instituciones.class, institucionId);
        tx.commit();
        session.close();
        return inst;
    }
    
    //Método que actualiza las instituciones.
    public void actualizarInstitucion(Instituciones institucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(institucionId);
        tx.commit();
        session.close();
    }
    
}
