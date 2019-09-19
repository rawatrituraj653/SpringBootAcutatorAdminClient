package com.rj.act;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootAcutatorAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAcutatorAdminClientApplication.class, args);
	}

}
@RestController
class BookRest{
	
	@GetMapping("/my")
	public String getMapping() {
		
		
		return "Hello From Admin Client::"+LocalDateTime.now();
	}
	
	
}  
