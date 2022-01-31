package EjerciciosObjetos.EjerCarrera;

import java.util.SortedMap;

public class Coche {
    private int cv,velocidad;
    private String matricula,modelo;
    private double kilometros;

    //constructor
    public Coche(){
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "Sin especificar";
        this.kilometros = 0.0;
    }
    public Coche(String modelo,String matricula,int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    //Método

    public void acelerar(int fium){
        if (velocidad > 180){
            System.out.println("Baja el carro wacho");
        }
        this.velocidad += fium;
        this.kilometros = velocidad*((cv)+(Math.random()*11));
    }
    public void frenar(int parar){
        if (velocidad < 0){
            System.out.println("Acelera prro");
        }
        this.velocidad = 0;
    }
    public void parar(){
        this.velocidad = 0;
    }
    public void resetear(){
        this.velocidad = 0;
        this.kilometros = 0.0;
    }
    public void mostrarDatos(){
        System.out.println(this.matricula);
        System.out.println(this.modelo);
        System.out.println(this.cv);
        System.out.println(this.velocidad);
        System.out.println(this.kilometros);
    }

    //GETTER  Y SETTER  

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
