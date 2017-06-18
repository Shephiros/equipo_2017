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
    
    public void equipo_ingreso_pro(BigDecimal compraID, String nombreEquipo, String equipoMarca,
                                   String equipoModelo, BigDecimal equipoAnyoFabricacion,
                                   Double equipoBtu, Double equipoPotencia, BigDecimal equipoEstado){
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
        System.out.println("Comrpa" + compraID);
        System.out.println("Nombre" + nombreEquipo);
        System.out.println("marca" + equipoMarca);
        System.out.println("modelo" + equipoModelo);
        System.out.println("Fabricacion "+ equipoAnyoFabricacion);
        System.out.println("Btu "+ equipoBtu);
        System.out.println("Potencia "+ equipoPotencia);
        System.out.println("Estado "+ equipoEstado);
        Query q = session.getNamedQuery("equipo_pro_ingreso");
        q.setParameter("P_COMPRA_ID", compraID.intValue());
        q.setParameter("P_EQUIPO_NOMBRE", nombreEquipo);
        q.setParameter("P_EQUIPO_MARCA", equipoMarca);
        q.setParameter("P_EQUIPO_MODELO", equipoModelo);
        q.setParameter("P_EQUIPO_ANIO_FABRICACION", equipoAnyoFabricacion.intValue());
        q.setParameter("P_EQUIPO_BTU", equipoBtu);
        q.setParameter("P_EQUIPO_POTENCIA", equipoPotencia);
        q.setParameter("P_EQUIPO_ESTADO", equipoEstado.intValue());
        System.out.println(q);
       System.out.println("Que sale"+ q.list().toString());
        tx.commit();
         
    }
    
}
