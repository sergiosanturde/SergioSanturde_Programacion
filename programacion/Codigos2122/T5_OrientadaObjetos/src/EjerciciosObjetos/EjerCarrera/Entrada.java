package EjerciciosObjetos.EjerCarrera;

public class Entrada {

    public static void main(String[] args) {
        int kilometrosEtapa = 10000;
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Fiat","747qwe",140);


        coche1.setModelo("Opel Corsa");
        coche1.setMatricula("1234RTY");
        coche1.setCv(240);

        coche1.setVelocidad((int)(Math.random()*21)+10);
        coche2.setVelocidad((int)(Math.random()*21)+10);


        do {
            coche1.acelerar((int)Math.random()*10);
            coche2.acelerar((int)Math.random()*10);

        } while (coche1.getKilometros() < kilometrosEtapa && coche2.getKilometros() < kilometrosEtapa);

        if (coche1.getKilometros() > coche2.getKilometros()){
            System.out.println("El coche 1 es el ganador");
        }else{
            System.out.println("El coche 2 es el ganador");
        }

        coche1.mostrarDatos();
        System.out.println("\n");
        coche2.mostrarDatos();
    }
}

