package EjerClase;

public abstract class Trabajador extends Persona{

    protected double sueldo;
    protected Departamento departamento;

    public Trabajador() {}

    public Trabajador(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Departamento: " + departamento);
    }

    public abstract void calcularSueldo();

    //g y s

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
