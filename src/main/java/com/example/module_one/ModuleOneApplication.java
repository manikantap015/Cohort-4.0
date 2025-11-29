package com.example.module_one;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ModuleOneApplication {
	public static void main(String[] args) {
		SpringApplication.run(ModuleOneApplication.class, args);
	}
}