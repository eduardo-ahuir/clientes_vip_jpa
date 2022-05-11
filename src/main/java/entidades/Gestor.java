package entidades;

import javax.persistence.*;

@Entity
@Table(name = "gestor")
@NamedQueries({
        @NamedQuery(name = "gestor", query = "SELECT a FROM gestor a"),
        @NamedQuery(name = "gestor.findByIdgestor", query = "SELECT a FROM gestor a WHERE a.gestorPK.idgestor = :idgestor"),
        @NamedQuery(name = "gestor.findByNombre", query = "SELECT a FROM gestor a WHERE a.nombre = :nombre"),
        @NamedQuery(name = "gestor.findByApellido", query = "SELECT a FROM gestor a WHERE a.apellidos = :apellido"),
        @NamedQuery(name = "gestor.findByFmatricula", query = "SELECT a FROM gestor a , clientesvip v WHERE v.dni=a.dni and a.fmatricula = :fmatricula"),
        @NamedQuery(name = "gestor.findañomodulo",query = "SELECT b, p FROM gestor b, Modulos p WHERE b.fmatricula =:fmatricula and p.nombre=:nombre   "),
        @NamedQuery(name = "gestor.findByCicloFormativoId", query = "SELECT a FROM gestor a WHERE a.gestorPK.cicloFormativoId = :cicloFormativoId" )})


public class Gestor {
    @Id
    @Column(name = "idGestores", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "Apellidos", nullable = false, length = 45)
    private String apellidos;

    @Column(name = "Correocontacto", nullable = false, length = 45)
    private String correocontacto;

    @Column(name = "`Años en la empresa`", nullable = false, length = 45)
    private String aOsEnLaEmpresa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreocontacto() {
        return correocontacto;
    }

    public void setCorreocontacto(String correocontacto) {
        this.correocontacto = correocontacto;
    }

    public String getAOsEnLaEmpresa() {
        return aOsEnLaEmpresa;
    }

    public void setAOsEnLaEmpresa(String aOsEnLaEmpresa) {
        this.aOsEnLaEmpresa = aOsEnLaEmpresa;
    }

}