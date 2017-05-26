package dao;

import entidades.ProductosInstitucion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductosInstitucionDao {
 
    public ArrayList<ProductosInstitucion> todosProductosInstitucion()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
            ArrayList<ProductosInstitucion> arreglo = new ArrayList<ProductosInstitucion>();
            Query q=session.createQuery("from ProductosInstitucion");
            List<ProductosInstitucion> lista=q.list();
            Iterator<ProductosInstitucion> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            ProductosInstitucion prodi = (ProductosInstitucion) iter.next();
            arreglo.add(prodi);
        }
        return arreglo;
    }
    
    public void guardarProductosInstitucion(ProductosInstitucion prodInstitucion){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(prodInstitucion);
        tx.commit();
        session.close();
    }
    
    public ProductosInstitucion prodInstitucionPorId(BigDecimal prodInstitucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        ProductosInstitucion prodi = (ProductosInstitucion)session.get(ProductosInstitucion.class, prodInstitucionId);
        tx.commit();
        session.close();
        return prodi;
    }
    
    public void actualizarProdInstitucion(ProductosInstitucion prodInstitucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(prodInstitucionId);
        tx.commit();
        session.close();
    }
    
}
