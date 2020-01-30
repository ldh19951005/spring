package cn.ordinary.study.eurekaclients.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ordinary
 * @date 2020/1/29
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Registration registration;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String hello() {
        ServiceInstance serviceInstance = serviceInstance();
        LOGGER.info("hello ,host:" + serviceInstance.getHost() + ",serviceID:" + serviceInstance.getServiceId());
        return "hello";
    }

    public ServiceInstance serviceInstance() {
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(registration.getServiceId());
        if (serviceInstances != null && serviceInstances.size() > 0) {
            for (ServiceInstance serviceInstance : serviceInstances) {
                if (serviceInstance.getPort() == 1112) {
                    return serviceInstance;
                }
            }
        }
        return null;
    }
}
