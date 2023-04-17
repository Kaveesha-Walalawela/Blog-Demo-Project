package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println(" -----This App is running----- ");
	}

}



// -----------------------------------------------------------------------------------
//@SpringBootApplication
//public class DemoApplication implements CommandLineRunner {
//	@Autowired
//	PasswordEncoder passwordEncoder;
//	@Autowired
//	UserRepository userRepository;
//	public static void main(String[] args) {
//
//		SpringApplication.run(DemoApplication.class, args);
//
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		User admin = new User();
//		admin.setUsername("admin");
//		admin.setPassword(passwordEncoder.encode("password"));
//		admin.setRoles(Collections.singleton("ROLE_ADMIN"));
//		userRepository.save(admin);
//
//		User user = new User();
//		user.setUsername("user");
//		user.setPassword(passwordEncoder.encode("password"));
//		user.setRoles(Collections.singleton("ROLE_USER"));
//		userRepository.save(user);
//	}
//
//
//}

//hardcoded
