package LLamadaHerencia;

import java.util.ArrayList;

public class Centralita {

    ArrayList<Llamada> listaLlamada;

    public Centralita(ArrayList<Llamada> listaLlamada) {
        this.listaLlamada = listaLlamada;
    }
    //metodos
    public void registrarLlamadas(Llamada llamada){
        listaLlamada.add(llamada);
        System.out.println("Llamada registrada correctamente");
        llamada.mostrarDatos();
    }
    public void mostrarCoste() {
        int costesTotales=0;
        for (int i = 0; i < listaLlamada.size(); i++) {
            costesTotales+=listaLlamada.get(i).getCoste();
        }
        System.out.println("Costes totales: "+ costesTotales);
    }
    public void mostrarLlamadas(String llamada){
        for (Llamada itemLlamada: listaLlamada) {
            if (itemLlamada.getClass().getSimpleName().equals(llamada.toLowerCase())){
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

