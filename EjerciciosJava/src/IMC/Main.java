package IMC;

import IMC.Model.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String sexo;
        int edad;
        double peso, altura;

        System.out.println("Cual es tu nombre");
        nombre = sc.next();
        System.out.println("Cual es tu edad");
        edad = sc.nextInt();
        System.out.println("Cual es tu sexo (H/M)");
        sexo = sc.next();
        System.out.println("Cual es tu peso");
        peso = sc.nextDouble();
        System.out.println("Cual es tu altura");
        altura = sc.nextDouble();


        Persona persona1 = new Persona(nombre, sexo, peso, altura, edad);

        Persona persona2 = new Persona(nombre, sexo, edad);

        Persona persona3 = new Persona(nombre,sexo,edad);
        persona3.setNombre("Sergio");
        persona3.setEdad(21);
        persona3.setSexo("H");
        persona3.setPeso(65);
        persona3.setAltura(1.70);

        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();
    }

    public void sistema(int imc) {
        switch (imc) {
            case -1 ->
                    System.out.println("Debajo del peso ideal");
            case 0 ->
                    System.out.println("Peso ideal");
            case 1 ->
                    System.out.println("Encima peso ideal");
        }
    }
}
