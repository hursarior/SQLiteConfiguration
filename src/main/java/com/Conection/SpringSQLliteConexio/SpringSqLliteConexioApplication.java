package com.Conection.SpringSQLliteConexio;

import com.Conection.SpringSQLliteConexio.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class SpringSqLliteConexioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSqLliteConexioApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {

			userRepository.findAll().forEach( user ->{
				log.info(user.toString());
			});

		};
	}

}
