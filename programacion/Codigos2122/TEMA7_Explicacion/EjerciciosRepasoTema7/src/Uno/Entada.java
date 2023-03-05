package Uno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entada{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int aciertos = 0;
        int nUsuario = 0;
        int nOculto = (int)(Math.random()*11);
        System.out.println(nOculto);

        do {
            System.out.println("Adivina el numero oculto");
            teclado.nextInt();

            try {
                teclado = new Scanner(System.in);
                nUsuario = teclado.nextInt();
              if (nUsuario < 0){
                   throw new ExcepcionNum("Numero inferior a 0");
              }

            }catch (InputMismatchException | ExcepcionNum e){
                System.out.println(e.getMessage());

            }finally {
                aciertos++;
            }
        }while (nOculto != nUsuario);
        System.out.println("Acertaste"+aciertos);
    }
}
