package com.cotacao.cotacaofornecedor.vendedor.infra;

import org.springframework.stereotype.Repository;

import com.cotacao.cotacaofornecedor.vendedor.application.repository.VendedorRepository;
import com.cotacao.cotacaofornecedor.vendedor.domain.Vendedor;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VendedorInfraRepositoy implements VendedorRepository{

	private final VendedorSpringDataJPARepository vendedorSpringDataJPARepository;
	
	@Override
	public Vendedor salva(Vendedor vendedor) {
		log.info("[start] VendedorInfraRepositoy - salva");
		var tarefaSalva = vendedorSpringDataJPARepository.save(vendedor);
		log.info("[finish] VendedorInfraRepositoy - salva");
		return tarefaSalva ;
	}

}
