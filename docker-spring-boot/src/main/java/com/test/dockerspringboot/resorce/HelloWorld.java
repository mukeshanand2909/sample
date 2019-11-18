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
		return "Hello World";
	}

}
