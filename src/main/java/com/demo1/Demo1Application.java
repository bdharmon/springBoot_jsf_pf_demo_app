package com.demo1;

import com.demo1.entity.UserAccount;
import com.demo1.repository.UserAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserAccountRepository userAccountRepository) {
		return (args) -> {
			UserAccount user1 = new UserAccount("john", new BCryptPasswordEncoder().encode("test123"), "john@email.com");
			UserAccount user2 = new UserAccount("bill", new BCryptPasswordEncoder().encode("test123"), "bill@email.com");
			UserAccount user3 = new UserAccount("zack", new BCryptPasswordEncoder().encode("test123"), "zack@email.com");

			userAccountRepository.saveAll(List.of(user1, user2, user3));

			for (UserAccount userAccount : userAccountRepository.findAll()) {
				System.out.println(userAccount);
			}
		};
	}

}
