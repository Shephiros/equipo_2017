/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Pantallas;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class PantallasDao {
    
    
    public ArrayList<Pantallas> todasPantallas()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
                ArrayList<Pantallas> arreglo = new ArrayList<Pantallas>();
                Query q=session.createQuery("from Pantallas");
                List<Pantallas> lista=q.list();
                Iterator<Pantallas> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            Pantallas pantalla = (Pantallas) iter.next();
            arreglo.add(pantalla);
        }
        return arreglo;
    }
    
    public Pantallas pantallaPorPantalla(BigDecimal pantallaId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Pantallas pa = (Pantallas)session.get(Pantallas.class, pantallaId);
        tx.commit();
        session.close();
        return pa;
    }
    /*
    //Método que obtiene una pantalla por rol Id y pantalla Id.
    public Pantallas ofertaPorProveedorId(BigDecimal licitacionId, BigDecimal proveedorId){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Query q=session.createQuery("from Ofertas where licitaciones.licitacionId = "+licitacionId+" and proveedores.proveedorId = "+proveedorId);
        Ofertas ofer = (Ofertas) q.uniqueResult();
        tx.commit();
        session.close();
        return ofer;
    }
    */
    
    
}
