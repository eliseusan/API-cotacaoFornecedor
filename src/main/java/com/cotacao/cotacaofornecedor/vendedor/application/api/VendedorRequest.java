package com.cotacao.cotacaofornecedor.vendedor.application.api;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Value;
@Value
public class VendedorRequest {
	@Column(unique = true)
	private String nomeVendedor;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotBlank
	private String telefone;
	@Column(unique = true)
	private String cpf ;
}
