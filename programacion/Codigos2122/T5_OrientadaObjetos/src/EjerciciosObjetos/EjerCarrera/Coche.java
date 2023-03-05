package EjerciciosObjetos.EjerCarrera;

import java.util.SortedMap;

public class Coche {
    private int cv,velocidad;
    private String matricula,modelo;
    private double kilometros;

    //Constructores

    public Coche(){
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "Sin Especificar";
        this.kilometros = 0.0;
    }
    public Coche(String modelo,String matricula,int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    //Metodos

    public void acelerar(int arranque){
        this.velocidad += arranque;

        this.kilometros = velocidad * (cv * (int)(Math.random()*11));

        if (velocidad > 180){
            this.velocidad = 180;
            System.out.println("Por favor modere la velocidad");
        }
    }

    public void frenar(int frenar){
        this.velocidad -= frenar;

        if (velocidad > 0){
            this.velocidad = 0;
            System.out.println("Por favor frene");
        }
    }
    public void parar(){
        this.velocidad = 0;
    }

    public void resetear(){
        this.velocidad = 0;
        this.kilometros = 0.0;
    }

    public void mostrarDatos(){
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("CV: " + this.cv);
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("Kilómetros: " + this.kilometros);
    }

    //Getter y setter

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }
}
