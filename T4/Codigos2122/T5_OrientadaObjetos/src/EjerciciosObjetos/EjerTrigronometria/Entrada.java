package EjerciciosObjetos.EjerTrigronometria;

public class Entrada {
    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(5,5);

        Circulo circulo1 = new Circulo(2.4);

        Cuadrado cuadrado = new Cuadrado(3,8);

        System.out.println("El area del Triangulo es: " + triangulo1.calcularArea());
        System.out.println("El area del Circulo es: " + circulo1.calculoArea());
        System.out.println("El diametro del Circulo es: " + circulo1.calculoDiametro());
        System.out.println("El area del Cuadrado es: "+ cuadrado.calcularArea());
        System.out.println("El perimetro del Cuadrado es: " + cuadrado.calcularPerimetro());
        //mod

        System.out.println("¿Qué quieres selccionar?");
        System.out.println("");
        System.out.println("");




    }
}
