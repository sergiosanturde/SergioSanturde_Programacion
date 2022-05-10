package Examen;

import java.util.ArrayList;

public class Pizzeria {
    private ArrayList<Pizza> listaPizza;
    private double caja;

    //CONSTRUCTOR
    public Pizzeria(double caja){
        this.caja = caja;
        this.listaPizza = new ArrayList();
    }
    public Pizzeria(){
        this.listaPizza = new ArrayList();
    }

    //METODOS
    public void agregarPedido(Pizza pizza){
        this.listaPizza.add(pizza);
    }

    public void verEstadoPedido(int estado){
        for ( Pizza estadoPedido : listaPizza ) {
            estadoPedido.isEstado();
        }
    }

    public void servirPedido(int servir){
        for ( Pizza servirPedido : listaPizza ) {
            servirPedido.isServida();
        }
    }
    public  void mostrarPedidosPendientes(){
        for ( Pizza mostrarPedido : listaPizza ) {
            mostrarPedido.verDatos();
        }
    }
    //GETTER Y SETTER


    public ArrayList<Pizza> getListaPizza() {
        return listaPizza;
    }

    public void setListaPizza(ArrayList<Pizza> listaPizza) {
        this.listaPizza = listaPizza;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
