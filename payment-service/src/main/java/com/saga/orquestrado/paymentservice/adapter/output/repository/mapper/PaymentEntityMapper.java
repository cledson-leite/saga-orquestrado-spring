package com.saga.orquestrado.paymentservice.adapter.output.repository.mapper;

import com.saga.orquestrado.paymentservice.adapter.output.repository.entity.PaymentEntity;
import com.saga.orquestrado.paymentservice.application.core.domain.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentEntityMapper {
    PaymentEntity toPaymentEntity(Payment payment);
}
