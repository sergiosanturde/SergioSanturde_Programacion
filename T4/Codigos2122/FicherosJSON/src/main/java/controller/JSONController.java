package controller;

import com.google.gson.Gson;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONController {

    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";

    public void pasarStringJSON() {
        // STRING --> (org.json)
        JSONObject jsonObject = new JSONObject(jsonString);
        String nombre = jsonObject.getString("nombre");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }
    }

    public void leerFicheroJSON() {
        File file = new File("src/main/resources/persona.json");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();
            while ((linea=br.readLine())!= null){
                lecturaCompleta .append(linea);
            }

            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());
            JSONArray jsonArray = jsonObject.getJSONArray("conocimientos");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject conocimiento = jsonArray.getJSONObject(i);
                Gson gson = new Gson();
                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(),Conocimiento.class);
                System.out.println(conocimientoJava.getConcepto());
                System.out.println(conocimientoJava.getExperiencia());



                /*String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");*/
            }


            // System.out.println(jsonObject);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
