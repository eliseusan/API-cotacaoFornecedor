package com.cotacao.cotacaofornecedor.vendedor.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class VendedorResponse {
	private UUID idVendedor;
}
