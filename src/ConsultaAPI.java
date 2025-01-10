import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    public Moneda consultaMoneda(String moneda1, String moneda2, float monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a3c8d824a34829dd85a830d3/pair/" + moneda1 + "/" + moneda2 + "/" + monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            if (jsonResponse.has("error-type")) {
                return null;
            }

            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            System.out.println("Error al consultar la API...");
            return null;
        }
    }
}
