package EjerClase;

public final class Autonomo extends Trabajador{

    private int cuota,factora;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String dni, int sueldo, String departamento, int cuota, int factora) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.cuota = cuota;
        this.factora = factora;
    }

    @Override
    public void calcularSueldo() {

    }

    //g y s

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getFactora() {
        return factora;
    }

    public void setFactora(int factora) {
        this.factora = factora;
    }
}
