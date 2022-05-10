package EjerciciosObjetos.EjerAsignaturas;

import java.sql.SQLOutput;

public class Entrada {
    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno1 = new Alumno(asignatura1,asignatura2,asignatura3);

        Profesor profesor1 = new Profesor();

        profesor1.ponerNotas(alumno1);

        System.out.println("Asignatura: " + alumno1.getAsignatura1().getCalificacion());
        System.out.println("Asignatura: " + alumno1.getAsignatura2().getCalificacion());
        System.out.println("Asignatura: " + alumno1.getAsignatura3().getCalificacion());
        System.out.println("Media alumno: "+ profesor1.calcularMedia(alumno1));


    }
}
