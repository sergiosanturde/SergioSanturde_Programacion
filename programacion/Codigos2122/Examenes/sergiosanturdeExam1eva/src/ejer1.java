import java.util.Scanner;

public class ejer1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;
        int longitud = 0;
        int[] array = new int[0];
        int posini,posfin;
        int numAleatorio;


        do {
            System.out.println("1 - Iniciar array");
            System.out.println("2 - Array con numeros aleatorios");
            System.out.println("3 - Listar posiciones superior a 10 y par");
            System.out.println("4 - Rotar posiciones a la izquierda");
            System.out.println("5 - Listar posiciones");
            System.out.println("-- SALIR --");
            System.out.println("Seleciona una opcion");
            menu = teclado.nextInt();


            switch (menu){
                case 1:

                    System.out.println("De que longitud quieres el array");
                    longitud = teclado.nextInt();

                    array = new int[longitud];

                    if (array.length == 0){
                        System.out.println("No es posible");
                    }
                    break;

                case 2:
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int)(Math.random()*101);
                    }
                    System.out.println("Se han generado los numeros aleatorios");
                    if (longitud == 0){
                        System.out.println("La longitud no  esta definida");
                    }
                    break;
                case 3:
                    if (longitud>10 && longitud % 2 == 0){
                        longitud += array.length;
                    }
                    if (longitud == 0){
                        System.out.println("La longitud no  esta definida");
                    }
                    break;
                case 4:
                    posini = 0;
                    if (longitud != 0 && longitud > 0)
                        for (int i = 0; i < longitud; i++) {
                            array[0] = posini;
                            array[1] = array[i + 1];
                            System.out.println(array[i]);
                        }

                    if (longitud == 0){
                        System.out.println("La longitud no esta definida");
                    }
                    break;
                case 5:
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i] );
                    }
                    if (longitud == 0){
                        System.out.println("La longitud no esta definida");
                    }
                default:
            }
        }while (menu != 0);
    }
}
