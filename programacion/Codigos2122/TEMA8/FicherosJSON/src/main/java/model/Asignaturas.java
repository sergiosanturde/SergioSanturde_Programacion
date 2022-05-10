package model;

import java.util.Arrays;

public class Asignaturas {

    private String nombre;
    private Profesores profesor;
    private int hora;
    private String ciclo;
    private int curso;
    private String[] conocimiento;


    public Asignaturas() {
    }

    public Asignaturas(String nombre, Profesores profesor, int hora, String ciclo, int curso, String[] conocimiento) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.hora = hora;
        this.ciclo = ciclo;
        this.curso = curso;
        this.conocimiento = conocimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String[] getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String[] conocimiento) {
        this.conocimiento = conocimiento;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "nombre='" + nombre + '\'' +
                ", profesor='" + profesor.getNombre() + "Apellido" + profesor.getApellido() +
                ", hora=" + hora +
                ", ciclo='" + ciclo + '\'' +
                ", curso=" + curso +
                ", conocimiento=" + Arrays.toString(conocimiento) +
                '}';
    }
}
