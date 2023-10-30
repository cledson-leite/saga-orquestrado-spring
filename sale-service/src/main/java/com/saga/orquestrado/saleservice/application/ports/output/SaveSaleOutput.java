package com.saga.orquestrado.saleservice.application.ports.output;

import com.saga.orquestrado.saleservice.application.core.domain.Sale;

public interface SaveSaleOutput {
    Sale save(Sale sale);
}
