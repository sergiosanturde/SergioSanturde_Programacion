package Examen;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion=0;

        Pizzeria italiano = new Pizzeria();
        boolean nombrePedido = true;
        String nombre,nombreIngredientes,pedirNombre;
        double ingredientes;
        double costeIngrediente;



        do {

            System.out.println("¿Qué quieres elegir?");
            System.out.println("1.- Realizar pedido");
            System.out.println("2.- Servir pedido");
            System.out.println("3.- Ver pedidos pendientes");
            System.out.println("4.- Ver caja");
            System.out.println("5.- Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("Dime tu nombre");
                nombre = teclado.next();
                System.out.println("Dime numero ingredientes");
                ingredientes = teclado.nextInt();
                Pizza pizza = new Pizza(1,nombre);
                for (int i = 0; i < ingredientes; i++) {
                    System.out.println("Dime nombre de ingrediente");
                    nombre = teclado.next();
                    System.out.println("Dime coste ingrediente");
                    costeIngrediente = teclado.nextDouble();
                    Ingrediente ingrediente = new Ingrediente(nombre,costeIngrediente);
                    pizza.agregarIngrediente(ingrediente);
                }
                italiano.agregarPedido(pizza);

                break;

                case 2:
                    System.out.println("Dime tu nombre");
                    pedirNombre = teclado.next();
                    if (nombrePedido == true) {
                        System.out.println("Pizza entregada");

                    } else {
                        System.out.println("Esta pedido no le corresponde");
                    }

                    break;
                case 3:
                    italiano.mostrarPedidosPendientes();
                    break;
                case 4:

                    break;

            }
        }while (opcion!=0);
    }
}
