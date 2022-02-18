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
                this.coste= (int) (this.duracion*0.20);
                break;
            case 2:
                this.coste =  (int) (this.duracion*0.25);
                break;
            case 3:
                this.coste= (int) (this.duracion*0.30);
                break;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(franja);
    }
}
