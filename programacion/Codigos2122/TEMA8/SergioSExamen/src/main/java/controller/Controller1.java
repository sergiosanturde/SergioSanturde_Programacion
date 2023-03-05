package controller;

import java.io.*;

public class Controller1 {

    public void cifrarTexto() {
        File file = new File("src/main/resources/ficheroCifrado.txt");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String linea = "";
            StringBuffer stringBuffer = new StringBuffer();
            String lineaCifrar = "¦Ò@ÐÂæ@ØÊÒÈÞ@ÊæèÞ@Êæ@âêÊ@ÐÂæ@æÒÈÞ@ÆÂàÂô@ÈÊ@ØÊÊä@ÊØ@ÌÒÆÐÊäÞ@ÈÊØ@àäÒÚÊä@ÊÔÊäÆÒÆÒÞ\\@¦ÒÎêÊ@ØÂæ@ÒÜæèäêÆÆÒÞÜÊæ@àÂäÂ@àÞÈÊä@àÂæÂä@ÂØ@æÊÎêÜÈÞ@ÊÔÊäÆÒÆÒÞ b\\@ŠÜ@ØÂ@ÂÆèÒìÒÈÂÈ@ÈÊ@ÆØÂææäÞÞÚ@ÈÊØ@ÊðÂÚÊÜ@èÒÊÜÊ@àêÄØÒÆÂä@ØÂ@æÒÎêÒÊÜèÊ@ÌäÂæÊ@NŠÔÊäÆÒÆÒÞb@ÆÞÚàØÊèÂÈÞN d\\@˜Â@ÆÞÜèäÂæÊǢÂ@ÈÊØ@\\ôÒà@ÈÊØ@æÊÎêÜÈÞ@ÊÔÊäÆÒÆÒÞ@Êæ@ äÞÎä€ÚÂÆÒ`Ü¾dddb ¦êÊäèÊ@ÊÜ@ÊØ@æÊÎêÜÈÞ@ÊÔÊäÆÒÆÒÞ";
            String[] texto = lineaCifrar.split("");
            while (( linea = br.readLine()) != null);{
                stringBuffer.append(texto);
                for ( String lineas : texto ) {
                    int codigo = (byte) (lineas.charAt(0));
                    int codigoDescifrado = codigo / 2;
                    char textoDescifrado = (char) codigoDescifrado;
                    System.out.print(textoDescifrado);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
