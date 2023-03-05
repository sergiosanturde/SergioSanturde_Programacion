package Controller;

import java.io.File;
import java.util.Scanner;

public class FicherosController {
    Scanner teclado = new Scanner(System.in);


        public void listarFicheros(){
            File file = new File("C:/Users/Usuario DAM1/Desktop/ficheros");
            File[] ficherosParent = file.listFiles();
            System.out.println("Imprimiendo "+file.getName());
            int contador = 0;
            int opcion=0;
            for ( File item  : ficherosParent ) {
                //if (item.isHidden()) {
                    System.out.println(contador + " - " + item.getName());
                    contador++;
                //}
            }
            System.out.println("Qué directorio quieres listar?");
            opcion = teclado.nextInt();
            if (opcion>=0 && opcion< ficherosParent.length){
                if (ficherosParent[opcion].isDirectory()){
                listarChild(ficherosParent[opcion]);

                }else{
                System.out.println("ERROR");
                }
            }else {
                System.out.println("Opcion incorrecta");
            }
        }
        public void listarChild(File child){
            int contador=0;
            int opcionChild=0;
            File[] ficherosChild = child.listFiles();
            for ( File childItem : ficherosChild ) {
                System.out.println(contador + " - "+childItem.getName());
                contador++;
            }
            System.out.println("¿Qué quieres listar?");
            opcionChild = teclado.nextInt();
            if (opcionChild>=0 && opcionChild< ficherosChild.length){
                if (ficherosChild[opcionChild].isDirectory()){
                    listarChild(ficherosChild[opcionChild]);

                }else{
                    System.out.println("ERROR");
                }
            }else{
                System.out.println("ERROR");
            }
        }
}
