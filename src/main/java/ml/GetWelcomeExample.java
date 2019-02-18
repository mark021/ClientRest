package ml;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class GetWelcomeExample {

    static final String URL_EMPLOYEES = "http://localhost:8080/welcome";



    public static void main(String[] args) {

        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));


        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);


        RestTemplate restTemplate = new RestTemplate();

        // Send request with GET method and default Headers.
        String result = restTemplate.getForObject(URL_EMPLOYEES, String.class);

        System.out.println(result);
    }

}
