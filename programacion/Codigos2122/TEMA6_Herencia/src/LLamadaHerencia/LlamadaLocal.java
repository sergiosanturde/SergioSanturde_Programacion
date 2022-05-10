package LLamadaHerencia;

public class LlamadaLocal extends Llamada{

    public LlamadaLocal() {
    }

    public LlamadaLocal(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        this.coste = 0;
    }


}
