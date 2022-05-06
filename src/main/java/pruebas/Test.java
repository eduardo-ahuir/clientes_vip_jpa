package pruebas;
import DAO.*;
import entidades.*;
public class Test {
    public static void main(String[] args) {
        objeto o=new objeto();
        o.setHolo("o");
        ClientesPotenciale c=new ClientesPotenciale();
        c.setId(1);
        ClientesVip cc= new ClientesVip();
        cc.setApellidos("cc");
        cc.setContraseña("cc");
        cc.setCorreoElectronico("cc");
        cc.setNombre("cc");
        cc.setSaldo(1);
        cc.setMaximoSaldoMes(1);
    }
}
