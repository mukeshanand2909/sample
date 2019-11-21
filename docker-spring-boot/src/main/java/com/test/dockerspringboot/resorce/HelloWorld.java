package com.test.dockerspringboot.resorce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/helloworld")
public class HelloWorld {
	
	@GetMapping
	public String Hello()
	{
		System.out.println("Added the two number ");
		return "Hello World Example 1234567 ";
	}

}
