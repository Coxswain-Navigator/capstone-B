package com.valencia.edfform;

import com.valencia.edfform.Services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//exclude = {DataSourceAutoConfiguration.class }
@SpringBootApplication
public class EdfApplication {

	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EdfApplication.class, args);
	}


}
