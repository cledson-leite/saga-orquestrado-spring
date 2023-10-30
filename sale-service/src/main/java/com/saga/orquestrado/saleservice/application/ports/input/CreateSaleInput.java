package com.saga.orquestrado.saleservice.application.ports.input;

import com.saga.orquestrado.saleservice.application.core.domain.Sale;

public interface CreateSaleInput {
    void create(Sale sale);
}
