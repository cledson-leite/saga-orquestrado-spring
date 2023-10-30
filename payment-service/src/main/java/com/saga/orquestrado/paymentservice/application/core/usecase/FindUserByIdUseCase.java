package com.saga.orquestrado.paymentservice.application.core.usecase;

import com.saga.orquestrado.paymentservice.application.core.domain.User;
import com.saga.orquestrado.paymentservice.application.ports.input.FindUserByIdInput;
import com.saga.orquestrado.paymentservice.application.ports.output.FindUserByIdOutput;

public class FindUserByIdUseCase implements FindUserByIdInput {
    private final FindUserByIdOutput findUserByIdOutput;

    public FindUserByIdUseCase(
            FindUserByIdOutput findUserByIdOutput
    ) {
        this.findUserByIdOutput = findUserByIdOutput;
    }

    @Override
    public User find(final Integer id){
        return findUserByIdOutput.find(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }
}
