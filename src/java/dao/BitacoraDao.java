package dao;

import entidades.Bitacora;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BitacoraDao {
    
    //Método que obtiene una lista de todos los registros en la bitácora.
    public ArrayList<Bitacora> todasBitacoras()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Bitacora> arreglo = new ArrayList<Bitacora>();
        Query q=session.createQuery("from Bitacora");
        List<Bitacora> lista=q.list();
        Iterator<Bitacora> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Bitacora bita = (Bitacora) iter.next();
            arreglo.add(bita);
        }
        return arreglo;
    }
    
}
