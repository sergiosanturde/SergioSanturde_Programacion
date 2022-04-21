package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario(){
        File file = new File("src/resources/objetos.bin");
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new Usuario("Sergio","Santurde","1234Q"));
            oos.writeObject(new Usuario("Lucas","Zapata","1234E"));

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

    public void lecturaBinaria(){
        File file = new File("src/resources/objetos.bin");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Usuario usuarioLectura = null;

            while ((usuarioLectura = (Usuario) ois.readObject()) != null) {
                System.out.println(usuarioLectura.toString());
            }
        }catch (EOFException e) {
            System.out.println("fsga");;
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
