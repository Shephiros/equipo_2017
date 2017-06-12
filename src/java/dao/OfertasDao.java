package dao;

import entidades.Ofertas;
import java.math.BigDecimal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OfertasDao {

    //Método que guarda las ofertas.
    public void guardarOferta(Ofertas oferta){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(oferta);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene una oferta por Id.
    public Ofertas ofertaPorId(BigDecimal ofertaId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Ofertas ofer = (Ofertas)session.get(Ofertas.class, ofertaId);
        tx.commit();
        session.close();
        return ofer;
    }
    
}
