package Anidacion;

public class Entrada {
    public static void main(String[] args) {
        ClaseGeneral claseGeneral = new ClaseGeneral("General",1,false);
        //claseGeneral.mostrarDatos();
        ClaseGeneral.ClaseAnidada claseAnidada = claseGeneral.new ClaseAnidada("Hija",2,true);
        //claseAnidada.mostrarDatosHija();
    }
}
