package InterfazInicial;

public class Elemento {

    protected int tamaño;
    protected String titulo, autor, id, formato;

    public Elemento() {}
    public Elemento(int tamaño, String titulo, String autor, String id, String formato) {
        this.tamaño = tamaño;
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.formato = formato;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}


