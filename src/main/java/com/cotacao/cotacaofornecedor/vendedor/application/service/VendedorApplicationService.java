package com.cotacao.cotacaofornecedor.vendedor.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cotacao.cotacaofornecedor.vendedor.application.api.VendedorRequest;
import com.cotacao.cotacaofornecedor.vendedor.application.api.VendedorResponse;
import com.cotacao.cotacaofornecedor.vendedor.application.repository.VendedorRepository;
import com.cotacao.cotacaofornecedor.vendedor.domain.Vendedor;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class VendedorApplicationService implements VendedorService {
	
	private final VendedorRepository vendedorRepository;
	
	@Override
	public VendedorResponse criaVendedor(@Valid VendedorRequest vendedorRequest) {
		log.info("[start] VendedorApplicationService - criaVendedor");
		Vendedor vendedor= vendedorRepository.salva(new Vendedor(vendedorRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		
		return VendedorResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
		log.info("[finish] VendedorApplicationService - criaVendedor");
		return null;
	}

}
