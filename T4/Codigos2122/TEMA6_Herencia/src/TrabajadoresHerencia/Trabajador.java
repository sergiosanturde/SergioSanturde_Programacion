package TrabajadoresHerencia;

public abstract class Trabajador {

    protected String nombre,apellido,dni;

    public Trabajador(){

    }
    public Trabajador(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }


}
