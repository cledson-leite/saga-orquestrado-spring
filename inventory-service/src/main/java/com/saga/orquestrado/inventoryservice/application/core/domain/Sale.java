package com.saga.orquestrado.inventoryservice.application.core.domain;


import com.saga.orquestrado.inventoryservice.application.core.domain.enums.SaleStatus;

import java.math.BigDecimal;

public class Sale {
    private Integer id;
    private Integer productId;
    private Integer userId;

    private BigDecimal value;
    private Integer quantity;
    private SaleStatus status;

    public Sale() {
    }

    public Sale(
            Integer id,
            Integer productId,
            Integer userId,
            BigDecimal value,
            Integer quantity,
            SaleStatus status
    ) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.value = value;
        this.quantity = quantity;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public SaleStatus getStatus() {
        return status;
    }

    public void setStatus(SaleStatus status) {
        this.status = status;
    }
}
