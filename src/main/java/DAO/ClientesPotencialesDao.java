package DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import entidades.*;

import javax.persistence.*;
import java.util.List;

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

    //METODO PARA ENCONTRAR EL CORREO DE LOS CLIENTES POTENCIALES QUE NO SON VIP
    public static List<String> encontrarcorreo() {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("ClientesPotenciale.findBycorreo", ClientesPotenciale.class);
        List<String> lista = (List<String>) query1.getResultList();
        em.close();
        return lista;
    }



}

