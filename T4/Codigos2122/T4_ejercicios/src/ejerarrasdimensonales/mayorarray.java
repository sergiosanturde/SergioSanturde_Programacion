package ejerarrasdimensonales;

import java.util.Arrays;
import java.util.Scanner;

public class mayorarray {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud = 0;
        int[] numeros;
        int max = -9999, min = 9999;
        System.out.println("De que longitud quieres crear el array?");
        longitud = teclado.nextInt();
        numeros = new int[longitud];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero");
            int numeroInto = teclado.nextInt();

            numeros[i] = numeroInto;
        }

        System.out.println("Desordenados");

        for (int item : numeros) {
            System.out.println();
        }

        System.out.println("Ordenados");

        Arrays.sort(numeros);



        }
    }

