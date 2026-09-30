package com.nexacrm.nexa_java;

import com.nexacrm.nexa_java.model.Service;
import com.nexacrm.nexa_java.repository.ServiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NexaJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexaJavaApplication.class, args);
	}

	@Bean
	public CommandLineRunner testarBanco(ServiceRepository repo) {
		return args -> {
			Service s = new Service();
			s.setName("Corte de Cabelo");
			s.setPrice(50.0);
			s.setDurationMinutes(30);
			s.setActive(true);

			repo.save(s);
			System.out.println(">>> SALVO NO BANCO COM SUCESSO! ID: " + s.getId());
			System.out.println(">>> Total no banco: " + repo.count());
		};
	}
}