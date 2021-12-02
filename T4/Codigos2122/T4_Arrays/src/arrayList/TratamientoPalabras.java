package arrayList;

import java.util.Locale;

public class TratamientoPalabras {

    public static void main(String[] args) {

        /*String palabraTratar = "Ejemplo de palabra";
        System.out.println(palabraTratar.toLowerCase());

        System.out.println(palabraTratar.toUpperCase());
        String palabraComparar = "Esto es un ejemplo";
        if (palabraTratar.equals(palabraComparar)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }

         */
        String fraseCompleta = "Esto es una frase completa de un conjunto de palabras";
        /*
        System.out.println(fraseCompleta.length());

        //Saber cuantas palabras tengo
        String[] palabras = fraseCompleta.split("");
        System.out.println("El numero de palabras es: " + palabras.length);


        //Saber cuantas letras tengo
        int letrasTotales = 0;
        for ( String item : palabras ) {
            letrasTotales += item.length();
        }
        System.out.println("El numero total de letras es: " + letrasTotales);

        fraseCompleta.replaceAll(" ","")
                .replaceAll(",","")
                .replaceAll(".","");

        //System.out.println(fraseCompleta);

        System.out.println(fraseCompleta.replaceAll(" ","").length());

        // Quitar espacios
        for (int i = 0; i < fraseCompleta.length(); i++) {
            if (fraseCompleta.charAt(i) != ' ')
            System.out.println(fraseCompleta.charAt(i));

        }
        //Buscar letra
        System.out.println(fraseCompleta.indexOf("w"));

        fraseCompleta.substring(10,20);
        */
        //EJERCICIO CORREO
        String correo = "borja.martin@cesjuanpablosegundo.es";
        correo.indexOf("@");
        String nombre = correo.substring(0,correo.indexOf("@"));
        System.out.println(nombre);
        String dominio = correo.substring(correo.indexOf("@")+1,correo.length());
        System.out.println(dominio);


    }
}
