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
    
    public ArrayList<Instituciones> todasInstituciones()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
            ArrayList<Instituciones> arreglo = new ArrayList<Instituciones>();
            Query q=session.createQuery("from Instituciones");
            List<Instituciones> lista=q.list();
            Iterator<Instituciones> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            Instituciones rol = (Instituciones) iter.next();
            arreglo.add(rol);
        }
        return arreglo;
    }
    
    public Instituciones institucionPorId(BigDecimal institucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Instituciones in = (Instituciones)session.get(Instituciones.class, institucionId);
        tx.commit();
        session.close();
        return in;
    }
    
    public void guardarInstitucion(Instituciones institucion){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(institucion);
        tx.commit();
        session.close();
    }
    
    public void actualizarInstitucion(Instituciones institucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(institucionId);
        tx.commit();
        session.close();
    }
    
}
