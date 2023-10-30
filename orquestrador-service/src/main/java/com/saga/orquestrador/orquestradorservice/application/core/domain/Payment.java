package com.saga.orquestrador.orquestradorservice.application.core.domain;

import java.math.BigDecimal;

public class Payment {
    private Integer id;
    private Integer userId;
    private Integer saleId;
    private BigDecimal value;

    public Payment() {
    }

    public Payment(
            Integer id,
            Integer userId,
            Integer saleId,
            BigDecimal value
    ) {
        this.id = id;
        this.userId = userId;
        this.saleId = saleId;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public BigDecimal getValue() {
        return value;
    }
}
