package EjerClase;

public final class Asalariado extends Trabajador{

    private int pagas;

    public Asalariado() {}

    public Asalariado(String nombre, String apellido, String dni, int sueldo, String departamento, int pagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.pagas = pagas;
    }

    @Override
    public void calcularSueldo() {

    }

    //g y s

    public int getPagas() {
        return pagas;
    }

    public void setPagas(int pagas) {
        this.pagas = pagas;
    }
}
