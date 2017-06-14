package dao;

import entidades.Proveedores;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProveedoresDao {
    
    //Método que obtiene una lista de todos los proveedores.
    public ArrayList<Proveedores> todosProveedores()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Proveedores> arreglo = new ArrayList<Proveedores>();
        Query q=session.createQuery("from Proveedores");
        List<Proveedores> lista=q.list();
        Iterator<Proveedores> iter=lista.iterator();
        tx.commit();
        session.close();
        while(iter.hasNext())
        {
            Proveedores pro = (Proveedores) iter.next();
            arreglo.add(pro);
        }
        return arreglo;
    }
    
    //Método que obtiene un proveedor por Id.
    public Proveedores proveedorPorId(BigDecimal proveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Proveedores in = (Proveedores)session.get(Proveedores.class, proveedorId);
        tx.commit();
        session.close();
        return in;
    }
    
    //Método que actualiza los proveedores.
    public void actualizarProveedor(Proveedores proveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(proveedorId);
        tx.commit();
        session.close();
    }
    
    //Método que guarda los proveedores.
    public void guardarProveedor(Proveedores proveedor){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(proveedor);
        tx.commit();
        session.close();
    }
    
    //Metodo guardando usuario y proveedor utilizando un procedimiento almacenado.
    public void pro_proveedor_usuario(BigDecimal municipioId, String proveedor_Empresa, String proveedor_Contacto, String usuario, String nombre, String correo, String contra){
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        Query q = session.getNamedQuery("pro_proveedor_usuario");
        q.setParameter("P_MUNICIPIO_ID", municipioId.intValue());
        q.setParameter("P_PROVEEDOR_EMPRESA", proveedor_Empresa);
        q.setParameter("P_PROVEEDOR_CONTACTO", proveedor_Contacto);
        q.setParameter("P_USUARIO_USUARIO", usuario);
        q.setParameter("P_USUARIO_NOMBRE", nombre);
        q.setParameter("P_USUARIO_CORREO", correo);
        q.setParameter("P_USUARIO_CONTRASENIA", contra);
        System.out.println(q);
        System.out.println("Que sale"+ q.list().toString());
        tx.commit();
       // sesion.close();
    }
    
}
