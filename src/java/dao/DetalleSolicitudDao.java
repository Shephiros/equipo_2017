package dao;

import entidades.DetalleSolicitud;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DetalleSolicitudDao {
    
    //Método que obtiene una lista de todos detalles por solicitud.
    public ArrayList<DetalleSolicitud> todosDetallePorSolicitud(BigDecimal solicitudId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<DetalleSolicitud> arreglo = new ArrayList<DetalleSolicitud>();
        Query q=session.createQuery("from DetalleSolicitud where solicitudes.solicitudId = "+solicitudId);
        List<DetalleSolicitud> lista=q.list();
        Iterator<DetalleSolicitud> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            DetalleSolicitud dets = (DetalleSolicitud) iter.next();
            arreglo.add(dets);
        }
        return arreglo;
    }
}
