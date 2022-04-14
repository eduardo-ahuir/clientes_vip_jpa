package entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClientesVipId implements Serializable {
    private static final long serialVersionUID = 5676665271125774547L;
    @Column(name = "`idclientes vip`", nullable = false)
    private Integer idclientesVip;

    @Column(name = "Operaciones_idOperaciones", nullable = false)
    private Integer operacionesIdoperaciones;

    public Integer getIdclientesVip() {
        return idclientesVip;
    }

    public void setIdclientesVip(Integer idclientesVip) {
        this.idclientesVip = idclientesVip;
    }

    public Integer getOperacionesIdoperaciones() {
        return operacionesIdoperaciones;
    }

    public void setOperacionesIdoperaciones(Integer operacionesIdoperaciones) {
        this.operacionesIdoperaciones = operacionesIdoperaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientesVipId entity = (ClientesVipId) o;
        return Objects.equals(this.idclientesVip, entity.idclientesVip) &&
                Objects.equals(this.operacionesIdoperaciones, entity.operacionesIdoperaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idclientesVip, operacionesIdoperaciones);
    }

}