package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commoandLineRunner(StudentRepository repository) {
		return args -> {
			Student mariam = new Student(
					"Mariam",
					"mariam@gamil.com",
					LocalDate.of(2022, 1, 1)
					);
			
			Student alex = new Student(
					"Alex",
					"alex@gamil.com",
					LocalDate.of(2002, 8, 7)
					);
			
			repository.saveAll(List.of(mariam, alex));
			
		};
	}

}
