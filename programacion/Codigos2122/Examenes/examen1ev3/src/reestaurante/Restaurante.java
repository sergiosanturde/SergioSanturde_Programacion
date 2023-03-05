package reestaurante;

import java.util.ArrayList;

public class Restaurante<T> {

    private String nombre;
    private int nComensalesTotales;
    private ArrayList<T> listaPedidos;
    private int caja;

    public Restaurante() {
    }

    public Restaurante(String nombre, int nComensalesTotales, int caja) {
        this.nombre = nombre;
        this.nComensalesTotales = nComensalesTotales;
        this.caja = caja;
        this.listaPedidos = new ArrayList<>();
    }
    //
    public void colocarComensales(int nComensales){
        nComensales= nComensales + nComensalesTotales;
        if (nComensalesTotales > 50){
            try {
                throw new ExcepcionPersonalizada("Error en numero de comensales");
            }catch (ExcepcionPersonalizada e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void registrarPedido(T pedidoComida){
        listaPedidos.add(pedidoComida);
    }
    public void verPedidos(){

    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de comensales: " + nComensalesTotales);
        System.out.println("Caja: " + caja);
    }

    //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnComensalesTotales() {
        return nComensalesTotales;
    }

    public void setnComensalesTotales(int nComensalesTotales) {
        this.nComensalesTotales = nComensalesTotales;
    }

    public ArrayList<T> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<T> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }
}
