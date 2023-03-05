package Inventario;

public final class Mesa extends Mueble{
    int capacidad;

    public Mesa(String material, int peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
