package base;

public class ejercicio6 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int sumaModificaciones=0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31);
            System.out.println((int) (Math.random() * 31));


        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6){
                numeros[i] = 8;
                sumaModificaciones++;
            }else if (numeros[i] == 7){
                numeros[i] = 15;
                sumaModificaciones++;
            }else if (numeros[i] == 20){
                numeros[i] = 10;
                sumaModificaciones++;
            }
        }
        System.out.printf("El numero de modificaciones es: %d%n",sumaModificaciones);
    }
}
