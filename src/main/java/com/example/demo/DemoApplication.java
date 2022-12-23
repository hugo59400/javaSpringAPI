package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
// import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;




//  @Import(SwaggerDocumentationConfig.class)

@SpringBootApplication
@EnableSwagger2
// @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class}) // permet de supprimer erreur white label 

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
