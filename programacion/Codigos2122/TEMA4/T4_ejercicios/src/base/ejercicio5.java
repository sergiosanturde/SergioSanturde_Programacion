package base;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[8];
        int numerosPares=0, numeroImpares=0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            int numero = teclado.nextInt();

        }
        for (int i = 0; i < 15; i++) {
            if(numeros[i]%2==0){
                numerosPares++;
            }else{
                numeroImpares++;
            }
        }

    }
}
