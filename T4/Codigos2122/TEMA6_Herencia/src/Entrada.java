public class Entrada {

    public static void main(String[] args) {
        /*Coche coche = new Coche("123A","123",100,2000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());
        Deportivo deportivo = new Deportivo("234B","234",200,2500,600);
        System.out.println(deportivo.getMatricula());
        deportivo.calcularVelocidad(120);
        System.out.println(deportivo.getVelocidad());*/
        Deportivo deportivo = new Deportivo("123A","123",100,100,300);

        Suv suv = new Suv("234B","234",200,2000,true);

        Utilitarios utilitarios = new Utilitarios("345C","345",300,300,5);

        Electrico electrico = new Electrico("456D","456",400,4000,750);

        Concesionario concesionario = new Concesionario();

        /*deportivo.calcularVelocidad(100);
        suv.calcularVelocidad(70);
        utilitarios.calcularVelocidad(170);
        electrico.calcularVelocidad(40);*/

        /*deportivo.mostrarDatos();
        System.out.println("\n");
        suv.mostrarDatos();
        System.out.println("\n");
        utilitarios.mostrarDatos();
        System.out.println("\n");
        electrico.mostrarDatos();*/

        concesionario.agregarCoche(electrico);
        concesionario.agregarCoche(suv);
        concesionario.agregarCoche(electrico);
        concesionario.agregarCoche(utilitarios);
        concesionario.agregarCoche(deportivo);
        concesionario.agregarCoche(deportivo);



        concesionario.clasificar();


    }
}
