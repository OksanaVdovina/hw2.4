package skypro.hw24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		boolean result = Validator.validate("java_skyprogo","D_1hWiKjjP_9", "D_1hWiKjjP_9");
		if (result) {
			System.out.println("Данные корректны");
		} else {
			System.out.println("Данные НЕ корректны");
		}
	}

}
