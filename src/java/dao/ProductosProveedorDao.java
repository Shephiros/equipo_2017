package dao;

import entidades.ProductosProveedor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductosProveedorDao {
    
    //Método que obtiene una lista de todos los productos de proveedor.
    public ArrayList<ProductosProveedor> todosProductosProveedor()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<ProductosProveedor> arreglo = new ArrayList<ProductosProveedor>();
        Query q=session.createQuery("from ProductosProveedor");
        List<ProductosProveedor> lista=q.list();
        Iterator<ProductosProveedor> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            ProductosProveedor prodp = (ProductosProveedor) iter.next();
            arreglo.add(prodp);
        }
        return arreglo;
    }
    
    //Método que obtiene una lista de todos los productos de proveedor por Id de proveedor.
    public ArrayList<ProductosProveedor> todosProductosPorProveedor(BigDecimal proveedorId)
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<ProductosProveedor> arreglo = new ArrayList<ProductosProveedor>();
        Query q=session.createQuery("from ProductosProveedor where proveedores.proveedorId = "+proveedorId);
        List<ProductosProveedor> lista=q.list();
        Iterator<ProductosProveedor> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            ProductosProveedor prodp = (ProductosProveedor) iter.next();
            arreglo.add(prodp);
        }
        return arreglo;
    }

    //Método que guarda los productos de prveedores.
    public void guardarProductosProveedor(ProductosProveedor prodProveedor){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(prodProveedor);
        tx.commit();
        session.close();
    }
    
    //Método que obtiene un producto de proveedor por Id.
    public ProductosProveedor prodProveedorPorId(BigDecimal prodProveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        ProductosProveedor prodp = (ProductosProveedor)session.get(ProductosProveedor.class, prodProveedorId);
        tx.commit();
        session.close();
        return prodp;
    }
    
    //Método que actualiza los productos de proveedores.
    public void actualizarProdProveedor(ProductosProveedor prodProveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(prodProveedorId);
        tx.commit();
        session.close();
    }
    
}
