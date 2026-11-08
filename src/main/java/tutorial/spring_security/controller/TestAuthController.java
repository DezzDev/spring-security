package tutorial.spring_security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping("/auth")
public class TestAuthController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hello world";
	}
	
	@GetMapping("/hello-secured")
	public String getHelloSecured() {
		return "Hello world secured";
	}
	
}
