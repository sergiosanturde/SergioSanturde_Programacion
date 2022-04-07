import Controller.FicherosController2;

import java.io.File;

public class Entrada2 {
    public static void main(String[] args) {
            File file = null;
            File directory = null;
            File directory2 = null;

            file =new File("C:/Users/Usuario DAM1/Desktop/ficheros/ficheroEscritura.txt");


            FicherosController2 ficherosController = new FicherosController2();
            //ficherosController.lecturaFichero(file);
            //ficherosController.lecturaBuffer(file);
            //ficherosController.escrituraFichero(file);
            ficherosController.cifrado(file);
    }
}

