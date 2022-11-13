package com.cotacao.cotacaofornecedor.fornecedor.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Empresa {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(columnDefinition = "uuid", name = "idEmpresa", updatable = false, unique = true, nullable = false)
		private UUID idEmpresa;
		@NotBlank
		private String razaoSocial;
		@NotBlank
		@Column(unique = true)
		private UUID idVendedor;
		@NotBlank
		@Email
		@Column(unique = true)
		private String email ;
		@NotBlank
		private String telefone ;
		@Column(unique = true)
		private String cnpj ;
		private LocalDateTime dataHoraDoCadastro ;
		private LocalDateTime dataHoraDaUltimaAlteracao ;
}
