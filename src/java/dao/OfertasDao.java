package dao;

import entidades.Ofertas;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OfertasDao {

    //Método que obtiene una lista de todas las ofertas por licitación Id.
    public ArrayList<Ofertas> todasOfertasPorLicitacionId(BigDecimal licitacionId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Ofertas> arreglo = new ArrayList<Ofertas>();
        Query q=session.createQuery("from Ofertas where licitaciones.licitacionId = "+licitacionId);
        List<Ofertas> lista=q.list();
        Iterator<Ofertas> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Ofertas ofer = (Ofertas) iter.next();
            arreglo.add(ofer);
        }
        return arreglo;
    }
    
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
    
    //Método que obtiene una oferta por proveedor Id.
    public Ofertas ofertaPorProveedorId(BigDecimal licitacionId, BigDecimal proveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Query q=session.createQuery("from Ofertas where licitaciones.licitacionId = "+licitacionId+" and proveedores.proveedorId = "+proveedorId);
        Ofertas ofer = (Ofertas) q.uniqueResult();
        tx.commit();
        session.close();
        return ofer;
    }
    
}
