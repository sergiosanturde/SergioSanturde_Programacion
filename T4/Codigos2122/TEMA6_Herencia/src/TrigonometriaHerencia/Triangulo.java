package TrigonometriaHerencia;

public class Triangulo {

    private double base,altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){

    }

    public double calcularArea(){
        double area =(base * altura) / 2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
