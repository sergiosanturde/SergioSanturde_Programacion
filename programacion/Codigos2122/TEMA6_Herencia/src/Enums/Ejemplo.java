package Enums;

public class Ejemplo {

    Equipo equipo1 = Equipo.Getafe;
    Equipo equipo2 = Equipo.Madrid;
    Equipo equipo3 = Equipo.Atletico;
    Equipo equipo4 = Equipo.Barcelona;
    Equipo equipo5 = Equipo.Sevilla;

    public void mostrarConjunto(){

    }

    public void mostrarDatos(){
        System.out.println(equipo1.name());
        System.out.println(equipo2.name());
        System.out.println(equipo3.name());
        System.out.println(equipo4.name());
        System.out.println(equipo5.name());
    }

}
