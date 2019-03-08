package com.example.springboot_test_3;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@RestController
@MapperScan("com.example.springboot_test_3.dao")
public class SpringbootTest3Application {
    @Autowired
    private DiscoveryClient discoveryClient;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest3Application.class, args);
	}

    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String application_name;
    
    @RequestMapping("/hi")
    public String sayHi(String name){
        return "hi:" + port + ";name:"+name;
    }
    @RequestMapping("/actuator/info")
    public List<ServiceInstance> serviceInstancesByApplicationName() {
        return this.discoveryClient.getInstances(application_name);
    }


}
