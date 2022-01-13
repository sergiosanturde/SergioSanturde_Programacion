public class Usuario {

    // variables
    private String correoElectronico, nombre, apellidos, password, fecha;
    private int edad;

    // contructores
    // si no hay constructores escritos,hay un constructor que es el vacio(por defecto)
    // este constructor deja de existir cuando se escribe algún constructor
    public Usuario() {
        this.nombre = "Por defecto";
        this.correoElectronico = "Por defecto";

    }

    /*private Usuario(String nombre, String correoElectronico, String password){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }
    private Usuario (String correoElectronico, String password, int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }
    */


    // métodos

    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Contraseña "+password);
        System.out.println("Correo "+correoElectronico);
        System.out.println("Fecha "+fecha);
        System.out.println("Edad "+edad);
    }

    public String mostrarDatosRetorno(){
        nombre ="Otra cosa";
        return "Nombre " + nombre + "\n" + "Apellido " + apellidos;
    }

    public  void saludar(String nombreSaludar){
        System.out.println("Hola" + nombreSaludar +",que tal estas");
    }

    public void saludar(Usuario usuario){
        System.out.println("Hola" + usuario.getNombre() +",que tal estas");
    }


    // métodos getters y setters

    //getter de pass
    public String getPassword() {
        return password;
    }

    //setter de pass
    public void setPassword(String password) {
        this.password = password;
    }

    //getter de nombre
    public String getNombre() {
        return nombre;
    }

    //setter de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getter de correo
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    //setter de correo
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    //getter apellidos
    public String getApellidos() {
        return apellidos;
    }

    //setter apellidos
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //getter fecha
    public String getFecha() {
        return fecha;
    }

    //setter fecha
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    //getter edad

    public int getEdad() {
        return edad;
    }

    //setter edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
