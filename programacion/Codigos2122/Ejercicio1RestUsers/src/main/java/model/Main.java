package model;

import controller.JSONController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nUser;
        Genero genero;

        System.out.println("Cuantos usuarios");
        nUser = teclado.nextInt();

        System.out.println("Cuantos usuarios");




        JSONController controller = new JSONController();
        controller.restUsers(3,Genero.female);
    }
}
