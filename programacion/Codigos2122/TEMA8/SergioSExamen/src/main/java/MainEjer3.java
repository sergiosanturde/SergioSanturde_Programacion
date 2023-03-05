import controller.Controller3;

import java.util.Scanner;

public class MainEjer3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Controller3 controller = new Controller3();
        int eleccUser = 0;

        System.out.println("Selecciona una opcion");
        System.out.println("1.- Ver peliculas en cartelera");

        System.out.println("2.- Ver peliculas proximamente");
        eleccUser = teclado.nextInt();


    }
}
