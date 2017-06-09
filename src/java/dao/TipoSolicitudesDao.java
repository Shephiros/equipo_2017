package dao;

import entidades.TipoSolicitudes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TipoSolicitudesDao {
    
    //Método que obtiene una lista de todos los tipos de solicitudes.
    public ArrayList<TipoSolicitudes> todosTipoSolicitudes()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<TipoSolicitudes> arreglo = new ArrayList<TipoSolicitudes>();
        Query q=session.createQuery("from TipoSolicitudes");
        List<TipoSolicitudes> lista=q.list();
        Iterator<TipoSolicitudes> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            TipoSolicitudes tipo = (TipoSolicitudes) iter.next();
            arreglo.add(tipo);
        }
        return arreglo;
    }
    
    //Método que obtiene un tipo de solicitud por Id.
    public TipoSolicitudes tipoSolicitudPorId(BigDecimal tipoSolicitudId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        TipoSolicitudes tipo = (TipoSolicitudes)session.get(TipoSolicitudes.class, tipoSolicitudId);
        tx.commit();
        session.close();
        return tipo;
    }
    
}
