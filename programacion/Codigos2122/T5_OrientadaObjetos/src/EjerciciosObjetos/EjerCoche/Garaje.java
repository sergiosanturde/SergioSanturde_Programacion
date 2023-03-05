package EjerciciosObjetos.EjerCoche;

public class Garaje {
    private Coche coche;
    private String averia;
    private int numCoches;

    //Constructor
    public  Garaje(){

    }
    //Metodos
    public boolean aceptarcoche(Coche cocheAceptado,String averia){
        if (this.coche!=null){
            return false;
        }else{
            numCoches++;
            this.coche = cocheAceptado;
            if (averia.equalsIgnoreCase("aceite")){
                cocheAceptado.getMotor().setLitrosAceite(coche.getMotor()
                        .getLitrosAceite()+10);
            }else{
                cocheAceptado.getMotor().setLitrosAceite(coche.getMotor()
                        .getLitrosAceite()+(int)(Math.random()*1000));
            }
            return true;
        }
    }
}
