package edu.fra.uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.service.FirstService;
import edu.fra.uas.service.SecondService;
import edu.fra.uas.service.ThirdService;

@SpringBootApplication
public class SpringDependencyInjectionApplication {
	
	@Autowired
	private FirstService firstService;
	@Autowired
	private SecondService secondService;
	@Autowired
	private ThirdService thirdService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDependencyInjectionApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				//FirstService firstService = new FirstService();
				//firstService.doSomething();
				System.out.println("FirstService: " + firstService.useCount());
				System.out.println("SecondService: " + secondService.useCount());
				System.out.println("ThirdService: " + thirdService.useCount());
			}
		};
		return action;
	}

}
