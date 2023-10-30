package com.saga.orquestrador.orquestradorservice.application.core.domain.enums;

public enum SaleEvent {
    CREATED_SALE,
    FINALIZED_SALE,
    CANCELED_SALE,
    PREPARE_INVENTORY,
    INVENTORY_PREPARED,
    EXECUTE_ROLLBACK,
    INVENTORY_ERROR,
    EXECUTE_PAYMENT,
    PAYMENT_EXECUTED,
    PAYMENT_FAILED
}
