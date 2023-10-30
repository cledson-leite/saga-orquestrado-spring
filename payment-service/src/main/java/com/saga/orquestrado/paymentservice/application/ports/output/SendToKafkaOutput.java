package com.saga.orquestrado.paymentservice.application.ports.output;

import com.saga.orquestrado.paymentservice.application.core.domain.Sale;
import com.saga.orquestrado.paymentservice.application.core.domain.enums.SaleEvent;

public interface SendToKafkaOutput {
    void send(Sale sale, SaleEvent event);
}
