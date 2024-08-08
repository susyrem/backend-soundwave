package com.soundwave.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.soundwave.app.model.User;
import com.soundwave.app.service.UserService;

@Configuration
public class SetUpApp implements CommandLineRunner {

	UserService userService;
	
	public SetUpApp(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		userService.createUser( new User(
				"Susy", 
				"3326077483", 
				"susy@gmail.com",
				null, 
				"12345678", 
				true
				));
		
		userService.createUser( new User(
				"Brenda", 
				"5528895645", 
				"brenda@gmail.com",
				null, 
				"12345678", 
				true
				));
		
		userService.createUser( new User(
				"Dulce", 
				"7291620564", 
				"Dulce@gmail.com",
				null, 
				"12345678", 
				true
				));
	}

}