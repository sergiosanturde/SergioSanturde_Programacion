package EjerClase;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> personas;
    private  String nombre;
    private int votos;
    private int beneficios;

    public Empresa() {
    }

    public Empresa(String nombre, int beneficios) {
        this.nombre = nombre;
        this.beneficios = beneficios;
        personas = new ArrayList();
    }
    //metods
    public void addPersona(Persona persona){
        personas.add(persona);
    }
    public void desperdirPersonas(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equalsIgnoreCase(dni));
            personas.remove(i);
            break;
        }
    }
    public void buscarPersonas(String dni){
        for ( Persona item : personas  ) {
            if (item.getDni().equalsIgnoreCase(dni)){
                item.mostrarDatos();
            }
        }
    }

    public void repartirBeneficios(){
        for ( Persona item : personas ) {
            if (item instanceof Comision){

            }

        }
    }
    public void listarPersonas(){
        for ( Persona item : personas ) {
            item.mostrarDatos();
        }
    }
    
    
    //g y s
    
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVotos() {
        return votos;
    }


    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }
}
