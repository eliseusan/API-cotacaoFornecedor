package com.cotacao.cotacaofornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CotacaoFornecedorApplication {

	@GetMapping
	public String TesteApi() {
		return "TESTE OK" ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CotacaoFornecedorApplication.class, args);
	}

}
