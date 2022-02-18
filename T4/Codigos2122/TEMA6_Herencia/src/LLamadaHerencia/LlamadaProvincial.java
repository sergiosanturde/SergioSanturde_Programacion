package LLamadaHerencia;

public class LlamadaProvincial extends Llamada{

    public LlamadaProvincial() {
    }

    public LlamadaProvincial(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        this.coste = (int) (this.duracion * 0.15);
        coste+=duracion;
    }

}
