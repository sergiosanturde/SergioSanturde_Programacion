package TrabajadoresHerencia;

public class Jefes extends Trabajador{

    private int acciones,beneficio;

    public Jefes() {}

    public Jefes(String nombre, String apellido, String dni, int acciones, int beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    


    //
    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
}
