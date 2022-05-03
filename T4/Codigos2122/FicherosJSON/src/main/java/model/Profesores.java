package model;

public class Profesores {

    private String nombre;
    private String Apellido;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido) {
        this.nombre = nombre;
        this.Apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
