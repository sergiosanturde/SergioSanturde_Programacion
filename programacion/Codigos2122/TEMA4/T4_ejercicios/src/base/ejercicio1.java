package base;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero a guardar");
            int numero = teclado.nextInt();
            numeros[i] = numero;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d : %d%n",i,numeros[i]);
        }
    }
}
