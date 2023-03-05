package EjerciciosObjetos.EjerTrigronometria;

public class Cuadrado {
        private int base,altura;
        private double area,perimetro;

        public Cuadrado(){

        }
        public Cuadrado(int base,int altura){
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            area = base * altura;
            return area;
        }
        public double calcularPerimetro(){
            perimetro = (2 * altura) + (2 * base);
            return perimetro;
        }
}
