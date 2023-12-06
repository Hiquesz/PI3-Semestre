package com.fatecpi3sem.academiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
public class AcademiapiApplication {

	//@RequestMapping("/")
	//String home() {
	//	return "<h1>Estou escrevendo HTML</h1>"
	//			+ "<h2>Java é muito divertido</h2>"
	//			+ "<p>Isso aqui não é muito seguro</p>"
	//			+ "<p>Mais uma linha</p>"
	//			+ "<hr><h3>Seguinte dá pra botar o arquivo aqui como uma string, muito mais fácil</h3>";
	//}
	
	public static void main(String[] args) {
		SpringApplication.run(AcademiapiApplication.class, args);
	}
}