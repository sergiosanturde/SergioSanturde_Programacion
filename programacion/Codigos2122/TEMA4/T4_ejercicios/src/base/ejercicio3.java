package base;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero a guardar");
            int numero = teclado.nextInt();
            numeros[i] = numero;
        }
        System.out.println("Orden inverso");
        for (int x = 9; x >-1; x--) {
            if (x>0){
                System.out.print(numeros[x] +",");
            }else{
                System.out.print(numeros[x]);
            }
        }
        System.out.println();
        System.out.println("Orden normal");
        for (int x = 0; x < numeros.length; x++) {
            if (x<9){
                System.out.print(numeros[x] +",");
            }else{
                System.out.print(numeros[x]);
            }
        }

    }
}