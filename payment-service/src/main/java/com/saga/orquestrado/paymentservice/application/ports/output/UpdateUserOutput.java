package com.saga.orquestrado.paymentservice.application.ports.output;

import com.saga.orquestrado.paymentservice.application.core.domain.User;

public interface UpdateUserOutput {
    void update(User user);
}
