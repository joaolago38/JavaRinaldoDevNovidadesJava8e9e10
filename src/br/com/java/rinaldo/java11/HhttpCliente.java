package br.com.java.rinaldo.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HhttpCliente {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpCliente =  HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.uol.com.br/")).GET().build();
        HttpResponse<String> response = httpCliente.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
