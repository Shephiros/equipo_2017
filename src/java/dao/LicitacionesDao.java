package dao;

import entidades.Licitaciones;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LicitacionesDao {
   
    //Método que obtiene una lista de todas las licitaciones.
    public ArrayList<Licitaciones> todasLicitaciones()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Licitaciones> arreglo = new ArrayList<Licitaciones>();
        Query q=session.createQuery("from Licitaciones");
        List<Licitaciones> lista=q.list();
        Iterator<Licitaciones> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Licitaciones lici = (Licitaciones) iter.next();
            arreglo.add(lici);
        }
        return arreglo;
    }
    
    //Método que obtiene una lista de todas las licitaciones por Id de institución.
    public ArrayList<Licitaciones> todasLicitacionesPorInstitucion(BigDecimal institucionId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Licitaciones> arreglo = new ArrayList<Licitaciones>();
        Query q=session.createQuery("from Licitaciones where solicitudes.departamentosInstitucion.instituciones.institucionId = "+institucionId);
        List<Licitaciones> lista=q.list();
        Iterator<Licitaciones> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Licitaciones lici = (Licitaciones) iter.next();
            arreglo.add(lici);
        }
        return arreglo;
    }
}
