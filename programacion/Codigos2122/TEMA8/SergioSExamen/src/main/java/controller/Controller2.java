package controller;

import model.Personaje;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Controller2 {

    public void leerUsuarios(){

        File file = new File("src/main/resources/personajes.bin");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Personaje personaje = null;
            try{
                while ((personaje = (Personaje) ois.readObject())!=null){
                    System.out.println(personaje);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
