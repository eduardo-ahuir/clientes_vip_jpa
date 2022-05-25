package pruebas;
import DAO.*;
import entidades.*;
public class Test {
    public static void main(String[] args) {
        ClientesPotenciale c=new ClientesPotenciale();
        ClientesPotencialesDao cd=new ClientesPotencialesDao();
        c.setApellidos("cc");
        c.setCorreo("cc");
        c.setNombre("cc");
        cd.insertar(c);

    }
}
