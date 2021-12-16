package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioGaraje {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int garaje = 0;
        ArrayList<Object[]> listaCoches = new ArrayList();


        do {
            System.out.println("Bienvenido al garaje");
            System.out.println("1. Añadir coche");
            System.out.println("2. Lista de coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Mostrar costes");
            System.out.println("5. Eliminar coche");
            System.out.println("6. Vaciar garaje");
            System.out.println("7. Salir");
            garaje = teclado.nextInt();

            switch (garaje){
                case 1:
                    String marca,modelo,matricula;
                    int coste = 0;


                    System.out.print("A continuacion vamos a introducir los datos del coche" + "\n");

                    System.out.println("Introduce la marca");
                    marca = teclado.next();

                    System.out.println("Introduce un modelo");
                    modelo = teclado.next();

                    System.out.println("Introduce una matricula");
                    matricula = teclado.next();

                    System.out.println("Que precio tiene el coche");
                    coste = teclado.nextInt();

                    Object[] coche = new Object[]{marca,modelo,matricula,coste};

                    if (listaCoches.size()<5){
                        System.out.println("Coche recepcionado");
                        listaCoches.add(coche);
                    }else{
                        System.out.println("No hay espacio disponible");
                    }

                    break;
                case 2:
                    if (listaCoches.size()>0){
                        for ( Object[] item : listaCoches ) {
                            System.out.println("Marca: " + item[0] + "Modelo: " + item[1] + "Matricula: " + item[2] + "Coste: " + item[3]);
                        }
                    }else {
                        System.out.println("No hay coches en el garaje");
                    }
                    break;
                case 3:
                    System.out.println("Que matricula quieres buscar");
                    String matriculaBuscar = teclado.next();
                    boolean encontrado = false;

                        for ( Object[] cocheBuscar : listaCoches ) {

                            if (!cocheBuscar[2].toString().equalsIgnoreCase(matriculaBuscar)){
                                encontrado = true;
                                System.out.println("Marca: " + cocheBuscar[0]
                                        + "Modelo: " + cocheBuscar[1]
                                        + "Matricula: " + cocheBuscar[2]
                                        + "Coste: " + cocheBuscar[3]);
                            }
                        }
                    if (!encontrado){
                        System.out.println("El coche no está en el garaje");
                    }
                case 4:

                    int costeAcumulado = 0;
                    for ( Object[] mostrar : listaCoches ) {
                        costeAcumulado += (int)mostrar[3];
                    }
                case 5:
                    System.out.println("Que matricula quieres buscar");
                    matricula = teclado.next();
                    encontrado = false;

                    for (int i = 0; i < listaCoches.size(); i++) {
                        if (listaCoches.get(i)[2].toString().equalsIgnoreCase(matricula)){
                            System.out.println("Coche borrado");
                            encontrado = true;
                            listaCoches.remove(i);
                            break;
                        }

                    }

                    if (!encontrado){
                        System.out.println("Coche no encontrado en lqa lista");
                    }
                case 6:
                    listaCoches.clear();
                    System.out.println("Lista vaciada");
                    break;
            }
        }while (garaje != 0);
    }
}
