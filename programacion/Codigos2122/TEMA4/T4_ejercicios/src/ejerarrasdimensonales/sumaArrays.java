package ejerarrasdimensonales;

import java.util.Scanner;

public class sumaArrays {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int longitud;
        int[] arrayUno,arrayDos,arrayTres;
        System.out.println("De que longitud quieres lo arrays");
        longitud = teclado.nextInt();

        arrayUno = new int[longitud];
        arrayDos = new int[longitud];
        arrayTres = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            arrayUno[i] = (int)(Math.random()*21);
            arrayDos[i] = (int)(Math.random()*21);

        }
        for (int i = 0; i < longitud; i++) {
            arrayTres[i] = arrayUno[i] + arrayDos[i];

        }
    }
}
