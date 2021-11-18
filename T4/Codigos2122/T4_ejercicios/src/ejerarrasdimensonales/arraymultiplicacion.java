package ejerarrasdimensonales;

import java.util.Scanner;

public class arraymultiplicacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        double media = 0,suma=0;
        int numeroInto=0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor introduce un numero");
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] *2;
        }

        for (int item : numeros) {
            suma += item;
        }

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La media de los numeros es: " + (double)suma/(double) numeros.length);

    }
}
