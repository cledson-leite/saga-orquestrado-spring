package com.saga.orquestrado.inventoryservice.application.ports.input;

import com.saga.orquestrado.inventoryservice.application.core.domain.Sale;

public interface DebitInventoryInput {
    void debit(Sale sale);
}
