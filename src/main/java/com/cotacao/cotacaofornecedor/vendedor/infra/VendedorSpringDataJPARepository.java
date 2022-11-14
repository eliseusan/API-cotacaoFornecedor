package com.cotacao.cotacaofornecedor.vendedor.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cotacao.cotacaofornecedor.vendedor.domain.Vendedor;

public interface VendedorSpringDataJPARepository extends JpaRepository<Vendedor, UUID>{

}
