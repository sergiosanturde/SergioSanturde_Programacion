package TrigonometriaHerencia;

public final class Rectangulo extends Figura{

    private double base,altura,perimetro;

    public Rectangulo(){}

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        area = base * altura;
        return area;
    }

    public double calcularPerimetro(){
        perimetro = 2 * (base + altura);
        return perimetro;
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
