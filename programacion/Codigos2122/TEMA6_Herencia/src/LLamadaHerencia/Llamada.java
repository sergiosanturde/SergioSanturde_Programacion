package LLamadaHerencia;

public abstract class Llamada {

    int nOrigen,nDestino,coste;
    double duracion;

    public Llamada (){}

    public Llamada(int nOrigen, int nDestino,int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        calcularCoste();
    }
    public abstract void calcularCoste();

    public void mostrarDatos(){
        System.out.println(nOrigen);
        System.out.println(nDestino);
        System.out.println(coste);
        System.out.println(duracion);
    }


    //g y s

    public int getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public void setnDestino(int nDestino) {
        this.nDestino = nDestino;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}
