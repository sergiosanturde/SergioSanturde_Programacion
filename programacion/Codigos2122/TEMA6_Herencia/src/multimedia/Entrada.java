package multimedia;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        //Elemento elemento = new Elemento("1","as","asd","asd","as"){};

        ArrayList<Elemento> listaElementos = new ArrayList<>();
        Libro libro = new Libro("11","Libro Titulo","Autor Libro",
                "100","digital",124354,100);
        Video video = new Video("11","Libro Titulo","Autor Libro",
                "100","digital","Actores","Diresctor");
        Audio audio = new Audio("11","Libro Titulo","Autor Libro",
                "100","digital",180,"blueray");

        Elemento libroElemento = new Libro("11","Libro Titulo","Autor Libro",
                "100","digital",124354,100);

        //libroElemento.mostrarDatos();

        listaElementos.add(libro);
        listaElementos.add(video);
        listaElementos.add(audio);
        listaElementos.add(libroElemento);

        for ( Elemento elemento : listaElementos ) {
            if (elemento instanceof Libro){
                ((Libro) elemento).metodoLibro();
            }else if (elemento instanceof Audio)
            {

            }
        }



    }
}
