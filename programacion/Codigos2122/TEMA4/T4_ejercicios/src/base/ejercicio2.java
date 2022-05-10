package base;

public class ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[30];
        int suma = 0;
        double media = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*11);
            System.out.println((int)(Math.random()*11));
        }

        for ( int item : numeros ) {
            suma = suma += item;
        }
        media = (double) suma / (double) numeros.length;

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
    }
}
