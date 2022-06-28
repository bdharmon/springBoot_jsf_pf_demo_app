package com.demo1;

import com.demo1.entity.UserAccount;
import com.demo1.repository.UserAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserAccountRepository userAccountRepository) {
		return (args) -> {
			List<UserAccount> myList = new ArrayList<>();
			for (int i = 0; i <= 10000; i++) {
				UserAccount user1 = new UserAccount(String.format("user_%s", i), new BCryptPasswordEncoder().encode("test123"), String.format("user_%s@email.com", i));
				myList.add(user1);
			}
			System.out.println(myList);
			userAccountRepository.saveAll(myList);

//			UserAccount user1 = new UserAccount("john", new BCryptPasswordEncoder().encode("test123"), "john@email.com");
//			UserAccount user2 = new UserAccount("bill", new BCryptPasswordEncoder().encode("test123"), "bill@email.com");
//			UserAccount user3 = new UserAccount("zack", new BCryptPasswordEncoder().encode("test123"), "zack@email.com");

//			userAccountRepository.saveAll(List.of(user1, user2, user3));

//			for (UserAccount userAccount : userAccountRepository.findAll()) {
//				System.out.println(userAccount);
//			}
		};
	}

}
