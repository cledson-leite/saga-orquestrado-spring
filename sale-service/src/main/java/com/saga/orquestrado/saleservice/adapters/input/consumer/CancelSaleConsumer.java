package com.saga.orquestrado.saleservice.adapters.input.consumer;

import com.saga.orquestrado.saleservice.adapters.output.message.SaleMessage;
import com.saga.orquestrado.saleservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrado.saleservice.application.ports.input.CancelSaleInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CancelSaleConsumer {

    @Autowired
    private CancelSaleInput cancelSaleInput;

    @KafkaListener(topics = "sage-sale", groupId = "sale-cancel")
    public void receive(SaleMessage saleMessage){
        if(SaleEvent.CANCELED_SALE.equals(saleMessage.getEvent())){
            log.info("Iniciando estorno da venda ...");
            cancelSaleInput.cancel(saleMessage.getSale());
            log.info("Venda estornada!");
        }
    }
}
