package Enums;

public abstract class Jugador extends Persona implements Seleccionable{

    private String posicion;

    public Jugador(String nombre, String apellido, double sueldo, String posicion) {

        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posicion);
    }

    public void metodoJugador(){

    }

    @Override
    public void calcularSueldo() {
        // sueldo neto =  sueldo bruto - retencione (IRPF 0.20)
        this.sueldo = this.sueldo - (this.sueldo * Constantes.IRPF);
    }

    @Override
    public void repartirPrima() {
        this.sueldo = this.sueldo * 1.20;
        System.out.println("Repartida prima a Jugador de: " );
    }

}