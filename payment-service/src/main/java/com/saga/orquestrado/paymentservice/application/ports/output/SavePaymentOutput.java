package com.saga.orquestrado.paymentservice.application.ports.output;

import com.saga.orquestrado.paymentservice.application.core.domain.Payment;

public interface SavePaymentOutput {
    void save(Payment payment);
}
