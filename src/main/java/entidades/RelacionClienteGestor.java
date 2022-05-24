package entidades;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Table(name = "`relacion cliente gestor`", indexes = {
        @Index(name = "fk_clientes vip_has_Gestores_clientes vip1_idx", columnList = "clientes vip_idclientes vip, clientes vip_Operaciones_idOperaciones"),
        @Index(name = "fk_clientes vip_has_Gestores_Gestores1_idx", columnList = "Gestores_idGestores")
})
@Entity
public class RelacionClienteGestor {
    @EmbeddedId
    private RelacionClienteGestorId id;

    public RelacionClienteGestorId getId() {
        return id;
    }

    public void setId(RelacionClienteGestorId id) {
        this.id = id;
    }
}