import java.util.ArrayList;

public class Concesionario {
    private String matricula;

    ArrayList<Coche> listaCoches;

    //
    public Concesionario(){
        listaCoches = new ArrayList<Coche>();
    }

    public void agregarCoche(Coche coche){
        listaCoches.add(coche);
        System.out.println("Coche agregado");
    }
    public void buscarCoche(String matricula){
        for ( Coche coche : listaCoches  ) {
            if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Coche encontrado");
                coche.mostrarDatos();
            }else {
                System.out.println("Coche no encontrado");
            }
        }
    }
    public void borrarCoche(String matricula){
        for ( Coche matri : listaCoches ) {
            if (matri.getMatricula().equalsIgnoreCase(matricula)){
                System.out.println("Coche borrado");
            }else{
                System.out.println("Coche no encontrado");
            }
        }
    }
    public void clasificar(){
        int nDeportivo=0,nSuv=0,nUtil=0,nElectrico=0;
        for ( Coche coche : listaCoches ) {
            if (coche instanceof Deportivo){
                nDeportivo++;
            }
            else if (coche instanceof Suv){
                nSuv++;
            }
            else if (coche instanceof Utilitarios){
                nUtil++;
            }
            else if (coche instanceof Electrico){
                nElectrico++;
            }
        }
        System.out.println("Tenemos " + nDeportivo + " coches deportivos");
        System.out.println("Tenemos " + nSuv + " coches suv");
        System.out.println("Tenemos " + nElectrico + " coches electricos");
        System.out.println("Tenemos " + nUtil + " coches utilitarios");
    }


}
