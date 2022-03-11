package EjerClase;

public final class Directivo extends Persona implements Comision{

    private int capital;

    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni, int capital) {
        super(nombre, apellido, dni);
        this.capital = capital;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital: "+capital);
    }

    @Override
    public double votar(int nVoto) {
        return 0;
    }

    @Override
    public void repartirBeneficios() {

    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
}
