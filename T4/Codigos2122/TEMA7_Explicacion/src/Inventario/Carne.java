package Inventario;

public final class Carne extends Alimento{

    int proteinas;

    public Carne(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.proteinas = volumen;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(proteinas);
    }

    public int getVolumen() {
        return proteinas;
    }

    public void setVolumen(int volumen) {
        this.proteinas = volumen;
    }
}
