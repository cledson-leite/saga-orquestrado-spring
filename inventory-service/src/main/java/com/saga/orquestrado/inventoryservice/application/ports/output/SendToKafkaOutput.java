package com.saga.orquestrado.inventoryservice.application.ports.output;

import com.saga.orquestrado.inventoryservice.application.core.domain.Sale;
import com.saga.orquestrado.inventoryservice.application.core.domain.enums.SaleEvent;

public interface SendToKafkaOutput {
    void send(Sale sale, SaleEvent event);
}
