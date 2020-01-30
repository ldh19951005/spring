package cn.ordinary.study.ribboncustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ordinary
 * @date 2020/1/29
 */
@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon-customer")
    public String helloCustomer() {
        return restTemplate.getForEntity("http://service-client/hello/", String.class).getBody();
    }
}
