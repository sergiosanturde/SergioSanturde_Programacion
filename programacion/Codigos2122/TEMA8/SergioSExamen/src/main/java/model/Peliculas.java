package model;

public class Peliculas {
    private String titulo,descripcion,poster;

    private int fecha;

    public Peliculas(String titulo, String fechaLanzamiento, String descripcion, String poster) {
    }

    public Peliculas(String titulo, String descripcion, String poster, int fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.poster = poster;
        this.fecha = fecha;


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", poster='" + poster + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
