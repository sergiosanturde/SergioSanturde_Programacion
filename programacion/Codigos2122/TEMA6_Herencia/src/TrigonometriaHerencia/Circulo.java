package TrigonometriaHerencia;

public final class Circulo extends Figura{

    private double radio;

    public Circulo(){}

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
        this.area = Math.PI * Math.pow(radio,2);
        return this.area;
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
