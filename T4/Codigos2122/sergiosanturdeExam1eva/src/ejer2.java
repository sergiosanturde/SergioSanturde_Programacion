import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;
        int comensales=0;
        int refresco = 0;
        int cafe = 0;
        int bocadillo = 0;
        int carta = 0;


        final double refrescoT = 1.20 + refresco;
        final double cafeT = 1 + cafe;
        final double bocadilloT = 3.20 + bocadillo;
        final double cartaT = 9.50 + carta;



        do {
            System.out.println("1 - Pedir café");
            System.out.println("2 - Pedir refresco");
            System.out.println("3 - Pedir bocadillo");
            System.out.println("4 - Pedir carta");
            System.out.println("5 - Sacar la cuenta");
            System.out.println("Introduce una opcion");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("¿Cuántos cafes quiere?");
                    cafe = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("¿Cuántos refrescos quiere?");
                    refresco = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("¿Cuántos bocadillos quiere?");
                    bocadillo = teclado.nextInt();
                    break;
                case 4:
                    System.out.println("¿Cuántos menus quiere?");
                    carta = teclado.nextInt();
                    break;
                case 5:
                    System.out.println("Introduzca el número de comensales");
                    comensales = teclado.nextInt();
                    double sumaBocadillo = bocadillo + bocadilloT;
                    double sumaCafe = cafe + cafeT;
                    double sumaRefresco = refresco + refrescoT;
                    double sumaMenu = carta + cartaT;


                    System.out.println("Bocadillos = " + sumaBocadillo);
                    System.out.println("Refrescos = " + sumaRefresco);
                    System.out.println("Menus = " +sumaMenu);
                    System.out.println("Cafes = " + sumaCafe);




                    double precioTotal = sumaBocadillo + sumaCafe + sumaMenu + sumaRefresco ;

                    System.out.println("Precio Total = " + precioTotal );

                    double precioPersona = precioTotal/comensales;

                    System.out.println("Precio por persona = " + precioPersona);

            }
            if (menu < 0){
                System.out.println("ERROR");
            }

        }while (menu != 5);
    }
}
