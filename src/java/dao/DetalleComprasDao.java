package dao;

import entidades.DetalleCompras;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DetalleComprasDao {
    
    //Método que obtiene una lista de todos detalles por compra.
    public ArrayList<DetalleCompras> todosDetallePorCompra(BigDecimal compraId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<DetalleCompras> arreglo = new ArrayList<DetalleCompras>();
        Query q=session.createQuery("from DetalleCompras where compras.compraId = "+compraId);
        List<DetalleCompras> lista=q.list();
        Iterator<DetalleCompras> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            DetalleCompras detc = (DetalleCompras) iter.next();
            arreglo.add(detc);
        }
        return arreglo;
    }
    
}
