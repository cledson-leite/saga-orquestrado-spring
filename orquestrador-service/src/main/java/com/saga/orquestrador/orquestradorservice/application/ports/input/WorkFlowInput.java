package com.saga.orquestrador.orquestradorservice.application.ports.input;

import com.saga.orquestrador.orquestradorservice.application.core.domain.Sale;
import com.saga.orquestrador.orquestradorservice.application.core.domain.enums.SaleEvent;

public interface WorkFlowInput {
    void execute(Sale sale);

    boolean isCalledByEvent(SaleEvent event);
}
