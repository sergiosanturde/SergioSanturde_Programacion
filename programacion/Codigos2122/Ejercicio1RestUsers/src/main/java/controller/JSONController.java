package controller;

import model.Genero;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class JSONController {

    public void restUsers(int nUSer,Genero genero){

        String urlString = "https://randomuser.me/api/?results=" + nUSer + "&gender=" + genero;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();


            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = null;

            while ((linea=bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray array = responseJSON.getJSONArray("results");

            for (int i = 0; i < array.length(); i++) {
                JSONObject mostrar =array.getJSONObject(i);

                System.out.println(mostrar.getJSONObject("name"));
                System.out.println(mostrar.getJSONObject("location").getString("country"));
                System.out.println(mostrar.getJSONObject("location").getString("city"));
                System.out.println(mostrar.getString("email"));
                System.out.println(mostrar.getJSONObject("picture"));


            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
