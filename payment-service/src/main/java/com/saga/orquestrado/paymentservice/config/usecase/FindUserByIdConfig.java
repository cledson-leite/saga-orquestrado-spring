package com.saga.orquestrado.paymentservice.config.usecase;

import com.saga.orquestrado.paymentservice.adapter.output.FindUserByIdAdapter;
import com.saga.orquestrado.paymentservice.application.core.usecase.FindUserByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindUserByIdConfig {
    @Bean
    public FindUserByIdUseCase findUserByIdUseCase(
            FindUserByIdAdapter findUserByIdAdapter
    ){
        return new FindUserByIdUseCase(
                findUserByIdAdapter
        );
    }
}
