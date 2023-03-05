package EjerciciosObjetos.EjerCoche;

public class Coche {
    private Motor motor;
    private String marca,modelo;
    private double precio;

    public Coche(String marcaCoche,String modeloCoche){
        this.marca = marcaCoche;
        this.modelo = modeloCoche;
    }
    public Coche(String marcaCoche,String modeloCoche,Motor motor){
        this.marca = marcaCoche;
        this.modelo = modeloCoche;
        this.motor = motor;
    }


    public  void acumularAveria(double incrementoAveria){
        this.precio += incrementoAveria;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
