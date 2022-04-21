import controller.ControllerEjercicio1;
import model.Usuario;
import model.UsuarioEjercicio1;

import java.util.Scanner;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre,apellidos,password;
        int opcionUser =0,opcionLectura = 0;

        do {
            System.out.println("Introduce el nombre");
            nombre = teclado.next();
            System.out.println("Introduce el apellido");
            apellidos = teclado.next();
            System.out.println("Introduce la contraseña");
            password = teclado.next();
            UsuarioEjercicio1 usuario = new UsuarioEjercicio1(nombre,apellidos,password);

            System.out.println("Quieres meter mas usuarios?");
            opcionUser = teclado.nextInt();
        }while (opcionUser != 0);


    }
}
