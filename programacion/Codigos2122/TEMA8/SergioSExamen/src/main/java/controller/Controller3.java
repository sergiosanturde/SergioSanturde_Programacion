package controller;

import model.Peliculas;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConne.ction;
import java.net.URL;
import java.util.ArrayList;


public class Controller3 {

    private ArrayList<Peliculas> lista;


    public void cartelera(String urlString){
        if(lista==null){
            lista = new ArrayList<>();
        }
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;
            String linkIMG = "https://image.tmdb.org/t/p/w500/";

            while ((linea = bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray arrayResultados = responseJSON.getJSONArray("results");

            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                String titulo, fechaLanzamiento, descripcion, poster;

                titulo = objetoResultado.getString("original_title");

                descripcion = objetoResultado.getString("overview");

                fechaLanzamiento = objetoResultado.getString("release_date");

                poster = linkIMG + objetoResultado.getString("poster_path");


                System.out.println("Titulo: " + titulo);
                System.out.println("Descripcion: " + descripcion);
                System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
                System.out.println("Poster: " + poster);
                System.out.println("------------------------------------");
                lista.add(new Peliculas(titulo,fechaLanzamiento,descripcion,poster));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void proximamente(File file){
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    }
}
