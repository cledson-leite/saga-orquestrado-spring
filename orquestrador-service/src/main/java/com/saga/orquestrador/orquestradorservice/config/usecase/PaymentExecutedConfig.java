package com.saga.orquestrador.orquestradorservice.config.usecase;

import com.saga.orquestrador.orquestradorservice.adapter.output.SendToKafkaAdapter;
import com.saga.orquestrador.orquestradorservice.application.core.usecase.PaymentExecutedUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentExecutedConfig {
    @Bean
    public PaymentExecutedUseCase paymentExecutedUseCase(SendToKafkaAdapter sendToKafkaAdapter){
        return new PaymentExecutedUseCase(sendToKafkaAdapter);
    }
}
