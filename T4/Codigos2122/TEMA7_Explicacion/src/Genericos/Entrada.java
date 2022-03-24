package Genericos;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Coleccion<Discos,Double,Boolean> coleccionDiscos = new Coleccion();
        coleccionDiscos.agregarCosas(new Discos());


        Coleccion<Partido,> coleccionPartido = new Coleccion();
        coleccionPartido.agregarCosas(new Partido());


        Coleccion<Camiseta> coleccionCamisetas = new Coleccion();
        coleccionCamisetas.agregarCosas(new Camiseta());


        Coleccion<Coches> coleccionCoches = new Coleccion();
        coleccionCoches.agregarCosas(new Coches());

        Coleccion<Coleccionable> coleccionColeccionables = new Coleccion();
        coleccionColeccionables.agregarCosas(new Discos());
        coleccionColeccionables.agregarCosas(new Camiseta());

    }
}
