public class entrada {

    // ambito de clase
    //String nombre = "Sergio";

    public static void main(String[] args) {
        // ambito de metodo
        //String nombre = "Sergio";

         Usuario usuario1 = new Usuario();
        // nombre="Por defecto", pass=null, correo=null, edad=0, fecha=null

        /*Usuario usuario2 = new Usuario();
        // nombre=null, pass=null, correo=null, edad=0, fecha=null

        Usuario usuario3 = new Usuario("Sergio","Sergio.santurde@cesjp.es","1234q");
        // nombre="Sergio, pass="1234q, correo="Sergio.santurde@cesjp.es", edad=0, fecha=null

        Usuario usuario4 = new Usuario("Sergio.santurde@cesjp.es","1234q",20);
        // nombre=null, pass="1234q", correo="Sergio.santurde@cesjp.es", edad=20, fecha=null

        usuario1.password = "contraseña";
        System.out.println(usuario1.password);
        // nombre="Por defecto", pass="contraseña", correo=null, edad=0, fecha=null
        */

        //usuario1.setPassword("contraseña");
        //System.out.println(usuario1.getPassword());

        //usuario1.mostrarDatos();
        //System.out.println(usuario1.mostrarDatosRetorno());
        usuario1.saludar("sergio");




        usuario1.setNombre("nombre");
        System.out.println(usuario1.getNombre());

        usuario1.setApellidos("Apellido");
        System.out.println(usuario1.getApellidos());

        usuario1.setCorreoElectronico("Correo");
        System.out.println(usuario1.getCorreoElectronico());

        usuario1.setFecha("Fecha");
        System.out.println(usuario1.getFecha());

        usuario1.setEdad(0);
        System.out.println(usuario1.getEdad());
    }
}
