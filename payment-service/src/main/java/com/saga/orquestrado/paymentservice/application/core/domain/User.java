package com.saga.orquestrado.paymentservice.application.core.domain;

import java.math.BigDecimal;

public class User {
    private Integer id;
    private String name;
    private BigDecimal balance;

    public User() {
    }

    public User(Integer id, String name, BigDecimal balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void debitBalance(BigDecimal value){
        this.balance = this.balance.subtract(value);
    }
}
