package DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.*;
import java.util.List;
import entidades.ClientesPotenciale;

public class ClientesPotencialesDao {
    static Logger log = LogManager.getRootLogger();
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("clientes_vip");


    //METODO PARA LISTAR TODOS LOS Clientes potenciales
    public List<ClientesPotenciale> seleccionar() {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("Alumno.findAll", ClientesPotenciale.class);
        List<ClientesPotenciale> lista = (List<ClientesPotenciale>) query1.getResultList();
        em.close();
        return lista;

    }

    //METODO PARA INSERTAR Clientes potenciales
    public void insertar(ClientesPotenciale ClientesPotenciale) {

        EntityManager em = emfactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        log.debug("Objeto a persistir: " + ClientesPotenciale);
        em.persist(ClientesPotenciale);
        tx.commit();
        log.debug("Objeto persistido correctamente " + ClientesPotenciale);
        em.close();


    }

    //METODO DE PRUEBA PARA ENCONTRAR POR nombre (HAY QUE PASAR PARAMETRO STRING)
    public List<String> econtrarpornombre(String nombre) {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("clientes potenciale.findByNombre", ClientesPotenciale.class);
        query1.setParameter("nombre", nombre); //indicamos el parametro para econtrar ese nombre
        List<String> lista = (List<String>) query1.getResultList();
        em.close();
        return lista;
    }



}

