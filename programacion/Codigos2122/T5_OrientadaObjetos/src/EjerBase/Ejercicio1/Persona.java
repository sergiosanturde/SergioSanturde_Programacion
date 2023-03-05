package EjerBase.Ejercicio1;

public class Persona {
    //ATRIBUTOS
    private String nombre,apellido,dni;
    private int edad,altura;
    private double peso;

    //CONSTRUCTOR
    public Persona(String nombre,String apellido,String dni,int edad,int altura,double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    public Persona(String nombre,String apellido,String dni,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    public Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
    }
    public Persona(){
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
    }


    //METODOS
    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("DNI "+dni);
        System.out.println("Edad "+edad);
        System.out.println("Altura "+ altura);
        System.out.println("Peso "+ peso);
    }
    public void incrementarEdad(int edadIncremento){
        this.edad += edadIncremento;
    }
    public double calcularIMC(){

        double imc = this.peso / Math.pow(this.altura,2);
        return imc;
    }
    public String estadoIMC(){
        final double IMC = calcularIMC()*10000;
        String estado = "";
        if (IMC<18.5){
            estado = "Peso inferior a normal";
        }else if (IMC > 18.5 && IMC < 24.9){
            estado = "normal";
        }else if (IMC >=25 && IMC <29.9){
            estado = "Peso superior a normal";
        }else {
            estado = "obesidad";
        }
        return  estado;
    }

    //GETTER SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
