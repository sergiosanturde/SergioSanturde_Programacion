package LLamadaHerencia;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<Llamada> listaLlamada;
    private int costeAcumulado =0;


    public Centralita(ArrayList<Llamada> listaLlamada) {
        this.listaLlamada = listaLlamada;
    }
    //metodos
    private void registrarLlamadas(Llamada llamada){
        listaLlamada.add(llamada);
        System.out.println("Llamada registrada correctamente");
        llamada.mostrarDatos();
    }
    public void calcularCostes(){
        for ( Llamada item : listaLlamada ) {
            costeAcumulado += item.getCoste();
        }

        System.out.println("El coste de todas las llamadas realizadas es: "+costeAcumulado);
    }
    private void mostrarCoste() {
        int costesTotales=0;
        for (int i = 0; i < listaLlamada.size(); i++) {
            costesTotales+=listaLlamada.get(i).getCoste();
        }
        System.out.println("Costes totales: "+ costesTotales);
    }
    private void mostrarLlamadas(String llamada){
        for (Llamada itemLlamada: listaLlamada) {
            if (llamada.getClass().equals(llamada)){
                itemLlamada.mostrarDatos();
            }
        }
    }

    //


    public ArrayList<Llamada> getListaLlamada() {
        return listaLlamada;
    }

    public void setListaLlamada(ArrayList<Llamada> listaLlamada) {
        this.listaLlamada = listaLlamada;
    }
}

