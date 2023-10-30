package com.saga.orquestrador.orquestradorservice.config.usecase;

import com.saga.orquestrador.orquestradorservice.adapter.output.SendToKafkaAdapter;
import com.saga.orquestrador.orquestradorservice.application.core.usecase.PaymentFailedUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentFailedConfig {
    @Bean
    public PaymentFailedUseCase paymentFailedUseCase(SendToKafkaAdapter sendToKafkaAdapter){
        return new PaymentFailedUseCase(sendToKafkaAdapter);
    }
}
