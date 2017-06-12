package dao;

import entidades.Aprobados;
import java.math.BigDecimal;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AprobadosDao {
    
    //Método que guarda las aprobaciones de solicitudes.
    public void guardarAprobado(Aprobados aprobado){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(aprobado);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene una aprobación por Id de solicitud.
    public Aprobados aprobadoPorSolicitudId(BigDecimal solicitudId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Query q=session.createQuery("from Aprobados where solicitudes.solicitudId = "+solicitudId);
        Aprobados apro = (Aprobados) q.uniqueResult();
        tx.commit();
        session.close();
        return apro;
    }
    
}
