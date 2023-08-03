package com.mindhubap.clasesyobjetos;

import com.mindhubap.clasesyobjetos.models.Person;
import com.mindhubap.clasesyobjetos.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;


@SpringBootApplication
public class ClasesyobjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClasesyobjetosApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(PersonRepository personRepository){
		return args -> {

			Person person = new Person("Guillermo", "Mentor");
			System.out.println(person);
			personRepository.save(person);
			System.out.println(person);
		};
	}
}
