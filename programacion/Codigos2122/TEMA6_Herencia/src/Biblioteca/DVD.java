package Biblioteca;

import java.util.ArrayList;

public class DVD extends Elemento{
    private String director;
    private ArrayList<String> actores;
    private int anioEdicion;
    private TipoDVD tipoDVDElemento;

    public DVD() {
    }

    public DVD(int id, String seccion, String titulo, boolean estado, String director, ArrayList<String> actores, int anioEdicion, TipoDVD tipoDVDElemento) {
        super(id, seccion, titulo, estado);
        this.director = director;
        this.actores = actores;
        this.anioEdicion = anioEdicion;
        this.tipoDVDElemento = tipoDVDElemento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: "+ director);
        System.out.println("Actores: "+ actores);
        System.out.println("Año Edicion: "+ anioEdicion);
        System.out.println("Tipo: "+ tipoDVDElemento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }


    public TipoDVD getTipoElemento() {
        return tipoDVDElemento;
    }

    public void setTipoElemento(TipoDVD tipoDVDElemento) {
        this.tipoDVDElemento = tipoDVDElemento;
    }
}
