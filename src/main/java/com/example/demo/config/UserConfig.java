package com.example.demo.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Configuration
public class UserConfig {

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return Args -> {
			User johnson = new User(
					"Johnson",
					"Chen",
					"johnson@gmail.com",
					27
					);
			User albert = new User(
					"Albert",
					"Leung",
					"leung@gmail.com",
					28
					);
			User till = new User(
					"Till",
					"Lin",
					"ktl@gmail.com",
					29
					);
			userRepository.saveAll(List.of(johnson, albert, till));
		};
	}
}
