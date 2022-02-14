package TrigonometriaHerencia;

public class Circulo {

    private double radio;

    public Circulo(){

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        double area=Math.PI*Math.pow(2,radio);
        return area;
    }

    public double calcularDiametro(){
        double diametro = 2 * radio;
        return  diametro;
    }

    //G Y S

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
