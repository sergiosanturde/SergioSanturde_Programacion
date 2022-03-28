package Excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.ParseException;

public class Coche {
    public void metodo1() throws IOException {
        File file = new File("");
        FileWriter fw = new FileWriter(file);
    }

    public void metodo2(boolean acierto){
        if (acierto){
            System.out.println("Pasado un true");
        }else {
            try {
                throw  new MiExcepcion("Error localizado en salso");
            } catch (MiExcepcion e) {
                e.printStackTrace();
            }
        }
    }

    public void metodo3(){

    }

    public void metodo4(){

    }

}
