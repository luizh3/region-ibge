/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.region.http.request;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author Luiz_
 */
public class ClientHttp {
    
    public static String httpGet( final String url ){
        
        try{
            
            final URI endereco = URI.create(url);
            final HttpClient client = HttpClient.newHttpClient();
            final HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
            final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                        
            return response.body();
            
        } catch (IOException | InterruptedException ex){
            throw new RuntimeException(ex);
        }
        
    }
    
}
