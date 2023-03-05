package Gasolinera.Model;

public class Coche {

    private String tipoGasolina;
    private int litrosDeposito;



    public Coche() {
    }

    public Coche(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public void ponerGasolina(Surtidor surtidor, int cantidadLitros) {
        if (surtidor.getCapacidadTotal() == 0 || surtidor.getCapacidadTotal() < cantidadLitros) {
            System.out.println("El surtidor esta vacio o no hay suficiente gasolina");
        } else if (!surtidor.isFuncionando()) {
            System.out.println("El surtidor esta roto");
        } else if (!surtidor.getTipo().equalsIgnoreCase(getTipoGasolina())) {
            System.out.println("El tipo de gasolina no coincide");
        } else {
            surtidor.quitarGasolina(cantidadLitros);
            setLitrosDeposito(cantidadLitros);
        }
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public int getLitrosDeposito() {
        return litrosDeposito;
    }

    public void setLitrosDeposito(int litrosDeposito) {
        this.litrosDeposito = litrosDeposito;
    }
}
