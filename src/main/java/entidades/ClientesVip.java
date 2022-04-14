package entidades;

import javax.persistence.*;

@Entity
@Table(name = "`clientes vip`")
public class ClientesVip {
    @EmbeddedId
    private ClientesVipId id;

    @MapsId("operacionesIdoperaciones")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Operaciones_idOperaciones", nullable = false)
    private Operacione operacionesIdoperaciones;

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

    public ClientesVipId getId() {
        return id;
    }

    public void setId(ClientesVipId id) {
        this.id = id;
    }

    public Operacione getOperacionesIdoperaciones() {
        return operacionesIdoperaciones;
    }

    public void setOperacionesIdoperaciones(Operacione operacionesIdoperaciones) {
        this.operacionesIdoperaciones = operacionesIdoperaciones;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getMaximoSaldoMes() {
        return maximoSaldoMes;
    }

    public void setMaximoSaldoMes(Integer maximoSaldoMes) {
        this.maximoSaldoMes = maximoSaldoMes;
    }

}