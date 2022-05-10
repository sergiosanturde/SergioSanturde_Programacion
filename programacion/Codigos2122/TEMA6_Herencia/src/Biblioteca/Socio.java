package Biblioteca;

import java.util.ArrayList;

public class Socio extends Persona{
    private int nSocio;
    ArrayList prestamos;

    public Socio() {}

    public Socio(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.nSocio++;
        this.prestamos = new ArrayList();
    }
    //metodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
    //g y s

    public int getnSocio() {
        return nSocio;
    }

    public void setnSocio(int nSocio) {
        this.nSocio = nSocio;
    }

    public ArrayList getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList prestamos) {
        this.prestamos = prestamos;
    }
}
