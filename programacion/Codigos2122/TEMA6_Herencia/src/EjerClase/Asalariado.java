package EjerClase;

public final class Asalariado extends Trabajador implements  Administracion{

    private int pagas;

    public Asalariado() {}

    public Asalariado(String nombre, String apellido, String dni, int sueldo, Departamento departamento, int pagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.pagas = pagas;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Administracion.IRPF);
    };

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pagas: " + pagas);
    }
    //g y s

    public int getPagas() {
        return pagas;
    }

    public void setPagas(int pagas) {
        this.pagas = pagas;
    }
}
