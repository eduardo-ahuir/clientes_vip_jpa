package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "operaciones")
@Entity
public class Operacione {
    @Id
    @Column(name = "idOperaciones", nullable = false)
    private Integer id;

    @Column(name = "Fecha", nullable = false, length = 45)
    private String fecha;

    @Column(name = "`Cantidad puntos gastados`", nullable = false, length = 45)
    private String cantidadPuntosGastados;

    @Column(name = "OPcliente", nullable = false, length = 45)
    private String oPcliente;

    public String getOPcliente() {
        return oPcliente;
    }

    public void setOPcliente(String oPcliente) {
        this.oPcliente = oPcliente;
    }

    public String getCantidadPuntosGastados() {
        return cantidadPuntosGastados;
    }

    public void setCantidadPuntosGastados(String cantidadPuntosGastados) {
        this.cantidadPuntosGastados = cantidadPuntosGastados;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}