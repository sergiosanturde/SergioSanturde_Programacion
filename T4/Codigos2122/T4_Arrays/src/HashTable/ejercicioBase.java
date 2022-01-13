package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class ejercicioBase {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Hashtable<String,Object[]> listaCoches = new Hashtable();

        Object[] coche = new Object[]{"123a","Mercedes","c220"};

        listaCoches.put(coche[0].toString(),coche);
        listaCoches.put("123b",new Object[]{"123b","Audi","A5"});
        listaCoches.put("123c",new Object[]{"123c","BMV","i8"});

        Enumeration<Object[]> listaCochesEnum = listaCoches.elements();
        while (listaCochesEnum.hasMoreElements()){
            Object[] cocheActual = listaCochesEnum.nextElement();
            for ( Object item : cocheActual ) {
                System.out.println(item);
            }
        }

        /*Enumeration<String> listaClaves =  listaCoches.keys();
        while (listaClaves.hasMoreElements()){
            String clave = listaClaves.nextElement();
            Object[] elemento = listaCoches.get(clave);
            for (int i = 0; i < elemento.length; i++) {
                System.out.println(elemento[i]);
            }
        }*/

        //os pidan una matricula por teclado y sacar todos los datos del coche encontrado
        //en el caso de no haber encontrado un coche saltará un aviso

        /*System.out.println("Introduce una matricula a buscar");
        String matricula = teclado.next();

        if (listaCoches.get(matricula)!=null){
            System.out.println("Matricula es correcta");
            for ( Object item : listaCoches.get(matricula) ) {
                System.out.println(item);
            }
        }else {
            System.out.println("Matricula incorrecta");
        }*/




    }
}
