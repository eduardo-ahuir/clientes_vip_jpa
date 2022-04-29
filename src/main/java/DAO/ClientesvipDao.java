package DAO;

import entidades.ClientesPotenciale;
import entidades.ClientesVip;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.*;
import java.util.List;

public class ClientesvipDao {
    static Logger log = LogManager.getRootLogger();
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("serpis_PU");


    //METODO PARA LISTAR TODOS LOS Clientes potenciales
    public List<ClientesVip> seleccionar() {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("Alumno.findAll", ClientesPotenciale.class);
        List<ClientesVip> lista = (List<ClientesVip>) query1.getResultList();
        em.close();
        return lista;

    }

    //METODO PARA INSERTAR Clientes potenciales
    public void insertar(ClientesVip ClientesVip) {

        EntityManager em = emfactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        log.debug("Objeto a persistir: " + ClientesVip);
        em.persist(ClientesVip);
        tx.commit();
        log.debug("Objeto persistido correctamente " + ClientesVip);
        em.close();


    }


    }
