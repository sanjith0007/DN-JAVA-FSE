import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class HTTPClientAPI {

    public static void main(String[] args)
        throws Exception {

    HttpClient webClient =
        HttpClient.newHttpClient();

    HttpRequest apiRequest =
        HttpRequest.newBuilder()
            .uri(
                URI.create(
                    "https://api.github.com"))
            .build();

    HttpResponse apiResponse =
        webClient.send(
            apiRequest,
            HttpResponse.BodyHandlers.ofString());

    System.out.println(
        apiResponse.statusCode());

    System.out.println(
        apiResponse.body());
    }
}

/*
Output:
200
{JSON Response}
*/