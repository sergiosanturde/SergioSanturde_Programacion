package controller;

import model.UsuarioEjercicio1;

import java.io.*;
import java.util.ArrayList;

public class ControllerEjercicio1 {

    private ArrayList<UsuarioEjercicio1> listaUsuarios;

    public ControllerEjercicio1(){
        listaUsuarios = new ArrayList<>();
    }

    public void addUsuario(UsuarioEjercicio1 usuario){
        this.listaUsuarios.add(usuario);
    }
    public void addUsuario(String nombre, String apellido, String pass){
        this.listaUsuarios.add(new UsuarioEjercicio1(nombre, apellido, pass));
    }

    public void escrituraUsuarios(){
        File file = new File("src/resources/usuarios.bin");
        FileOutputStream fos;
        ObjectOutputStream oos = null;


        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            for (UsuarioEjercicio1 itemUser: listaUsuarios) {
                oos.writeObject(itemUser);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void mostrarDatosUsuario(UsuarioEjercicio1 usuario){
        System.out.println("Nombre: "+usuario.getNombre());
        System.out.println("Apellido: "+usuario.getApellido());
    }

    public void lecturaFichero(){
        File file = new File("src/resources/usuarios.bin");
        FileInputStream fis = null;
        ObjectInputStream ois =null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            UsuarioEjercicio1 item = null;
            try {
                while ((item = (UsuarioEjercicio1) ois.readObject())!=null){
                    mostrarDatosUsuario(item);

                }
            } catch (EOFException e){
                System.out.println("Terminado de leer fichero");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}