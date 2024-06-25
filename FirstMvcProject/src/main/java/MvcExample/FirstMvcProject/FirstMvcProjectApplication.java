package MvcExample.FirstMvcProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstMvcProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con= SpringApplication.run(FirstMvcProjectApplication.class, args);
	}

}
