package multimedia;

public class Libro extends Elemento{

    private int iSBN,nPaginas;

    public Libro(String id, String titulo, String autor, String tamanio, String formato, int iSBN, int nPaginas) {
        super(id, titulo, autor, tamanio, formato);
        this.iSBN = iSBN;
        this.nPaginas = nPaginas;
    }

    public void metodoLibro(){

    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Páginas: " + nPaginas);
        System.out.println("ISBN: " + iSBN);
    }


    public int getiSBN() {
        return iSBN;
    }

    public void setiSBN(int iSBN) {
        this.iSBN = iSBN;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}
