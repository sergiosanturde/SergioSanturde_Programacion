package EjerClase;

public abstract class Trabajador extends Persona{

    private int sueldo;
    private String departamento;

    public Trabajador() {}

    public Trabajador(String nombre, String apellido, String dni, int sueldo, String departamento) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public abstract void calcularSueldo();

    //g y s

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
