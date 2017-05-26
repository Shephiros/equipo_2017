package dao;

import entidades.Proveedores;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProveedoresDao {
    
    //Método que obtiene una lista de todos los proveedores.
    public ArrayList<Proveedores> todosProveedores()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Proveedores> arreglo = new ArrayList<Proveedores>();
        Query q=session.createQuery("from Proveedores");
        List<Proveedores> lista=q.list();
        Iterator<Proveedores> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Proveedores pro = (Proveedores) iter.next();
            arreglo.add(pro);
        }
        return arreglo;
    }
    
    //Método que obtiene un proveedor por Id.
    public Proveedores proveedorPorId(BigDecimal proveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Proveedores in = (Proveedores)session.get(Proveedores.class, proveedorId);
        tx.commit();
        session.close();
        return in;
    }
    
}
