package com.saga.orquestrador.orquestradorservice.application.core.usecase;

import com.saga.orquestrador.orquestradorservice.application.core.domain.Sale;
import com.saga.orquestrador.orquestradorservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrador.orquestradorservice.application.ports.input.WorkFlowInput;
import com.saga.orquestrador.orquestradorservice.application.ports.output.SendToKafkaOutput;

public class InventoryPreparedUseCase implements WorkFlowInput {
    private final SendToKafkaOutput kafka;

    public InventoryPreparedUseCase(SendToKafkaOutput kafka) {
        this.kafka = kafka;
    }

    @Override
    public void execute(Sale sale) {
        this.kafka.send(sale, SaleEvent.EXECUTE_PAYMENT, "saga-payment");
    }

    @Override
    public boolean isCalledByEvent(SaleEvent event) {
        return SaleEvent.INVENTORY_PREPARED.equals(event);
    }
}
