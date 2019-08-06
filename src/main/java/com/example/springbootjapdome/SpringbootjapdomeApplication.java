package com.example.springbootjapdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class SpringbootjapdomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjapdomeApplication.class, args);
	}

}
