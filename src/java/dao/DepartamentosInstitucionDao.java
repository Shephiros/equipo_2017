package dao;

import entidades.DepartamentosInstitucion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DepartamentosInstitucionDao {
    
    public ArrayList<DepartamentosInstitucion> todosDeptosInstitucion()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
                ArrayList<DepartamentosInstitucion> arreglo = new ArrayList<DepartamentosInstitucion>();
                Query q=session.createQuery("from DepartamentosInstitucion");
                List<DepartamentosInstitucion> lista=q.list();
                Iterator<DepartamentosInstitucion> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            DepartamentosInstitucion deptoInstitucion = (DepartamentosInstitucion) iter.next();
            arreglo.add(deptoInstitucion);
        }
        return arreglo;
    }
    
    public void guardarDeptoInstitucion(DepartamentosInstitucion deptoInstitucion){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(deptoInstitucion);
        tx.commit();
        session.close();
    }
    
    public DepartamentosInstitucion deptoInstitucionPorId(BigDecimal deptoInstitucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        DepartamentosInstitucion depto = (DepartamentosInstitucion)session.get(DepartamentosInstitucion.class, deptoInstitucionId);
        tx.commit();
        session.close();
        return depto;
    }
}
