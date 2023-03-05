package Biblioteca;

public class Revista extends Elemento implements Prestar{
    private int ISBN;

    public Revista() {
    }

    public Revista(int id, String seccion, String titulo, boolean estado, int ISBN) {
        super(id, seccion, titulo, estado);
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: "+ ISBN);
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
