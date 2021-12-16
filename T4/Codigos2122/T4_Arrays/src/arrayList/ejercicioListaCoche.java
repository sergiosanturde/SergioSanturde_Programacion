package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioListaCoche {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Object[] coche1 = new Object[]{"Mercedes","c220",250};
        Object[] coche2 = new Object[]{"Audi","A5",350};
        Object[] coche3 = new Object[]{"VW","Arteon",180};

        ArrayList<Object[] > listaCoches = new ArrayList();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(new Object[]{"Ford","Focus",150});
        listaCoches.add(new Object[]{"Ford","Mondeo",410});
        listaCoches.add(new Object[]{"Ford","Fiesta",170});
        listaCoches.add(new Object[]{"Mercedes","c180",281});
        listaCoches.add(new Object[]{"Mercedes","CLS",110});
        listaCoches.add(new Object[]{"Mercedes","EQS",756});
        listaCoches.add(new Object[]{"Audi","A4",350});
        listaCoches.add(new Object[]{"Audi","A3",425});
        listaCoches.add(new Object[]{"Audi","A1",575});
        listaCoches.add(new Object[]{"VW","A",69});
        listaCoches.add(new Object[]{"VW","B",241});

        //obtener coches

        /* Object[] cocheSeleccionado = listaCoches.get(0);
        System.out.println(cocheSeleccionado[1]);
        System.out.println(listaCoches.get(2)[0]);*/

        // Marca: Mercedes  Modelo: C220    CV: 250
        // Marca: Audi  Modelo: A5    CV: 350
        // Marca: VW  Modelo: Arteon    CV: 180

        String marcaCoche;
        System.out.println("¿Que marca quieres buscar?");
        marcaCoche = teclado.next();

        for ( Object[] coche : listaCoches ) {
            if (coche[0].equals(marcaCoche))
            for (  Object item: coche  ) {
                System.out.println(item + "\t");
            }
        }




        /*for ( Object[] coche : listaCoches ) {
            for ( Object item : coche ) {
                System.out.println(item +"\t");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < listaCoches.size(); i++) {

            Object[] cocheActual = listaCoches.get(i);

            //System.out.print("Marca: " + listaCoches.get(i)[0] + "\t" + "Modelo: " + listaCoches.get(i)[1] + "\t" + "CV: " + listaCoches.get(i)[2] + "\t" + "\n");*/

    }
}
