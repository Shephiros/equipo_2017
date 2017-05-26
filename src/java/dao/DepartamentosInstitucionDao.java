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
    
    //Método que obtiene una lista de todos los departamentos de instituciones.
    public ArrayList<DepartamentosInstitucion> todosDeptosInstitucion()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<DepartamentosInstitucion> arreglo = new ArrayList<DepartamentosInstitucion>();
        Query q=session.createQuery("from DepartamentosInstitucion");
        List<DepartamentosInstitucion> lista=q.list();
        Iterator<DepartamentosInstitucion> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            DepartamentosInstitucion deptoInstitucion = (DepartamentosInstitucion) iter.next();
            arreglo.add(deptoInstitucion);
        }
        return arreglo;
    }
    
    //Método que guarda los departamentos de institución.
    public void guardarDeptoInstitucion(DepartamentosInstitucion deptoInstitucion){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(deptoInstitucion);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene un departamento de institución por Id.
    public DepartamentosInstitucion deptoInstitucionPorId(BigDecimal deptoInstitucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        DepartamentosInstitucion depto = (DepartamentosInstitucion)session.get(DepartamentosInstitucion.class, deptoInstitucionId);
        tx.commit();
        session.close();
        return depto;
    }
    
    //Método que actualiza los departamentos de institución.
    public void actualizarDeptoInstitucion(DepartamentosInstitucion deptoInstitucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(deptoInstitucionId);
        tx.commit();
        session.close();
    }
    
}
