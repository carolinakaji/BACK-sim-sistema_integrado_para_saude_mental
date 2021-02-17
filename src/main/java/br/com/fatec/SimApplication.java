package br.com.fatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SimApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimApplication.class, args);
	}

}
