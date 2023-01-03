package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/*
		SpringApplication app = new SpringApplication(DemoApplication.class);
		//SpringApplication.run(DemoApplication.class, args);
		String port = "8080";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		
		if(cliOpts.containsOption("port") && cliOpts.getOptionValues("port").get(0) != null) {
			port = cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(
			Collections.singletonMap("server.port", port)
		);

		System.out.printf("Application started on port %d", port);
		app.run(args);
 */
		SpringApplication.run(DemoApplication.class, args);
	}

}
