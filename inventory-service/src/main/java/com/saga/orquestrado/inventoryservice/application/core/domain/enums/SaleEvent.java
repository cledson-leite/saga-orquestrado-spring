package com.saga.orquestrado.inventoryservice.application.core.domain.enums;

public enum SaleEvent {
    PREPARE_INVENTORY,
    INVENTORY_PREPARED,
    EXECUTE_ROLLBACK,
    INVENTORY_ERROR
}
