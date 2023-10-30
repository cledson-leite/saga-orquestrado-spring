package com.saga.orquestrador.orquestradorservice.application.core.domain;

public class Inventory {
    private Integer id;
    private Integer productId;
    private Integer quantity;

    public Inventory() {
    }

    public Inventory(Integer id, Integer productId, Integer quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void debitQuantity(Integer quantity){
        this.quantity -= quantity;
    }

    public void creditQuantity(Integer quantity){
        this.quantity += quantity;
    }
}
