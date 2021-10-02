package com.cg.project.fooddeliveryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan("com.cg.project.fooddeliveryapp")
public class FooddeliveryappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooddeliveryappApplication.class, args);
	}

}
