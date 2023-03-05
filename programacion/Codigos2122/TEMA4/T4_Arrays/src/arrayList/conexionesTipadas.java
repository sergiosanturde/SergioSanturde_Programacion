package arrayList;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class conexionesTipadas {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList();
        ArrayList<String> listaPalabras = new ArrayList();

        listaNumeros.add(123);
        listaNumeros.get(0);
        listaNumeros.remove(1);

        listaPalabras.add("asd");
        listaPalabras.get(0);
        listaPalabras.remove(6);
        for ( String item : listaPalabras ) {

        }



    }
}
