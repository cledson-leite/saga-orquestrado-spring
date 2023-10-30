package com.saga.orquestrado.saleservice.application.ports.output;

import com.saga.orquestrado.saleservice.application.core.domain.Sale;

import java.util.Optional;

public interface FindSaleByIdOutput {
    Optional<Sale> find(final Integer id);
}
