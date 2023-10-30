package com.saga.orquestrado.inventoryservice.application.ports.output;

import com.saga.orquestrado.inventoryservice.application.core.domain.Inventory;

public interface UpdateInventoryOutput {
    void update(Inventory inventory);
}
