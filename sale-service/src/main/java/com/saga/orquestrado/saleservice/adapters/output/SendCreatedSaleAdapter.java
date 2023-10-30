package com.saga.orquestrado.saleservice.adapters.output;

import com.saga.orquestrado.saleservice.adapters.output.message.SaleMessage;
import com.saga.orquestrado.saleservice.application.core.domain.Sale;
import com.saga.orquestrado.saleservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrado.saleservice.application.ports.output.SendCreatedSaleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCreatedSaleAdapter implements SendCreatedSaleOutput {
    @Autowired
    private KafkaTemplate<String, SaleMessage> kafkaTemplate;
    @Override
    public void send(Sale sale, SaleEvent event) {
        SaleMessage saleMessage = new SaleMessage(sale, event);
        kafkaTemplate.send("saga-orchestrator", saleMessage);
    }
}
