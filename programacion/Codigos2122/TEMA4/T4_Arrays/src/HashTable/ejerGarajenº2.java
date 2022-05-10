package HashTable;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class ejerGarajenº2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int garaje = 0;
        Hashtable<String,Object[]> listaCoches = new Hashtable();


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

            switch (garaje) {
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
                        listaCoches.put(matricula,coche);
                    }else{
                        System.out.println("No hay espacio disponible");
                    }
                    break;
                case 2:
                    Enumeration<String> CochesEnum = listaCoches.keys();
                    while (CochesEnum.hasMoreElements()){
                        String clave = CochesEnum.nextElement();
                        Object[] elemento =  listaCoches.get(clave);
                        for (int i = 0; i < elemento.length; i++) {
                            System.out.println(elemento[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Que matricula quieres buscar");
                    String matriculaBuscar = teclado.next();

                    boolean encontrado = false;

                    for ( Object[] cocheBuscar : listaCoches ) {

                        if (listaCoches.get(matriculaBuscar);
){
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
                    break;
            }
        }while(garaje != 0);

    }
}