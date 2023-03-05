package EjerClase;

public enum Departamento {

    Ventas("Ventas",10),Finanzas("Finanzas",15), IT("IT",3), Comercial("Comercial",20);

    String nombre;
    int nTrabajadores;

    Departamento(String nombre, int nTrabajadores) {
        this.nombre = nombre;
        this.nTrabajadores = nTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnTrabajadores() {
        return nTrabajadores;
    }

    public void setnTrabajadores(int nTrabajadores) {
        this.nTrabajadores = nTrabajadores;
    }
}
