package entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClientesPotencialeId implements Serializable {
    private static final long serialVersionUID = 870581716243831360L;
    @Column(name = "`idClientes potenciales`", nullable = false)
    private Integer idClientesPotenciales;
    @Column(name = "`clientes vip_idclientes vip`", nullable = false)
    private Integer clientesVipIdclientesVip;
    @Column(name = "`clientes vip_Operaciones_idOperaciones`", nullable = false)
    private Integer clientesVipOperacionesIdoperaciones;

    public Integer getClientesVipOperacionesIdoperaciones() {
        return clientesVipOperacionesIdoperaciones;
    }

    public void setClientesVipOperacionesIdoperaciones(Integer clientesVipOperacionesIdoperaciones) {
        this.clientesVipOperacionesIdoperaciones = clientesVipOperacionesIdoperaciones;
    }

    public Integer getClientesVipIdclientesVip() {
        return clientesVipIdclientesVip;
    }

    public void setClientesVipIdclientesVip(Integer clientesVipIdclientesVip) {
        this.clientesVipIdclientesVip = clientesVipIdclientesVip;
    }

    public Integer getIdClientesPotenciales() {
        return idClientesPotenciales;
    }

    public void setIdClientesPotenciales(Integer idClientesPotenciales) {
        this.idClientesPotenciales = idClientesPotenciales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientesVipOperacionesIdoperaciones, clientesVipIdclientesVip, idClientesPotenciales);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientesPotencialeId entity = (ClientesPotencialeId) o;
        return Objects.equals(this.clientesVipOperacionesIdoperaciones, entity.clientesVipOperacionesIdoperaciones) &&
                Objects.equals(this.clientesVipIdclientesVip, entity.clientesVipIdclientesVip) &&
                Objects.equals(this.idClientesPotenciales, entity.idClientesPotenciales);
    }
}