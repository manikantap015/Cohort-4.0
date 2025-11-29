package com.example.module_one;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootCohortApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCohortApplication.class, args);
	}
}