package Examen;

import java.util.ArrayList;

public class Pizza {

    private String nombre;
    private double precio;
    private int id;
    private boolean estado, servida;
    private ArrayList<Ingrediente> listaIngredientes;

    //CONSTRUCTOR
    public Pizza(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaIngredientes = new ArrayList();
    }

    public Pizza() {
        this.listaIngredientes = new ArrayList();
    }

    //METODO
    public void agregarIngrediente(Ingrediente ingrediente){
        this.listaIngredientes.add(ingrediente);
        this.precio += ingrediente.getPrecio();
    }
    public void verDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio " + precio);
        System.out.println("Número de ingredientes: " + listaIngredientes.size());
            for (Ingrediente ingrediente : listaIngredientes) {
            System.out.println(ingrediente.getNombre());
            }
    }
    //GETTER y SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isServida() {
        return servida;
    }

    public void setServida(boolean servida) {
        this.servida = servida;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}


