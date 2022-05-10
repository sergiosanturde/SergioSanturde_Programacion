package TrabajadoresHerencia;

public class Asalariados extends Trabajador{

    private int sueldo,numerodepagas;
    private boolean contratado;

    public Asalariados(String nombre, String dni, String apellido, int sueldo, int numPagas){}

    public Asalariados(String nombre, String apellido, String dni, int sueldo, int numerodepagas, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numerodepagas = numerodepagas;
        this.contratado = contratado;
    }
    //metodos

    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.print("Sueldo: " + sueldo + "Numero de pagas: " + numerodepagas + "Contratado: " + contratado);

    }
    //getter y setter

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumerodepagas() {
        return numerodepagas;
    }

    public void setNumerodepagas(int numerodepagas) {
        this.numerodepagas = numerodepagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
