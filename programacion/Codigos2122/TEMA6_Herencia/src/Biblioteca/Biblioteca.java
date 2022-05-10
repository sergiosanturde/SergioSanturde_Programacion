package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Persona> listaPersonas;
    ArrayList<Elemento> listaElementos;

    //

    public Biblioteca() {
        this.listaPersonas = new ArrayList();
        this.listaElementos = new ArrayList();
    }

    public void registrarPersona(Persona persona){

    }
    public void registrarElemeto(Elemento elemento){
        listaElementos.add(elemento);
    }
    public void realizarPrestamo(Socio socio,Prestar elementoPrestado){
        if ((Elemento)elementoPrestado.
    }
}
