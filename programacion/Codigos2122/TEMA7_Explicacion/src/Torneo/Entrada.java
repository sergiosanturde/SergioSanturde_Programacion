package Torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Entrada {

    public static void main(String[] args) {
        Torneo.Equipo madrid = new Torneo.Equipo("Madrid",89,60);
        Torneo.Equipo barcelona = new Torneo.Equipo("Barcelona",85,60);
        Torneo.Equipo atleti = new Torneo.Equipo("Atletico",70,50);
        Torneo.Equipo sevilla = new Torneo.Equipo("Sevilla",79,40);
        ArrayList<Torneo.Equipo> lista = new ArrayList<>();
        lista.add(madrid);
        lista.add(barcelona);
        lista.add(atleti);
        lista.add(sevilla);

        Collections.sort(lista, new Comparator<Torneo.Equipo>() {
            @Override
            public int compare(Torneo.Equipo o1, Torneo.Equipo o2) {
                if (o1.getNivelAtaque()>o2.getNivelAtaque()){
                    return -1;
                }
                return 0;
            }
        });

        for ( Torneo.Equipo equipo : lista ) {
            System.out.println(equipo.getNombre() +" "+equipo.getNivelAtaque());
        }


        /*Torneo champion = new Torneo("Champion");
        champion.realizarSorteo(lista);
        champion.mostrarPartidos();*/





    }
}