package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ejerAgenda {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int agenda = 0;
        ArrayList<Object[]> listaAgenda = new ArrayList();


        do {
            System.out.println("AGENDA");
            System.out.println("1. Añadir persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
            agenda = teclado.nextInt();

            switch (agenda){
                case 1:
                    String nombre,apellido,dni;
                    int telefono = 0;


                    System.out.print("A continuacion vamos a introducir sus datos" + "\n");

                    System.out.println("Introduce la nombre");
                    nombre = teclado.next();

                    System.out.println("Introduce un apellido");
                    apellido = teclado.next();

                    System.out.println("Introduce una telefono");
                    telefono = teclado.nextInt();

                    System.out.println("Introduce su DNI");
                    dni = teclado.next();


                    Object[] persona = new Object[]{nombre,apellido,telefono,dni};
                    if (listaAgenda.size()<5){
                        System.out.println("Informacion añadida");
                        listaAgenda.add(persona);
                    }else{
                        System.out.println("ERROR");
                    }
                    break;

                case 2:
                    System.out.println("Que DNI quieres buscar");
                    String dniBuscar = teclado.next();
                    boolean encontrado = false;

                    for (Object[] personaBuscar : listaAgenda) {
                        if (personaBuscar[3].toString().equalsIgnoreCase(dniBuscar)) {
                            encontrado = true;
                            System.out.println("Nombre: " + personaBuscar[0] + "Apellido: " + personaBuscar[1] + "Telefono: " + personaBuscar[2] + "DNI: " + personaBuscar[3]);
                        }
                    }
                    if (!encontrado){
                        System.out.println("ERROR");}
                case 3:
                    System.out.println("Que dni quieres buscar");
                    dni = teclado.next();


                    for (int i = 0; i < listaAgenda.size(); i++) {
                        if (listaAgenda.get(i)[3].toString().equalsIgnoreCase(dni)){
                            System.out.println("Coche borrado");
                            listaAgenda.remove(i);
                            break;
                        }
                    }

                case 4:
                    if (listaAgenda.size()>0){
                        for ( Object[] item : listaAgenda) {
                            System.out.println("Nombre: " + item[0] + "Apellido: " + item[1] + "Telefono: " + item[2] + "DNI: " + item[3]);
                        }
                    }else {
                        System.out.println("No hay datos en la agenda");
                    }
                    break;
            }

        }while (agenda!=0);
    }
}