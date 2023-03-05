package Gasolinera;

import Gasolinera.Model.Coche;
import Gasolinera.Model.Gasolinera;
import Gasolinera.Model.Surtidor;

public class Main {
    public static void main(String[] args) {
        Gasolinera gasolinera = new Gasolinera("Cepsa");
        Surtidor surtidor1 = new Surtidor("G51");
        Surtidor surtidor2 = new Surtidor(213, "G12");
        Surtidor surtidor3 = new Surtidor(524, "G62");

        Coche coche = new Coche("Gasolina 98");

        coche.ponerGasolina(surtidor2, 40);
        System.out.println(surtidor2.getCapacidadTotal());
        System.out.println(coche.getLitrosDeposito());

    }
}
