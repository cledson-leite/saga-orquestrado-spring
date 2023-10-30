package com.saga.orquestrador.orquestradorservice.application.ports.output;

import com.saga.orquestrador.orquestradorservice.application.core.domain.Sale;
import com.saga.orquestrador.orquestradorservice.application.core.domain.enums.SaleEvent;

public interface SendToKafkaOutput {
    void send(Sale sale, SaleEvent event, String topic);
}
