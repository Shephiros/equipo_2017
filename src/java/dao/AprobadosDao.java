package dao;

import entidades.Aprobados;
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
    
}
