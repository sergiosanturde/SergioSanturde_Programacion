package HashTable;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Listas {

    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        //para sacar el tamaño de la lista
        listaElementos.size();

        //guardar cosas en un hashtable
        listaElementos.put("1","elemento 1");
        listaElementos.put("2","elemento 2");
        listaElementos.put("3", false);
        listaElementos.put("4", new String[]{"Cosa 1","Cosa 2","Cosa 3"});

        /*System.out.println(listaElementos.size());

        //Obtener elementos del hashtable

        String[] elementoEncontrado = (String[]) listaElementos.get("4");
        elementoEncontrado[0] = "Nuevo valor";

        //Borrar un elemento

        listaElementos.remove("1");
        System.out.println(listaElementos.get("1"));*/

        System.out.println("Listado elemento");
        Enumeration<Object> listaClaves = listaElementos.keys();
        while (listaClaves.hasMoreElements()){
            // hay elemento siguiente
            Object clave = listaClaves.nextElement();
            Object elemento = listaElementos.get(clave);
            System.out.println(elemento);
        }
    }
}

