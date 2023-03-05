package Excepciones;

import java.io.IOException;

public class Entrada {
    public static void main(String[] args){
        String palabra="Hola";
        String[] palabras = new String[]{"Uno","Dos","Tres","Cuatro"};

        try {
            System.out.println(palabra.length());
            System.out.println(palabras[5]);
        }catch (NullPointerException e){
            System.out.println("La palabra es nula");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Error de acceso de array");
        }finally {
            System.out.println("Ejecucion obligatoria");
        }
        System.out.println("Bloque final");

        Coche coche = new Coche();
        coche.metodo2(false);

    }
}
