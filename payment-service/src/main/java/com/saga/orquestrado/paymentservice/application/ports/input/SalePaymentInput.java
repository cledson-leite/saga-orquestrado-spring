package com.saga.orquestrado.paymentservice.application.ports.input;

import com.saga.orquestrado.paymentservice.application.core.domain.Sale;

public interface SalePaymentInput {
    void payment(Sale sale);
}
