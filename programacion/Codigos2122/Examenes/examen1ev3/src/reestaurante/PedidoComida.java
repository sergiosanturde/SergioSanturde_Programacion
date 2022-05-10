package reestaurante;

import java.util.ArrayList;

public final class PedidoComida {

    private double precio;
    private int nConsumiciones;
    private ArrayList<Restaurante> restaurantes;
    private TipoComida comida;


    public PedidoComida(double precio, int nConsumiciones) {
        this.precio = precio;
        this.nConsumiciones = nConsumiciones;
        this.restaurantes = new ArrayList<>();
    }

    //
    public void calcularPrecioReal(){
        int precioComida = (int) (nConsumiciones * precio);
        System.out.println("");
        int IvaComida = (int) (precioComida + (precioComida * Constantes.IVA_BEBIDASRESTAURANTE));
    }

    public void verFactura(){
        System.out.println("Precio: "+precio);
        System.out.println("Tipo de comida: "+comida);
        System.out.println("CIF: " + Constantes.CIF);
    }


    //
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getnConsumiciones() {
        return nConsumiciones;
    }

    public void setnConsumiciones(int nConsumiciones) {
        this.nConsumiciones = nConsumiciones;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public TipoComida getComida() {
        return comida;
    }

    public void setComida(TipoComida comida) {
        this.comida = comida;
    }
}
