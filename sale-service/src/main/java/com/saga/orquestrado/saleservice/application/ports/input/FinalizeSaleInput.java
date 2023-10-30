package com.saga.orquestrado.saleservice.application.ports.input;

import com.saga.orquestrado.saleservice.application.core.domain.Sale;

public interface FinalizeSaleInput {
    void finalize(Sale sale);
}
