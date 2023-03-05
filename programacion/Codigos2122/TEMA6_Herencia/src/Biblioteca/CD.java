package Biblioteca;

public class CD extends Elemento implements Prestar{
    private int anioEdicion;
    private TipoCD tipoElemento;

    public CD() {
    }

    public CD(int id, String seccion, String titulo, boolean estado, int anioEdicion, TipoCD tipoElemento) {
        super(id, seccion, titulo, estado);
        this.anioEdicion = anioEdicion;
        this.tipoElemento = tipoElemento;
    }

    public CD(int id, String seccion, String titulo, int anioEdicion, TipoCD tipoElemento, boolean estado) {
        super(id, seccion, titulo,estado);
        this.anioEdicion = anioEdicion;
        this.tipoElemento = tipoElemento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año Edicion: "+ anioEdicion);
        System.out.println("Tipo: "+ tipoElemento);
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public TipoCD getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(TipoCD tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

}
