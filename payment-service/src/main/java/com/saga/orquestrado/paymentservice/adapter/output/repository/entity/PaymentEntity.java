package com.saga.orquestrado.paymentservice.adapter.output.repository.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "payments")
public class PaymentEntity {
    private Integer id;
    private Integer userId;
    private Integer saleId;
    private BigDecimal value;

}
