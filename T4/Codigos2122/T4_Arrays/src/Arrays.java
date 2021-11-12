public class Arrays {

    public static void main(String[] args) {
        //array de numeros
        int[] numeros = new int[15];
        int[] numeroDos = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int numerosPares=0, numeroImpares=0;

        //Meter en un array de 15 posiciones,15 num aletorios entre 0 - 50


        for (int i = 0; i < numeroDos.length; i++) {
            numeros[i] = (int)(Math.random()*50);
            System.out.println((int)(Math.random()*50));
        }
        for (int i = 0; i < 15; i++) {
            if(numeros[i]%2==0){
                numerosPares++;
            }else{
                numeroImpares++;
            }
        }

    }
}

