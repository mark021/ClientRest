package ml;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


public class DeleteExample {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        // URL with URI-variable
        String resourceUrl = "http://localhost:8080/employee/{empNo}";

        // Object[] uriValues = new Object[]{"E01"};

        Map<String, String> params = new HashMap<String, String>();
        params.put("empNo", "E01");

        // Send request with DELETE method.
        restTemplate.delete(resourceUrl, params);

        Employee e = restTemplate.getForObject(resourceUrl, Employee.class , params);

        if (e != null) {
            System.out.println("(Client side) Employee after delete: ");
            System.out.println("Employee: " + e.getEmpNo() + " - " + e.getEmpName());
        } else {
        }
        System.out.println("Employee not found!");
    }
}




