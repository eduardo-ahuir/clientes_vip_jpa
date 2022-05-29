package DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import entidades.*;
import javax.persistence.*;
import java.util.List;

public class OperacioneDao {
    static Logger log = LogManager.getRootLogger();
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("serpis_PU");


    //METODO PARA LISTAR TODOS LOS Clientes potenciales
    public List<Operacione> seleccionar() {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("Alumno.findAll", Operacione.class);
        List<Operacione> lista = (List<Operacione>) query1.getResultList();
        em.close();
        return lista;

    }

    //METODO PARA INSERTAR Operacionees
    public void insertar(Operacione Operacione) {

        EntityManager em = emfactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        log.debug("Objeto a persistir: " + Operacione);
        em.persist(Operacione);
        tx.commit();
        log.debug("Objeto persistido correctamente " + Operacione);
        em.close();


    }
    //METODO PARA ENCONTRAR Los gestores a cargo de un cliente
    public List<String> Econtrarmascantidad(int cantidad) {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("Gestor.findbynombre", Gestor.class);
        query1.setParameter("cantidad", cantidad); //indicamos el parametro para encontrar ese nombre
        List<String> lista = (List<String>) query1.getResultList();
        em.close();
        return lista;
    }

}
