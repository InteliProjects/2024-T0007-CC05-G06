package br.edu.inteli.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de inicialização da aplicação Spring Boot.
 */
@SpringBootApplication
public class BackendApplication {

	/**
	 * Método principal para iniciar a aplicação Spring Boot.
	 * @param args os argumentos de linha de comando
	 */
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
