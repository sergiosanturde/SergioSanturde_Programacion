package ejerarrasdimensonales;

import java.util.Scanner;

public class posicionesArray {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        int[] numeros = new int[0];
        int[] array;


        System.out.println("Introduce la longitud del array");
        longitud = teclado.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero");
            int numeroInto = teclado.nextInt();

            numeros[i] = numeroInto;
        }
        int ultimo = numeros[numeros.length-1];
        int primero = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length-1]=primero;
        for ( int item : numeros ) {
            System.out.print(item);
        }

    }
}
