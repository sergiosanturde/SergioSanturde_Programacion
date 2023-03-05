package Gasolinera.Model;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;
    private ArrayList<Surtidor> listaSurtidores;
    private int ganancias;

    public Gasolinera(String nombre) {
        listaSurtidores = new ArrayList<>();
        this.nombre = nombre;
    }
    public void agregarSurtidor(Surtidor surtidor) {
        listaSurtidores.add(surtidor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getListaSurtidores() {
        return listaSurtidores;
    }

    public void setListaSurtidores(ArrayList<Surtidor> listaSurtidores) {
        this.listaSurtidores = listaSurtidores;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
