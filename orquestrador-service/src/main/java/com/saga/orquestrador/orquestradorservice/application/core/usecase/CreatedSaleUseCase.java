package com.saga.orquestrador.orquestradorservice.application.core.usecase;

import com.saga.orquestrador.orquestradorservice.application.core.domain.Sale;
import com.saga.orquestrador.orquestradorservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrador.orquestradorservice.application.ports.input.WorkFlowInput;
import com.saga.orquestrador.orquestradorservice.application.ports.output.SendToKafkaOutput;

public class CreatedSaleUseCase implements WorkFlowInput {
    private final SendToKafkaOutput kafka;

    public CreatedSaleUseCase(SendToKafkaOutput kafka) {
        this.kafka = kafka;
    }

    @Override
    public void execute(Sale sale) {
        this.kafka.send(sale, SaleEvent.PREPARE_INVENTORY, "saga-inventory");
    }

    @Override
    public boolean isCalledByEvent(SaleEvent event) {
        return SaleEvent.CREATED_SALE.equals(event);
    }
}
