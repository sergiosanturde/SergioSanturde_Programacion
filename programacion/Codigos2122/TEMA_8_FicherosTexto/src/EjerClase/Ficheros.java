package EjerClase;

import java.io.*;
import java.util.Scanner;

public class Ficheros {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void ficheroBucle(File file){
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        String linea = "";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;


        do {

            try {
                System.out.println("Introduce linea a escribir");
                linea = bufferedReader.readLine();
                //System.out.println(linea);
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.println(linea);

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (printWriter != null) {
                    printWriter.close();
                }
            }


            System.out.println("Quieres crear más lineas?(0 (no)(1)(si)");
            opcion = teclado.nextInt();


        }while (opcion!=0);

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = "";
            String lecturaCompleta = "";
            StringBuffer lecturaBuffer = new StringBuffer();

            while( (lectura= bufferedReader.readLine())!=null);{
                lecturaBuffer.append(lectura);
            }
            lecturaCompleta = lecturaBuffer.toString();
            System.out.println(lecturaCompleta);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
