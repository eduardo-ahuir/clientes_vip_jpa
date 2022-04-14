package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gestor")
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