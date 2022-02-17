package LLamadaHerencia;

public class LlamadaNacional extends Llamada{

    int franja;

    public LlamadaNacional() {
    }

    public LlamadaNacional(int nOrigen, int nDestino, int duracion,int franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
    }
    //

    @Override
    public void calcularCoste() {
        switch (franja){
            case 1:
                coste=20;
                break;
            case 2:
                coste = 25;
                break;
            case 3:
                coste=30;
                break;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(franja);
    }
}
