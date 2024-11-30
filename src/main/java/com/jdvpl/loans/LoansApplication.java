package com.jdvpl.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(title = "Loans microservice REST API Documentation", description = "Easy Loans microservice REST API Documentation", version = "v1", contact = @Contact(name = "Juan Daniel Suarez", email = "juanda554242@gmail.com", url = "https://portfolio-jdvpl.vercel.app/"), license = @License(name = "Apache 2.0", url = "https://portfolio-jdvpl.vercel.app/")), externalDocs = @ExternalDocumentation(description = "EasyBanck Loans microservice REST API Documentation"))
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
