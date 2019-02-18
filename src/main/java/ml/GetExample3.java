package ml;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class GetExample3 {


    static final String URL_EMPLOYEES = "http://localhost:8080/employee/{empNo}";

    static final String URL_EMPLOYEES_XML = "http://localhost:8080/employee/{empNo}.xml";
    static final String URL_EMPLOYEES_JSON = "http://localhost:8080/employee/{empNo}.json";

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> params = new HashMap<String, String>();
        params.put("empNo", "E01");

        // Send request with GET method and default Headers.

        ResponseEntity<Employee> resp = restTemplate.getForEntity( URL_EMPLOYEES, Employee.class, params);


        if (resp.getStatusCode() == HttpStatus.OK) {

            System.out.println(resp.getStatusCode());
            System.out.println(resp.toString());
            System.out.println(resp.getBody());
        }
    }
}