package com.flyhub.ideamanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.flyhub.ideamanagementsystem.entity.User;
import com.flyhub.ideamanagementsystem.repository.UserRepository;

@SpringBootApplication
public class IdeamanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdeamanagementsystemApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {

		return args -> {
			User user = new User("dan", "rihard", "tim");

			userRepository.save(user);
			
			 user = new User("Debbie", "Tom", "Edgar");
			 userRepository.save(user);
		
		};

	}
}
