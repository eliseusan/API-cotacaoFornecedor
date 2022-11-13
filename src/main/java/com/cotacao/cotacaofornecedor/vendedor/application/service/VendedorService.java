package com.cotacao.cotacaofornecedor.vendedor.application.service;

import javax.validation.Valid;

import com.cotacao.cotacaofornecedor.vendedor.application.api.VendedorRequest;
import com.cotacao.cotacaofornecedor.vendedor.application.api.VendedorResponse;

public interface VendedorService {

	VendedorResponse criaVendedor(@Valid VendedorRequest vendedorRequest);

}
