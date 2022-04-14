package entidades;

import javax.persistence.*;

@Entity
@Table(name = "`relacion cliente gestor`")
public class RelacionClienteGestor {
    @EmbeddedId
    private RelacionClienteGestorId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "clientes vip_idclientes vip", referencedColumnName = "idclientes vip", nullable = false),
            @JoinColumn(name = "clientes vip_Operaciones_idOperaciones", referencedColumnName = "Operaciones_idOperaciones", nullable = false)
    })
    private ClientesVip clientesVip;

    @MapsId("gestoresIdgestores")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Gestores_idGestores", nullable = false)
    private Gestor gestoresIdgestores;

    public RelacionClienteGestorId getId() {
        return id;
    }

    public void setId(RelacionClienteGestorId id) {
        this.id = id;
    }

    public ClientesVip getClientesVip() {
        return clientesVip;
    }

    public void setClientesVip(ClientesVip clientesVip) {
        this.clientesVip = clientesVip;
    }

    public Gestor getGestoresIdgestores() {
        return gestoresIdgestores;
    }

    public void setGestoresIdgestores(Gestor gestoresIdgestores) {
        this.gestoresIdgestores = gestoresIdgestores;
    }

}