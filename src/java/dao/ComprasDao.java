package dao;

import entidades.Compras;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ComprasDao {

    //Método que obtiene una lista de todas las compras.
    public ArrayList<Compras> todasCompras()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Compras> arreglo = new ArrayList<Compras>();
        Query q=session.createQuery("from Compras");
        List<Compras> lista=q.list();
        Iterator<Compras> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Compras comp = (Compras) iter.next();
            arreglo.add(comp);
        }
        return arreglo;
    }
    
}
