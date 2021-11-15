package base;

import java.sql.SQLOutput;

public class ejercicio4 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] cubo = new int[20];
        int[] cuadrado = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*101);
            System.out.println((int)(Math.random()*101));
        }


        for (int i = 0; i < numeros.length; i++) {
            cuadrado[i] = (int) (Math.pow(numeros[i],2));
        }
        for (int i = 0; i < numeros.length; i++) {
            cubo[i] = (int) (Math.pow(numeros[i],3));
        }
        System.out.print("Columnas \t cuadrado \t cubo \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d \t \t \t %d \t \t %d%n",numeros[i],cuadrado[i],cubo[i]);

        }
    }
}
