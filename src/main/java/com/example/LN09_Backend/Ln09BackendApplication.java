package com.example.LN09_Backend;

import com.example.LN09_Backend.entity.User;
import com.example.LN09_Backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Ln09BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ln09BackendApplication.class, args);
    }

}
//
//@SpringBootApplication
//public class Ln09BackendApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication.run(Ln09BackendApplication.class, args);
//	}
//
//	    @Autowired
//		UserRepository userRepository;
//    @Autowired
//	PasswordEncoder passwordEncoder;
//
//	@Override
//    public void run(String... args) throws Exception {
//        // Khi chương trình chạy
//        // Insert vào csdl một user.
//        User user = new User();
//        user.setUsername("admin");
//        user.setPassword(passwordEncoder.encode("123"));
//        userRepository.save(user);
//        System.out.println(user);
//    }
//}
