package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderService03Application {
	@GetMapping("/")
	public String home() {
		System.out.println("하이");
		return "0810-1115";
	}
	public static void main(String[] args) {
		SpringApplication.run(OrderService03Application.class, args);
	}

}
