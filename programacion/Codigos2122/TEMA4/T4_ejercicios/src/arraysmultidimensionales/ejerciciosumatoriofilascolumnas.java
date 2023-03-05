package arraysmultidimensionales;

import java.util.Scanner;

public class ejerciciosumatoriofilascolumnas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int filas, columna;
        int numAleatorio[][];
        int sumaFila1=0,sumaFilaN=0,sumaColumna1=0,sumaColumnaN=0;

        System.out.println("Introduzca el numero de filas: ");
        filas = teclado.nextInt();

        System.out.println("Introduzca el numero de columnas: ");
        columna = teclado.nextInt();

        numAleatorio = new int[filas][columna];

        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                numAleatorio[i][j] = (int)(Math.random()*21);
                System.out.print(numAleatorio[i][j] +" ");
            }System.out.println();
        }

        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                if (i==0){
                    sumaFila1 += numAleatorio[i][j];
                }
                if (i==filas-1){
                    sumaFilaN += numAleatorio[i][j];
                }
                if (j==0){
                    sumaColumna1 += numAleatorio[i][j];
                }
                if (i==filas-1){
                    sumaColumnaN += numAleatorio[i][j];
                }

            }
        }

        System.out.println("La suma de la fila 1 es: " + sumaFila1);
        System.out.println("La suma de la fila n es: " + sumaFilaN);
        System.out.println("La suma de la columna 1 es: " + sumaColumna1);
        System.out.println("La suma de la columna n es: " + sumaColumnaN);
    }
}
