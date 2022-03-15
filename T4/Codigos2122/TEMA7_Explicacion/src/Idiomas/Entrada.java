package Idiomas;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        ArrayList<Idioma> idiomas = new ArrayList<>();

        Idioma castellano = new Idioma() {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + this.getNombre() + "es: " + this.getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + this.getNombre() + "es: " + this.getPalabras().get(1));
            }
        };
        Idioma ingles = new Idioma() {
            @Override
            public void saludar() {
                System.out.println("El saludo es " + this.getNombre() + "es: " + this.getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + this.getNombre() + "es: " + this.getPalabras().get(1));
            }
        };
        Idioma alemán = new Idioma() {
            @Override
            public void saludar() {
                System.out.println("El saludo es " + this.getNombre() + "es: " + this.getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + this.getNombre() + "es: " + this.getPalabras().get(1));
            }
        };

        castellano.ingresarPalabra("Hola");
        castellano.ingresarPalabra("Adios");
        castellano.ingresarPalabra("Si");

        ingles.ingresarPalabra("Hellou");
        ingles.ingresarPalabra("Goodbye");
        ingles.ingresarPalabra("Yes");

        alemán.ingresarPalabra("Hallo");
        alemán.ingresarPalabra("Tschüss");
        alemán.ingresarPalabra("Jawohl");


        idiomas.add(castellano);
        idiomas.add(ingles);
        idiomas.add(alemán);

        
    }
}
