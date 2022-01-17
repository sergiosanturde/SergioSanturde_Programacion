package EjerciciosObjetos.EjerCoche;

public class Entrada {
    public static void main(String[] args) {
        Motor motorGasoil = new Motor(150,1000);
        Motor motorGasolina = new Motor(120,500);

        Coche cocheGasolina = new Coche("Ford","Fiesta",new Motor(120,500));
        Coche cocheGasoil = new Coche("Opel","Corsa",
                new Motor(150,1000));

        Garaje garaje = new Garaje();
        //coche = null // numCoches 0 // averia = null
        if (garaje.aceptarcoche(cocheGasoil,"aceite")==true){
            System.out.println("Coche aceptado");
            System.out.println(cocheGasoil.getMotor().getLitrosAceite());
        }else {
            System.out.println("Garaje ocupado");
        }
    }
}
