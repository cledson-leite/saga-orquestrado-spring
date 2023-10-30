package com.saga.orquestrado.paymentservice.adapter.input.consumer;

import com.saga.orquestrado.paymentservice.adapter.output.message.SaleMessage;
import com.saga.orquestrado.paymentservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrado.paymentservice.application.ports.input.SalePaymentInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReceiveSaleToPaymentConsumer {

    @Autowired
    private SalePaymentInput salePaymentInput;

    @KafkaListener(topics = "saga-payment", groupId = "payment")
    public void receive(SaleMessage saleMessage){
        if(SaleEvent.EXECUTE_PAYMENT.equals(saleMessage.getEvent())){
            log.info("Iniciando pagamento ...");
            salePaymentInput.payment(saleMessage.getSale());
            log.info("Pagamento realizado!");
        }
    }
}
