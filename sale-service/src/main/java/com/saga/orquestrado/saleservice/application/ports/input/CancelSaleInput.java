package com.saga.orquestrado.saleservice.application.ports.input;

import com.saga.orquestrado.saleservice.application.core.domain.Sale;

public interface CancelSaleInput {
    void cancel(Sale sale);
}
