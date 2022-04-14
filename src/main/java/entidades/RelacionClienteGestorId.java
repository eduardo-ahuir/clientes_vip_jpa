package entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RelacionClienteGestorId implements Serializable {
    private static final long serialVersionUID = 8170413267369177431L;
    @Column(name = "`clientes vip_idclientes vip`", nullable = false)
    private Integer clientesVipIdclientesVip;

    @Column(name = "`clientes vip_Operaciones_idOperaciones`", nullable = false)
    private Integer clientesVipOperacionesIdoperaciones;

    @Column(name = "Gestores_idGestores", nullable = false)
    private Integer gestoresIdgestores;

    public Integer getClientesVipIdclientesVip() {
        return clientesVipIdclientesVip;
    }

    public void setClientesVipIdclientesVip(Integer clientesVipIdclientesVip) {
        this.clientesVipIdclientesVip = clientesVipIdclientesVip;
    }

    public Integer getClientesVipOperacionesIdoperaciones() {
        return clientesVipOperacionesIdoperaciones;
    }

    public void setClientesVipOperacionesIdoperaciones(Integer clientesVipOperacionesIdoperaciones) {
        this.clientesVipOperacionesIdoperaciones = clientesVipOperacionesIdoperaciones;
    }

    public Integer getGestoresIdgestores() {
        return gestoresIdgestores;
    }

    public void setGestoresIdgestores(Integer gestoresIdgestores) {
        this.gestoresIdgestores = gestoresIdgestores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelacionClienteGestorId entity = (RelacionClienteGestorId) o;
        return Objects.equals(this.clientesVipOperacionesIdoperaciones, entity.clientesVipOperacionesIdoperaciones) &&
                Objects.equals(this.clientesVipIdclientesVip, entity.clientesVipIdclientesVip) &&
                Objects.equals(this.gestoresIdgestores, entity.gestoresIdgestores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientesVipOperacionesIdoperaciones, clientesVipIdclientesVip, gestoresIdgestores);
    }

}