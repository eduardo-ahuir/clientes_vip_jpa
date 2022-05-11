package entidades;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "`clientes potenciales`")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "clientes potenciale", query = "SELECT a FROM clientes potenciale a"),
        @NamedQuery(name = "clientes potenciale.findByIdclientes potenciale", query = "SELECT a FROM clientes potenciale a WHERE a.clientes potencialePK.idclientes potenciale = :idclientes potenciale"),
        @NamedQuery(name = "clientes potenciale.findByNombre", query = "SELECT a FROM clientes potenciale a WHERE a.nombre = :nombre"),
        @NamedQuery(name = "clientes potenciale.findByApellido", query = "SELECT a FROM clientes potenciale a WHERE a.apellido = :apellido"),
        @NamedQuery(name = "clientes potenciale.findByFmatricula", query = "SELECT a FROM clientes potenciale a , clientesvip v WHERE v.dni=a.dni and a.fmatricula = :fmatricula"),
        @NamedQuery(name = "clientes potenciale.findañomodulo",query = "SELECT b, p FROM clientes potenciale b, Modulos p WHERE b.fmatricula =:fmatricula and p.nombre=:nombre   "),
        @NamedQuery(name = "clientes potenciale.findByCicloFormativoId", query = "SELECT a FROM clientes potenciale a WHERE a.clientes potencialePK.cicloFormativoId = :cicloFormativoId" )})
public class ClientesPotenciale {
    @Id
    @Column(name = "`idClientes potenciales`", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//TODO [JPA Buddy] generate columns from DB
}