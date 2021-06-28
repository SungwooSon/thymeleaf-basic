package hello.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafBasicApplication {

	public static void main(String[] args) {
		System.out.println("say hi ");
		SpringApplication.run(ThymeleafBasicApplication.class, args);
	}

}
