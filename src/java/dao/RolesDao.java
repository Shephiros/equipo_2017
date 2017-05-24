package dao;

import entidades.Roles;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RolesDao {
    
    public ArrayList<Roles> todosRoles()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
                ArrayList<Roles> arreglo = new ArrayList<Roles>();
                Query q=session.createQuery("from Roles");
                List<Roles> lista=q.list();
                Iterator<Roles> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            Roles rol = (Roles) iter.next();
            arreglo.add(rol);
        }
        return arreglo;
    }
    
    public Roles rolPorId(BigDecimal rolId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Roles us = (Roles)session.get(Roles.class, rolId);
        tx.commit();
        session.close();
        return us;
    }
}
