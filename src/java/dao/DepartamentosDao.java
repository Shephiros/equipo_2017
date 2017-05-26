package dao;

import entidades.Departamentos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DepartamentosDao {
    
    //Método que obtiene una lista de todos los departamentos.
    public ArrayList<Departamentos> todosDepartamentos()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        
        ArrayList<Departamentos> arreglo = new ArrayList<Departamentos>();
        Query q=session.createQuery("from Departamentos");
        List<Departamentos> lista=q.list();
        Iterator<Departamentos> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Departamentos departamento = (Departamentos) iter.next();
            arreglo.add(departamento);
        }
        return arreglo;
    }
    
}
