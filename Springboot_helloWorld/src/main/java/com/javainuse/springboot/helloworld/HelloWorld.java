package com.javainuse.springboot.helloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/abc")
	public String getHelloWorld()
	{
		return ("Hello World");
	}
}
