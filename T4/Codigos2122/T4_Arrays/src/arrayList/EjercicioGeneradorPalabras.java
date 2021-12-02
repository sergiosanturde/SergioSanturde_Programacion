package arrayList;

import java.util.Scanner;

public class EjercicioGeneradorPalabras {

    public static void main(String[] args) {
        char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner tecaldo = new Scanner(System.in);
        int palabrasGenerar;

        System.out.println("Cuantas palabras quieres genear");
        palabrasGenerar = tecaldo.nextInt();

        for (int i = 0; i < palabrasGenerar; i++) {
            System.out.println("Palabras" + i);
            System.out.println("Cunatas letras tiene la palabras");
            int numeroLetras = tecaldo.nextInt();
            String palabra = "";
            for (int j = 0; j < numeroLetras; j++) {
                char letraAleatoria = abecedario[(int)( Math.random()*abecedario.length)];
                palabra += letraAleatoria;

            }
            System.out.println(palabra);
        }
    }
}
