package com.example.springbootjapdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@EnableAutoConfiguration
@SpringBootApplication

public class SpringbootjapdomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjapdomeApplication.class, args);
	}

}
