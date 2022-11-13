package com.cotacao.cotacaofornecedor.vendedor.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.cotacao.cotacaofornecedor.vendedor.application.api.VendedorRequest;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idVendedor", updatable = false, unique = true, nullable = false)
	private UUID idVendedor;
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
	private LocalDateTime dataHoraDoCadastro ;
	private LocalDateTime dataHoraDaUltimaAlteracao ;
	
	public Vendedor(@Valid VendedorRequest vendedorRequest) {
		this.nomeVendedor = vendedorRequest.getNomeVendedor();
		this.email = vendedorRequest.getEmail();
		this.telefone = vendedorRequest.getTelefone();
		this.cpf = vendedorRequest.getCpf();
		this.dataHoraDoCadastro =LocalDateTime.now();
	}

	
	
	
	
}
