package InterfazInicial;

public final class Imagen extends Elemento implements Ejecutable{

    private int ISBN;

    public Imagen() {}

    public Imagen(int id, String titulo, String autor, String tamaño, String formato, int ISBN) {
        super(id, titulo, autor, tamaño, formato);
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }
}
