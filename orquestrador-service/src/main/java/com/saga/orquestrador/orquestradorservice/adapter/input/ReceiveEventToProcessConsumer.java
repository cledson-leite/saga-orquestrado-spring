package com.saga.orquestrador.orquestradorservice.adapter.input;

import com.saga.orquestrador.orquestradorservice.adapter.output.message.SaleMessage;
import com.saga.orquestrador.orquestradorservice.application.core.domain.Sale;
import com.saga.orquestrador.orquestradorservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrador.orquestradorservice.application.ports.input.WorkFlowInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;
@Slf4j
@Component
public class ReceiveEventToProcessConsumer {
    @Autowired
    private List<WorkFlowInput> workflows;

    @KafkaListener(topics = "saga-orchestrator", groupId = "orquestrator")
    public void receive(SaleMessage msg){
        WorkFlowInput wokflow = workflows.stream()
                .filter(flow -> flow.isCalledByEvent(msg.getEvent()))
                .findFirst()
                .orElse(null);
        if (wokflow != null) {
            wokflow.execute(msg.getSale());
        }else {
            log.error("Evento não encontrado");
        }
    }
}
