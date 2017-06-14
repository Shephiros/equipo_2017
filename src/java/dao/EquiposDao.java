package dao;

import entidades.Equipos;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EquiposDao {
    
    //Método que obtiene una lista de todos los equipos.
    public ArrayList<Equipos> todosEquipos()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Equipos> arreglo = new ArrayList<Equipos>();
        Query q=session.createQuery("from Equipos");
        List<Equipos> lista=q.list();
        Iterator<Equipos> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Equipos equi = (Equipos) iter.next();
            arreglo.add(equi);
        }
        return arreglo;
    }
    
    //Método que obtiene una lista de todos los equipos por Id de institución.
    public ArrayList<Equipos> todosEquiposPorInstitucion(BigDecimal institucionId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Equipos> arreglo = new ArrayList<Equipos>();
        Query q=session.createQuery("from Equipos where detalleCompras.compras.instituciones.institucionId = "+institucionId);
        List<Equipos> lista=q.list();
        Iterator<Equipos> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Equipos equi = (Equipos) iter.next();
            arreglo.add(equi);
        }
        return arreglo;
    }
    
}
