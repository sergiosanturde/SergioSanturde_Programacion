package EjerciciosObjetos.EjerTrigronometria;

public class Circulo {

    private double radio,diametro,area;

    public Circulo(){

    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public double calculoArea(){
        area = Math.PI*Math.pow(radio,2);
        return area;
    }
    public double calculoDiametro(){
        diametro = 2*radio;
        return diametro;
    }

}
