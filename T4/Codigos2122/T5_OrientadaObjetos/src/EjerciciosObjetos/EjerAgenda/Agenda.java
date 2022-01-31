package EjerciciosObjetos.EjerAgenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listaPersonas;

    public Agenda(){
        this.listaPersonas = new ArrayList();
    }

    public void anadirPersona(Persona persona){
        boolean existe = false;
        for ( Persona personas : listaPersonas ) {
            if (personas.getTelefono() == personas.getTelefono() ){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("3rror");
        }else {
            listaPersonas.add(persona);
        }
        listaPersonas.add(persona);

        if (existePersona(persona.getTelefono()) == null){
            listaPersonas.add(persona);
        }else {
            System.out.println("La persona ya existe");
        }
    }


    public void listar(){
        for ( Persona item : listaPersonas ) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    public boolean borrarPersona(int telefono){

        /*for (int i = 0; i < listaPersonas.size(); i++) {
            if (telefono == listaPersonas.get(i).getTelefono()){
                listaPersonas.remove(i);
                return true;
            }
        }*/
        if (existePersona(telefono) == null){
            listaPersonas
        }
        return false;

    }

    public void buscarPersona(int telefono){
        /*for ( Persona persona : listaPersonas ) {
            if (persona.getTelefono() == telefono){
                persona.mostrarDatos();
                break;
            }
        }*/
        if (existePersona(telefono) != null){
            existePersona(telefono).mostrarDatos();
        }
    }

    public void editarPersona(int telefono){
        /*for ( Persona persona : listaPersonas ) {
            if (persona.getTelefono() == telefono){
                persona.setNombre("Otro nombre");
                persona.setDni("123123");
                break;
            }
        }*/
        if (existePersona(telefono)!=null){
            Persona personaEncontrada = existePersona(telefono);
            personaEncontrada.setNombre("Nuevo");
            personaEncontrada.setDni("ASFS");
            personaEncontrada.setTelefono(1234);
        }
    }

    private Persona existePersona(int telefono){

        Persona persona = null;

        for ( Persona item : listaPersonas ) {
            if (item.getTelefono() == telefono){
                return item;
            }
        }

        return persona;
    }
}
