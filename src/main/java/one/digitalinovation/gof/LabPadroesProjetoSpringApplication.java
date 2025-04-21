package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*	
 * Projeto Spring Boot gerado via Spring Initializr
 * https://start.spring.io/
 * Os seguintes módulos foram adicionados:
 * - Spring Web
 * - Spring Data JPA
 * - H2 Database
 * - OpenFeign
 * 
 * @autor marcos.prado
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
