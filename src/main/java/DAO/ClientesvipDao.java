package DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import entidades.*;

import javax.persistence.*;
import java.util.List;

public class ClientesvipDao {
    static Logger log = LogManager.getRootLogger();
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("serpis_PU");


    //METODO PARA LISTAR TODOS LOS Clientes potenciales
    public List<ClientesVip> seleccionar() {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("Alumno.findAll", ClientesVip.class);
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
    //METODO PARA ENCONTRAR EL SALDO DADO EL NOMBRE DE UN CLIENTE
    public List<String> Econtrarsaldousr(String nombre) {
        EntityManager em = emfactory.createEntityManager();
        Query query1 = em.createNamedQuery("ClientesVip.findByNombre", ClientesVip.class);
        query1.setParameter("nombreusr", nombre); //indicamos el parametro para econtrar ese nombre
        List<String> lista = (List<String>) query1.getResultList();
        em.close();
        return lista;
    }



}
