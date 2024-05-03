package org.example.services;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.example.entities.Moneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class Consulta {
    String Apikey = "a58a3e3f6b2320d4e3949572";
    String Url="https://v6.exchangerate-api.com/v6/";

    public Moneda ConsultaMoneda(String moneda1, String moneda2) {
        URI direccion = URI.create(Url+Apikey+"/pair/"+moneda1+"/"+moneda2);
       HttpClient client = HttpClient.newHttpClient();
       HttpRequest request= HttpRequest.newBuilder().uri(direccion).build();


       try {
           HttpResponse<String> response = null;
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        }catch (Exception e) {
            throw new RuntimeException("No encontré esa conversion");
        }


    }
}
