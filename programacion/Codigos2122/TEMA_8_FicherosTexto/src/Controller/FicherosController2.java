package Controller;

import java.io.*;

public class FicherosController2 {


    public void getFileInfo(File file) {
        System.out.println("Informacion de fichero");
        System.out.println("Es directorio? " + file.isDirectory());
        System.out.println("Es fichero? " + file.isFile());
        System.out.println("Existe? " + file.exists());
        System.out.println("Padre " + file.getParent());
        System.out.println("Nombre " + file.getName());
        System.out.println("Ruta Absoluta " + file.getAbsolutePath());
        System.out.println("Ruta Relativa " + file.getPath());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getDirectoryInfo(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.isDirectory()) {
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            for (File fichero : ficheros) {
                System.out.println(fichero.getName());
            }
            //System.out.println(ficheros);
            //System.out.println(nombreFicheros);
            /*for ( String nombre : nombreFicheros ) {
                System.out.println(nombre);
            }*/
        }
    }

    public void lecturaFichero(File file){
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            //fileReader.read();
            int lectura = 0;
            /*do {
                lectura = fileReader.read();
                System.out.println(lectura);
            }while (lectura !=1 );*/
            /*while (lectura!=-1){
                lectura = fileReader.read();
                System.out.println(lectura);
            }*/
            while ((lectura = fileReader.read())!= -1){
                System.out.println((char) lectura);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public void lecturaBuffer(File file){

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
            String lecturaCompleta = "";
            while ((linea = bufferedReader.readLine()) !=null ){
                System.out.println(linea );
                lecturaCompleta+=linea;
                lecturaCompleta+="\n";
            }
            System.out.println("La lectura completa es: " );
            System.out.println(lecturaCompleta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escrituraFichero(File file){
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    public void cifrado(File file){

        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dentro del fichero";
        String[] letras = lineaEscribir.split("");

        for ( String item : letras ) {
            int codigo = ((byte)item.charAt(0));
            int codigoAlterado = codigo * 2;
            char caracterCifrado = (char) codigoAlterado;
            System.out.println(caracterCifrado);
        }



    }

    public void escribirFicheroCompleto(File file){
        FileWriter fileWriter =  null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            /*printWriter = new PrintWriter(fileWriter);
            printWriter.println("Esto es un ejemplo de linea");
            printWriter.println("Esto es un ejemplo de linea segunda");
            printWriter.println("Esto es un ejemplo de linea tercera");
            /*bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Esto es un ejemplo");
            bufferedWriter.newLine();
            bufferedWriter.write("Esto es un ejemplo numero 2");
            bufferedWriter.newLine();*/

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //printWriter.close();
            }
        }
    }

}
