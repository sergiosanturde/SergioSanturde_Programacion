package EjerciciosObjetos.EjerAsignaturas;

public class Asignatura {
    private int identidicador;
    private double calificacion;

    public Asignatura(int identidicador){
        this.identidicador = identidicador;
    }

    public int getIdentidicador() {
        return identidicador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
