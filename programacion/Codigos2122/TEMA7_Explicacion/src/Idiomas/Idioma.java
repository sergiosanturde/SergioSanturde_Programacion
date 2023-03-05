package Idiomas;

import java.util.ArrayList;

public abstract class Idioma {

    private String nombre;
    private int nHablantes;
    private ArrayList palabras;

    public Idioma() {}

    public Idioma(String nombre, int nHablantes) {
        this.nombre = nombre;
        this.nHablantes = nHablantes;
    }
    //metodos
    public abstract void saludar();
    public abstract void despedir();
    public void ingresarPalabra(String palabra){
        palabras.add(palabra);
    }
    public void listarPalabras(){
        System.out.println("Las palabras en " + nombre + "son: ");
        for (Object item : palabras  ) {
            palabras.size();
        }
    }
    //gys

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnHablantes() {
        return nHablantes;
    }

    public void setnHablantes(int nHablantes) {
        this.nHablantes = nHablantes;
    }

    public ArrayList getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList palabras) {
        this.palabras = palabras;
    }
}
