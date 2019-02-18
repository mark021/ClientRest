package ml;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class GetExample2 {

    static final String URL_EMPLOYEES = "http://localhost:8080/employee/{empNo}";

    static final String URL_EMPLOYEES_XML = "http://localhost:8080/employee/{empNo}.xml";
    static final String URL_EMPLOYEES_JSON = "http://localhost:8080/employee/{empNo}.json";

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> params = new HashMap<String, String>();
        params.put("empNo", "E01");

        // Send request with GET method and default Headers.
        Employee result = restTemplate.getForObject(URL_EMPLOYEES, Employee.class, params);

        System.out.println(result);
    }

}
