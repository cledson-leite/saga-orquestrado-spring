package com.saga.orquestrado.saleservice.application.ports.output;

import com.saga.orquestrado.saleservice.application.core.domain.Sale;
import com.saga.orquestrado.saleservice.application.core.domain.enums.SaleEvent;

public interface SendCreatedSaleOutput {
    void send(Sale sale, SaleEvent event);
}
