package com.example.DAY_1NAME;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Name {
	@GetMapping("/Welcome")
public String display()
{
		String name="IamNeo" ;
		return "Welcome "+name+"!";
}
}
