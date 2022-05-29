package entidades;

import javax.persistence.*;

@Table(name = "`clientes vip`", indexes = {
        @Index(name = "fk_clientes vip_Operaciones1_idx", columnList = "Operaciones_idOperaciones")
})
@NamedQueries({
        @NamedQuery(name = "ClientesVip.findByNombre", query = "select Nombre,Saldo FROM ClientesVip c where c.nombre=:nombreusr")
})
@Entity
public class ClientesVip {
    @EmbeddedId
    private ClientesVipId id;

    @Column(name = "Nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "Apellidos", nullable = false, length = 45)
    private String apellidos;

    @Column(name = "Correo_electronico", nullable = false, length = 45)
    private String correoElectronico;

    @Column(name = "Usuario", nullable = false, length = 45)
    private String usuario;

    @Column(name = "`Contraseña`", nullable = false, length = 45)
    private String contraseña;

    @Column(name = "Saldo", nullable = false)
    private Integer saldo;

    @Column(name = "`Maximo saldo mes`", nullable = false)
    private Integer maximoSaldoMes;

    public Integer getMaximoSaldoMes() {
        return maximoSaldoMes;
    }

    public void setMaximoSaldoMes(Integer maximoSaldoMes) {
        this.maximoSaldoMes = maximoSaldoMes;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public ClientesVipId getId() {
        return id;
    }

    public void setId(ClientesVipId id) {
        this.id = id;
    }
}