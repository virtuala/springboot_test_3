package com.example.springboot_test_3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_test_3.dao")
public class SpringbootTest3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest3Application.class, args);
	}

}
