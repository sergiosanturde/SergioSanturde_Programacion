package base;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] palabras = new String[10];
        int opcion;
        int sumaLetras = 0;
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce palabra");
            palabras[i] = teclado.next();
        }
        do {
            System.out.println("1. ver palabras");
            System.out.println("2. Obtener aleatoria");
            System.out.println("3. Ver numero letras");
            System.out.println("4. Ver numero palabras");
            System.out.println("4. Ver media palabras");
            System.out.println("5. Ver palabra mas grande");
            System.out.println("6. Ver palabra mas pequeña");
            System.out.println("Que tarea quieres realizar");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Vas a mostrar palabras");
                    for (String item : palabras) {
                        System.out.println(item);
                    }
                    break;
                case 2:
                    System.out.println("Vas a obtener una palabra aleatoria");
                    // 10 posiciones -> 0 - 9
                    int aleatorio = (int) (Math.random() * 10);
                    System.out.println("La palabra aleatoria es: " + palabras[aleatorio]);
                    break;
                case 3:
                    sumaLetras = 0;
                    for (String item : palabras) {
                        sumaLetras += item.length();
                    }
                    System.out.println("El número total de letas es: " + sumaLetras);

                    break;
                case 4:
                    if (sumaLetras == 0) {
                        System.out.println("El numero de letras es 0, posiblemente no las has contado");
                    } else {
                        System.out.println("El numero medio de letras " + sumaLetras / palabras.length);
                    }
                    break;
                case 5 | 6:

                    String pequenia = palabras[0], grande = palabras[0];

                    for (String item : palabras) {
                        if (item.length() > grande.length()) {
                            grande = item;
                        }
                        if (item.length() < pequenia.length()) {
                            pequenia = item;
                        }
                    }

                    break;

            }
        } while (opcion != 0);


        teclado.close();
    }
}
