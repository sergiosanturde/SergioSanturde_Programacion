package TrigonometriaHerencia;

public abstract class Figura {

    double area;

    Figura(){}

    public abstract double calculaArea();

    // g y s
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
