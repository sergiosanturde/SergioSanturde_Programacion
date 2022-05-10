package TrabajadoresHerencia;

public class Autonomos extends Trabajador{
    //varibles
    private int sueldo;


    //constructores
    public Autonomos() {}

    public Autonomos(String nombre, String dni, String apellido, int sueldo) {
        super(nombre, dni, apellido);
        this.sueldo = sueldo;
    }

    //metodos
    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("    salario anual: " + sueldo *12);
    }

    //getter y setter
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}

