package com.saga.orquestrado.paymentservice.application.ports.input;

import com.saga.orquestrado.paymentservice.application.core.domain.User;

public interface FindUserByIdInput {
    User find(final Integer id);
}
