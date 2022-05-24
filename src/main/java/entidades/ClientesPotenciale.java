package entidades;

import javax.persistence.*;

@Table(name = "`clientes potenciales`", indexes = {
        @Index(name = "fk_clientes potenciales_clientes vip1_idx", columnList = "clientes vip_idclientes vip, clientes vip_Operaciones_idOperaciones")
})
@Entity
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