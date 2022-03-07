package EjerClase;

public final class Jefe extends Trabajador implements Comision{

    private int nTrabajadores;

    public Jefe() {}

    public Jefe(String nombre, String apellido, String dni, int sueldo, String departamento, int nTrabajadores) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.nTrabajadores = nTrabajadores;
    }

    @Override
    public void calcularSueldo() {

    }

    @Override
    public void votar(int nVoto) {
        nVoto = (int)(nVoto * 0.3);
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
