import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /*System.out.println("Que ciclo?");
        ciclo = teclado.next();

        System.out.println("Que curso quieres mirar?");
        curso = teclado.nextInt();*/



        JSONController controller = new JSONController();
        controller.lecturaUsers();
    }
}
