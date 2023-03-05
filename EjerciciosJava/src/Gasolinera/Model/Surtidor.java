package Gasolinera.Model;

public class Surtidor {

    private int capacidadT;
    private int capacidadA;
    private String tipo;
    private boolean funcionando;

    //constructores
    public Surtidor(int capacidadTotal, String tipo) {
        this.capacidadT = capacidadTotal;
        this.capacidadA = capacidadTotal;
        this.tipo = tipo;
        this.funcionando = true;
    }

    public Surtidor(String tipo) {
        this.tipo = tipo;
    }

    //metodos
    public void arreglar() {
        setFuncionando(true);
    }

    public void rellenar(int cantidad) {
        capacidadA += cantidad;
        capacidadT += cantidad;
    }

    public void quitarGasolina(int cantidad) {
        capacidadT -= cantidad;
    }

    //getter setter
    public int getCapacidadTotal() {
        return capacidadT;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadT= capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadA;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadA = capacidadActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}
