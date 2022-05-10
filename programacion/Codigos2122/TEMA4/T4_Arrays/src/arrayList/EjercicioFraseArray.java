package arrayList;

import java.util.Scanner;

public class EjercicioFraseArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase = "Esto es una frase para poder trabajar con el ejercicio numero 8";
        String palabraCuatro = "aaaa";
        String palabraLarga = "";
        String palabraCorta = "aaaaaaaaaaaaaaa";

        String[] fraseLeida = frase.split(" ");

        for ( String item : fraseLeida  ) {


            if (item.length() > palabraLarga.length()){
                palabraLarga = item;
            }
            if (item.length() < palabraCorta.length()){
                palabraCorta = item;
            }
            if (item.length() == 4){
                System.out.println(item);
            }
        }
        System.out.println("La palabra mas grande es: " + palabraLarga);
        System.out.println("La palabra mas pequenia es: " + palabraCorta);

    }
}
