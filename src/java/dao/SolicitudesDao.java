package dao;

import entidades.Solicitudes;
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
    
}
