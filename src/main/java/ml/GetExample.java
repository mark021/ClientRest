package ml;

import org.springframework.web.client.RestTemplate;

public class GetExample {

    static final String URL_EMPLOYEES = "http://localhost:8080/employees";

    static final String URL_EMPLOYEES_XML = "http://localhost:8080/employees.xml";
    static final String URL_EMPLOYEES_JSON = "http://localhost:8080/employees.json";

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        // Send request with GET method and default Headers.
        String result = restTemplate.getForObject(URL_EMPLOYEES, String.class);

        System.out.println(result);
    }

}
