package EjerciciosObjetos.EjerTrigronometria;

public class Triangulo {

    private int base,altura;

    public Triangulo(){

    }
    public Triangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        double area = (base*altura)/2;
        return area;}
}
