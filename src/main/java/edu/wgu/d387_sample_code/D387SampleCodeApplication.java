package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);


	WelcomeMessage englishMessage = new WelcomeMessage(Locale.US);
	Thread englishThread = new Thread(englishMessage);
	englishThread.start();

	WelcomeMessage frenchMessage = new WelcomeMessage(Locale.CANADA_FRENCH);
	Thread frenchThread = new Thread(frenchMessage);
	frenchThread.start();


	}
}

//Comment to test Git connection