package dao;

import entidades.Condiciones;
import java.math.BigDecimal;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CondicionesDao {
    
    //Método que actualiza las compras.
    public void actualizarCondicion(Condiciones condicion){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(condicion);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene una condicion por proveedor Id e Institución Id.
    public Condiciones condicionPorInstitucionIdProveedorId(BigDecimal institucionId, BigDecimal proveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Query q=session.createQuery("from Condiciones where instituciones.institucionId = "+institucionId+" and proveedores.proveedorId = "+proveedorId);
        Condiciones ofer = (Condiciones) q.uniqueResult();
        tx.commit();
        session.close();
        return ofer;
    }
    
}
