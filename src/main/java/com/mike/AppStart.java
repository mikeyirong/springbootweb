package com.mike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration 
@ComponentScan
@MapperScan("com.mike.dao")
public class AppStart {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppStart.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(AppStart.class);
	}
}

