import controller.ControllerBD;
import model.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre,apellido;
        int edad;
        int eleccion = 0;

        Scanner teclado = new Scanner(System.in);
        ControllerBD controllerBD = new ControllerBD();


        System.out.println("Introduce ");






        /*String nombre,apellido;
        int edad;
        int eleccion = 0;

        do {


            System.out.println("Introduce un nombre");
            nombre = teclado.next();
            System.out.println("Introduce un apellido");
            apellido = teclado.next();
            System.out.println("Introduce una edad");
            edad = teclado.nextInt();

            Alumno alumno1 = new Alumno(nombre, apellido, edad);
            controllerBD.insertarAlumno(alumno1);
            System.out.println("Quieres segir (1- Si 0- No)");
            eleccion = teclado.nextInt();
        }while (eleccion != 0);*/
    }
}
