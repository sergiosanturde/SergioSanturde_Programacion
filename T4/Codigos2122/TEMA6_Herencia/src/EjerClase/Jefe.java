package EjerClase;

public final class Jefe extends Trabajador implements Comision{

    private int nTrabajadores;

    public Jefe() {}

    public Jefe(String nombre, String apellido, String dni, int sueldo, Departamento departamento, int nTrabajadores) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.nTrabajadores = nTrabajadores;
    }

    @Override
    public void calcularSueldo() {

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nú  mero Trabajadores: " + nTrabajadores);
    }

    @Override
    public double votar(int nVoto) {
        nVoto = (int) Math.random();
        return nVoto;
    }

    @Override
    public void repartirBeneficios() {

    }

    //g y s
    public int getnTrabajadores() {
        return nTrabajadores;
    }

    public void setnTrabajadores(int nTrabajadores) {
        this.nTrabajadores = nTrabajadores;
    }

}
