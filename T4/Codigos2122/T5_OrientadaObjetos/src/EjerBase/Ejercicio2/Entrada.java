package EjerBase.Ejercicio2;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce nombre");
        String nombre = teclado.next();
        System.out.println("Introduce apellido");
        String apellido = teclado.next();
        System.out.println("Introduce dni");
        String dni = teclado.next();
        System.out.println("Introduce edad");
        int edad = teclado.nextInt();
        System.out.println("Introduce peso");
        int peso = teclado.nextInt();
        System.out.println("Introduce altura");
        int altura = teclado.nextInt();

        Persona persona = new Persona(nombre,apellido,dni,edad,peso,altura);

        Persona personaMano = new Persona("Sergio","Santurde","1234567q",20,66,174);
    }
}
