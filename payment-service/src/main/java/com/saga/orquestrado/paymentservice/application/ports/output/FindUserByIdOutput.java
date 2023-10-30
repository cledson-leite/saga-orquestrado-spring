package com.saga.orquestrado.paymentservice.application.ports.output;

import com.saga.orquestrado.paymentservice.application.core.domain.User;

import java.util.Optional;

public interface FindUserByIdOutput {
    Optional<User> find(Integer userId);
}
