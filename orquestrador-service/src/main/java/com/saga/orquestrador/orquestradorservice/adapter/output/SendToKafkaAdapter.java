package com.saga.orquestrador.orquestradorservice.adapter.output;

import com.saga.orquestrador.orquestradorservice.adapter.output.message.SaleMessage;
import com.saga.orquestrador.orquestradorservice.application.core.domain.Sale;
import com.saga.orquestrador.orquestradorservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrador.orquestradorservice.application.ports.output.SendToKafkaOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendToKafkaAdapter implements SendToKafkaOutput {
    @Autowired
    private KafkaTemplate<String, SaleMessage> kafkaTemplate;
    @Override
    public void send(Sale sale, SaleEvent event, String topic) {
        SaleMessage msg = new SaleMessage(sale, event);
        kafkaTemplate.send(topic, msg);
    }
}
