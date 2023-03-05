
import Controller.FicherosController;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        FicherosController ficherosController = new FicherosController();
        ficherosController.listarFicheros();
    }
}
