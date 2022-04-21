package EjerClase;

import java.io.File;

public class Entrada {
    public static void main(String[] args) {
        File file = null;

        file = new File("C:/Users/Usuario DAM1/Desktop/ficheros/ficheroBucle.txt");

        Ficheros ficheros = new Ficheros();
        ficheros.ficheroBucle(file);

    }
}
