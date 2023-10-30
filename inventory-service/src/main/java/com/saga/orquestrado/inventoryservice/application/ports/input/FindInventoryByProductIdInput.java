package com.saga.orquestrado.inventoryservice.application.ports.input;

import com.saga.orquestrado.inventoryservice.application.core.domain.Inventory;

public interface FindInventoryByProductIdInput {
    Inventory find(Integer productId);
}
