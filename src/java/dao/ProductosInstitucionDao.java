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
 
    //Método que obtiene una lista de todos los productos de institución.
    public ArrayList<ProductosInstitucion> todosProductosInstitucion()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<ProductosInstitucion> arreglo = new ArrayList<ProductosInstitucion>();
        Query q=session.createQuery("from ProductosInstitucion");
        List<ProductosInstitucion> lista=q.list();
        Iterator<ProductosInstitucion> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            ProductosInstitucion prodi = (ProductosInstitucion) iter.next();
            arreglo.add(prodi);
        }
        return arreglo;
    }
    
    //Método que obtiene una lista de todos los productos de institución por Id de institución.
    public ArrayList<ProductosInstitucion> todosProductosPorInstitucion(BigDecimal institucionId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<ProductosInstitucion> arreglo = new ArrayList<ProductosInstitucion>();
        Query q=session.createQuery("from ProductosInstitucion where instituciones.institucionId = "+institucionId);
        List<ProductosInstitucion> lista=q.list();
        Iterator<ProductosInstitucion> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            ProductosInstitucion prodi = (ProductosInstitucion) iter.next();
            arreglo.add(prodi);
        }
        return arreglo;
    }
    
    //Método que guarda los productos de instituciones.
    public void guardarProductosInstitucion(ProductosInstitucion prodInstitucion){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(prodInstitucion);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene un producto de institución por Id.
    public ProductosInstitucion prodInstitucionPorId(BigDecimal prodInstitucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        ProductosInstitucion prodi = (ProductosInstitucion)session.get(ProductosInstitucion.class, prodInstitucionId);
        tx.commit();
        session.close();
        return prodi;
    }
    
    //Método que actualiza los productos de instituciones.
    public void actualizarProdInstitucion(ProductosInstitucion prodInstitucionId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(prodInstitucionId);
        tx.commit();
        session.close();
    }
    
}
