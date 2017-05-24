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
    
    public ArrayList<Departamentos> todosDepartamentos()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
                ArrayList<Departamentos> arreglo = new ArrayList<Departamentos>();
                Query q=session.createQuery("from Departamentos");
                List<Departamentos> lista=q.list();
                Iterator<Departamentos> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            Departamentos departamento = (Departamentos) iter.next();
            arreglo.add(departamento);
        }
        return arreglo;
    }
    
}
