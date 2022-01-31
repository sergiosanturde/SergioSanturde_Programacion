package EjerciciosObjetos.EjerTrigronometria;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo(5,5);

        Circulo circulo1 = new Circulo(2.4);

        Cuadrado cuadrado = new Cuadrado(3,8);

        System.out.println("El area del Triangulo es: " + triangulo1.calcularArea());
        System.out.println("El area del Circulo es: " + circulo1.calculoArea());
        System.out.println("El diametro del Circulo es: " + circulo1.calculoDiametro());
        System.out.println("El area del Cuadrado es: "+ cuadrado.calcularArea());
        System.out.println("El perimetro del Cuadrado es: " + cuadrado.calcularPerimetro());
        //modificar

        System.out.println("¿Qué quieres seleccionar?");
        System.out.println("1.- Trabajar con triángulos");
        System.out.println("2.- Trabajar con circulos");
        System.out.println("3.-Trabajar con cuadrados");
        System.out.println("4. Salir");

        System.out.println("Escribe una de las opciones");
        int opcion = teclado.nextInt();

        switch (opcion){

            case 1:
                System.out.println("Introduce una base");
                int base = teclado.nextInt();
                System.out.println("Introduce una altura");
                int altura = teclado.nextInt();
                System.out.println("¿Qué operacion quieres hacer?");
                System.out.println("Calcular area");
                System.out.println("Mostrar datos");
                int opcion1 = teclado.nextInt();
                    switch (opcion1){
                        case 1:

                    }
        }



    }
}
