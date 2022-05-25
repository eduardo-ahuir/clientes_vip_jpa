package entidades;

import javax.persistence.*;

@Table(name = "`clientes potenciales`", indexes = {
        @Index(name = "fk_clientes potenciales_clientes vip1_idx", columnList = "clientes vip_idclientes vip, clientes vip_Operaciones_idOperaciones")
})
@Entity
@NamedQueries({
        @NamedQuery(name = "clientes potenciale", query = "SELECT a FROM clientes potenciales a"),
        @NamedQuery(name = "clientes potenciale.findByIdclientes potenciale", query = "SELECT a FROM clientes potenciale a WHERE a.clientes potencialePK.idclientes potenciale = :idclientes potenciale"),
        @NamedQuery(name = "clientes potenciale.findByNombre", query = "SELECT a FROM clientes potenciale a WHERE a.nombre = :nombre"),
        @NamedQuery(name = "clientes potenciale.findByApellido", query = "SELECT a FROM clientes potenciale a WHERE a.apellido = :apellido"),
        @NamedQuery(name = "clientes potenciale.findByFmatricula", query = "SELECT a FROM clientes potenciale a , clientesvip v WHERE v.dni=a.dni and a.fmatricula = :fmatricula"),
        @NamedQuery(name = "clientes potenciale.findañomodulo", query = "SELECT b, p FROM clientes potenciale b, Modulos p WHERE b.fmatricula =:fmatricula and p.nombre=:nombre   "),
        @NamedQuery(name = "clientes potenciale.findByCicloFormativoId", query = "SELECT a FROM clientes potenciale a WHERE a.clientes potencialePK.cicloFormativoId = :cicloFormativoId"),
        @NamedQuery(name = "ClientesPotenciale.findByNombreIsOrderByNombreAsc", query = "select c from ClientesPotenciale c where c.nombre = :nombre order by c.nombre")
})







public class ClientesPotenciale {
    @EmbeddedId
    private ClientesPotencialeId id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 45)
    private String apellidos;

    @Column(name = "correo", nullable = false, length = 45)
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClientesPotencialeId getId() {
        return id;
    }

    public void setId(ClientesPotencialeId id) {
        this.id = id;
    }
}