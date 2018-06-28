package com.simplus.gestao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

	====== PROVA DE CONCEITO =======
	API:
	Spring Boot, Hibernate, REST, Angular 6, JWT, S3, MySQL
	openjdk version "1.8.0_171"
    OpenJDK Runtime Environment (build 1.8.0_171-8u171-b11-0ubuntu0.18.04.1-b11)
    OpenJDK 64-Bit Server VM (build 25.171-b11, mixed mode)
	@ José R F Junior

*/

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
	}	
}
