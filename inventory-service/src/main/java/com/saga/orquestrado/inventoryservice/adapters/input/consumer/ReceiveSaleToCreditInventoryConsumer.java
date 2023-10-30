package com.saga.orquestrado.inventoryservice.adapters.input.consumer;

import com.saga.orquestrado.inventoryservice.adapters.output.message.SaleMessage;
import com.saga.orquestrado.inventoryservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrado.inventoryservice.application.ports.input.CreditInventoryInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReceiveSaleToCreditInventoryConsumer {

    @Autowired
    private CreditInventoryInput creditInventoryInput;

    @KafkaListener(topics = "saga-inventory", groupId = "inventory-credit")
    public void received(SaleMessage saleMessage){
        if (SaleEvent.EXECUTE_ROLLBACK.equals(saleMessage.getEvent())){
            log.info("Iniciando estorno da mercadoria ...");
            creditInventoryInput.credit(saleMessage.getSale());
            log.info("Mercadoria retornada ao estoque");
        }
    }
}
