package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coforge.entity.person;
import com.coforge.service.personService;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
	@Autowired
	personService service;
	
	@Override
	public void run(String... args) throws Exception{
		person p1=new person(1001,"mukul sharma",30000.0f);
		person p2=new person(1002,"trilok chauhan",30000.0f);
		person p3=new person(1003,"rohit azad",30000.0f);
	}

}

