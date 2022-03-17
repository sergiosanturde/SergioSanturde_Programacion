package EjercicioClaseCoche;

public class Entrada {
    public static void main(String[] args) {
        Coche coche = new Coche(15000,200,"Seat","Ibiza");

        Coche.Motor motor = coche.new Motor(170,200);

        coche.mostrarDatos();
    }
}
