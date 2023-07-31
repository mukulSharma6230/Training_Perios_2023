package com.example.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "employee-service")
@Profile(value="dev")
public class Employee {

	private int id;
	private String name;

}