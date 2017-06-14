package dao;

import entidades.Contratos;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ContratosDao {

    //Método que obtiene una lista de todas los contratos.
    public ArrayList<Contratos> todosContratos()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Contratos> arreglo = new ArrayList<Contratos>();
        Query q=session.createQuery("from Contratos");
        List<Contratos> lista=q.list();
        Iterator<Contratos> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Contratos cont = (Contratos) iter.next();
            arreglo.add(cont);
        }
        return arreglo;
    }
    
    //Método que obtiene una lista de todos los contratos por Id de institución.
    public ArrayList<Contratos> todosContratosPorInstitucion(BigDecimal contratoId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Contratos> arreglo = new ArrayList<Contratos>();
        Query q=session.createQuery("from Contratos where compras.instituciones.institucionId = "+contratoId);
        List<Contratos> lista=q.list();
        Iterator<Contratos> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Contratos cont = (Contratos) iter.next();
            arreglo.add(cont);
        }
        return arreglo;
    }
    
    //Método que guarda los contratos.
    public void guardarContrato(Contratos contrato){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(contrato);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene un contrato por Id.
    public Contratos contratoPorId(BigDecimal contratoId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Contratos cont = (Contratos)session.get(Contratos.class, contratoId);
        tx.commit();
        session.close();
        return cont;
    }
    
}
