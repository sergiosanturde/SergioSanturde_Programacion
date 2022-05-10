package EjercicioClaseCoche;

public class Coche {
    private double precio;
    private int velocidad;
    private String marca,modelo;
    private Motor motor;

    public Coche(double precio, int velocidad, String marca, String modelo) {
        this.precio = precio;
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos(){
        System.out.println(precio);
        System.out.println(velocidad);
        System.out.println(marca);
        System.out.println(modelo);
        motor.mostrarDatosMotor();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if (motor.getCV() < 50){
            this.precio = precio * 1.25;
        }else if (motor.getCV() >50 & motor.getCV()<100){
            this.precio = precio * 1.40;
        }else if (motor.getCV()> 100 & motor.getCV() < 20){
            this.precio = precio * 1.60;
        }else if (motor.getCV()>200){
            this.precio = precio * 1.80;
        }
    }

    class Motor{
        private int CV,CC;

        public Motor(int CV, int CC) {
            this.CV = CV;
            this.CC = CC;
            setMotor(this);
        }

        public void mostrarDatosMotor(){
            System.out.println(CV);
            System.out.println(CC);
        }

        //g y s

        public int getCV() {
            return CV;
        }

        public void setCV(int CV) {
            this.CV = CV;
        }

        public int getCC() {
            return CC;
        }

        public void setCC(int CC) {
            this.CC = CC;
        }
    }
}
