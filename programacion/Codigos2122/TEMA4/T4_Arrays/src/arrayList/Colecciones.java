package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Colecciones {
    public static void main(String[] args) {

        //Lista de cualquier tipo > OBJECT
        ArrayList listaCosas = new ArrayList();

        //para poder saber su tamaño
        int tamanio = listaCosas.size();
        System.out.println(tamanio);

        // añada un elemento a la lista
        listaCosas.add("Sergio");
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        //System.out.println(listaCosas);

        //int numero = (int)listaCosas.get(0);
        //System.out.println("El valor es " +numero);
        listaCosas.add(true);
        listaCosas.add(6);
        listaCosas.add(0.9);
        listaCosas.add(6);
        listaCosas.add("Hola");
        listaCosas.add(6);
        listaCosas.add(6);
        listaCosas.add("true");
        listaCosas.add(6);
        listaCosas.add(34567);
        listaCosas.add(6);

        /* //sacar de golpe toos los elementos del array
        int posiciones= 1;
        for ( Object item : listaCosas ) {
            System.out.println(posiciones + "-" +item);
            posiciones++;
        }

        //bucar dentro de una lista la palabra "Sergio"
        //cuando la encuentre sacar mensaje
        //Palabra encontrada y la posicion de la misma
        posiciones = 0;
        for ( Object item :  listaCosas ) {
            if (item.equals("Sergio")){
                System.out.println("Palabra encontrada en la posicion " + posiciones);
            }
            posiciones++;
        }

        //Pidais por consola una palabra a buscar
        //en el caso que la palabra se encuentre en la lista
            //se modifique su valor por otro pedido por consola
        //en el caso de que la palabra no se encuentre en la lista
        //se agregara al final


        Scanner teclado = new Scanner(System.in);

        String palabraUser;

        System.out.println("Introduce la palabra a buscar");
        palabraUser = teclado.next();

        int posicionEncontrada = listaCosas.indexOf(palabraUser);

        if (posicionEncontrada > -1){
            System.out.println("Palabra a sustituir");
            String palabraSustituir = teclado.next();
            listaCosas.add(posicionEncontrada,palabraSustituir);

        }else{
            listaCosas.add(palabraUser);
        }
        System.out.println(listaCosas);


        */

        for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i).equals(6)){
                listaCosas.remove(i);
            }
        }
        listaCosas.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals(6);
            }
        });



        System.out.println(listaCosas);
    }
}