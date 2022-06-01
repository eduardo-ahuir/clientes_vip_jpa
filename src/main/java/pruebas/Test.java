package pruebas;
import DAO.*;
import entidades.*;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        ClientesPotencialesDao c = new ClientesPotencialesDao();
        ClientesvipDao cv= new ClientesvipDao();
        GestorDao g=new GestorDao();
        OperacioneDao op=new OperacioneDao();

        Scanner tcl = new Scanner(System.in);
        int opcion = 0;
            do {
                try {
                    System.out.println("\nElige el número de la opción a consultar:"
                            + "\n1.Correo electronico de aquellos clientes potenciales que no son clientes vip."
                            + "\n2.Saldo de la cuenta de un cliente concreto(Se debe introducir su nombre)\n."
                            + "\n3.Todos los clientes a cargo de un Gestor concreto\n."
                            + "\n4.Lista de tesis por mentor defendidas entre el 09/11/21 y el 09/01/22."
                            + "\n5.Nota media de las tesis por tutor y área elegidos."
                            + "\n6.Total de ECTS impartidos por doctorand@ con nota de tesis superior a 8."
                            + "\n7.Dar de alta a un doctorando."
                            + "\n8.Dar de alta a un mentor."
                            + "\n9.Salir del programa.");
                    opcion = tcl.nextInt();
                    tcl.nextLine();
                    switch(opcion){

                        case 1:
                            //1.correos de todos los que no son vip
                            c.encontrarcorreo().forEach(clista->{System.out.println("\nCorreo electronico de los clientes potenciales que no se han hecho vip:\" "+clista.toString());});
                            break;
                        case 2:
                            System.out.println("Introduce el nombre del cliente");
                            String nombre;
                            nombre=tcl.nextLine();
                            cv.Econtrarsaldousr(nombre).forEach(cvlista->{System.out.println("\nSaldo de la cuenta de:"+nombre+cvlista.toString());});
                            break;
                        case 3:
                            System.out.println("Introduce el nombre del cliente");
                            String nombrec;
                            nombrec=tcl.nextLine();
                            g.Econtrargestor(nombrec).forEach(glista->{System.out.println("\nClientes a cargo de:"+nombrec+glista.toString());});
                        case 4:
                            int cantidad = tcl.nextInt();
                            tcl.nextLine();
                            op.Econtrarmascantidad(cantidad).forEach(oplista->{System.out.println("\noperaciones de mas de"+cantidad+"puntos"+oplista.toString());});
                            break;












                    }

                }catch(InputMismatchException e) { //Excepción de mismatch
                    System.out.println("\nERROR! TIPO DE DATO INSERTADO NO VALIDO: " + e.getMessage());
                    tcl.next(); //limpiamos el buffer
                }
            }while(opcion!=9);

    }
}