package controller;

import com.google.gson.Gson;
import model.Asignaturas;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class JSONController {

    ArrayList<Asignaturas> listaAsignaturas;


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
            while ((linea = br.readLine()) != null) {
                lecturaCompleta.append(linea);
            }

            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());
            JSONArray jsonArray = jsonObject.getJSONArray("conocimientos");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject conocimiento = jsonArray.getJSONObject(i);
                Gson gson = new Gson();
                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(), Conocimiento.class);
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

    public void leerJSONAsignaturas() {

        File file = new File("src/main/resources/asignaturas.json");
        BufferedReader br = null;
        listaAsignaturas = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(file));
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();
            while ((linea = br.readLine()) != null) {
                lecturaCompleta.append(linea);
            }

            JSONObject jsonAsignaturas = new JSONObject(lecturaCompleta.toString());
            JSONArray asignaturas = jsonAsignaturas.getJSONArray("asignaturas");
            //System.out.println(asignaturas);
            for (int i = 0; i < asignaturas.length(); i++) {
                JSONObject asig = asignaturas.getJSONObject(i);
                Gson gson = new Gson();
                Asignaturas asignaturasJAVA = gson.fromJson(asig.toString(), Asignaturas.class);
                listaAsignaturas.add(asignaturasJAVA);
                //buscarAsignatura(asignatura,"dam",1);

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

    public void caractAsign(String ciclo, int curso) {
        for (Asignaturas item : listaAsignaturas) {
            if (item.getCurso() == curso && item.getCiclo().contains(ciclo)) {
                System.out.println(item.getCiclo());
                System.out.println(item.getCurso());
                System.out.println("Conociminetos");
                for (String itemCon : item.getConocimiento()) {
                    System.out.println(itemCon);
                }
            }
        }
    }

    public void buscarAsignatura(Asignaturas asignaturas, String ciclo, int curso) {

        if (asignaturas.getCiclo().contains(ciclo) && asignaturas.getCurso() == curso) {
            System.out.println(asignaturas.getCiclo());
            System.out.println(asignaturas.getCurso());
        }
    }

    public void lecturaJASONAPI(int numero) {
        String urlString = "https://randomuser.me/api/?results=" + numero;
        try {

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String lectura = bufferedReader.readLine();
            JSONObject jsonObject = new JSONObject(lectura);
            System.out.println(connection);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void lecturaUsers(){

        String urlString = "https://randomuser.me/api/?results=2";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //File file;
            //FileReader fileReader;
            BufferedReader bufferedReader;

            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;

            while ((linea=bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responeJSON = new JSONObject(response);
            JSONArray arrayResultados = responeJSON.getJSONArray("results");
            JSONObject objetoResultado = arrayResultados.getJSONObject(0);

            for (int i = 0; i < arrayResultados.length(); i++) {
                System.out.println(objetoResultado);
                String mail = objetoResultado.getString("email");
                System.out.println(mail);
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
