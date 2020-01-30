package cn.ordinary.study.eurekaclients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientsApplication.class, args);
    }

}
