package dao;

import entidades.Municipios;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MunicipiosDao {
    
    //Método que obtiene una lista de todos los muinicipios.
    public ArrayList<Municipios> todosMunicipios()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Municipios> arreglo = new ArrayList<Municipios>();
        Query q=session.createQuery("from Municipios");
        List<Municipios> lista=q.list();
        Iterator<Municipios> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Municipios municipio = (Municipios) iter.next();
            arreglo.add(municipio);
        }
        return arreglo;
    }
    
    //Método que obtiene un municipio por Id.
    public Municipios municipionPorId(BigDecimal municipioId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Municipios muni = (Municipios)session.get(Municipios.class, municipioId);
        tx.commit();
        session.close();
        return muni;
    }
    
}
