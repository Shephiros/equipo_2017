package dao;

import entidades.Solicitudes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SolicitudesDao {
    
    //Método que obtiene una lista de todas Solicitudes.
    public ArrayList<Solicitudes> todasSolicitudes()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Solicitudes> arreglo = new ArrayList<Solicitudes>();
        Query q=session.createQuery("from Solicitudes");
        List<Solicitudes> lista=q.list();
        Iterator<Solicitudes> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Solicitudes soli = (Solicitudes) iter.next();
            arreglo.add(soli);
        }
        return arreglo;
    }
    
    //Método que obtiene una lista de todas Solicitudes por Id de institución.
    public ArrayList<Solicitudes> todasSolicitudesPorInstitucion(BigDecimal institucionId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Solicitudes> arreglo = new ArrayList<Solicitudes>();
        Query q=session.createQuery("from Solicitudes where departamentosInstitucion.instituciones.institucionId = "+institucionId);
        List<Solicitudes> lista=q.list();
        Iterator<Solicitudes> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Solicitudes soli = (Solicitudes) iter.next();
            arreglo.add(soli);
        }
        return arreglo;
    }
    
    //Método que guarda las solicitudes.
    public void guardarSolicitud(Solicitudes solicitud){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(solicitud);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene una solicitud por Id.
    public Solicitudes solicitudPorId(BigDecimal solicitudId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Solicitudes soli = (Solicitudes)session.get(Solicitudes.class, solicitudId);
        tx.commit();
        session.close();
        return soli;
    }
    
    //Método que actualiza las solicitudes de compras.
    public void actualizarSolicitud(Solicitudes solicitudId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(solicitudId);
        tx.commit();
        session.close();
    }
    
}
