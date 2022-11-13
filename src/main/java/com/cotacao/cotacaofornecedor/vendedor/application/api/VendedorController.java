package com.cotacao.cotacaofornecedor.vendedor.application.api;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import com.cotacao.cotacaofornecedor.vendedor.application.service.VendedorService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Controller
@Log4j2
@RequiredArgsConstructor
public class VendedorController implements VendedorAPI {

	private final VendedorService vendedorService;

	@Override
	public VendedorResponse postVendedor(@Valid VendedorRequest vendedorRequest) {
		log.info("[start] VendedorController - postVendedor");
		VendedorResponse vendedorCriado = vendedorService.criaVendedor(vendedorRequest);
		log.info("[finish] VendedorController - postVendedor");
		return vendedorCriado;
	}

}
