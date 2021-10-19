package com.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test1Application {

	@GetMapping("/welcome")
	public String test(){
		return "welcome to zapcom pvt .ltd";
	}
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}
