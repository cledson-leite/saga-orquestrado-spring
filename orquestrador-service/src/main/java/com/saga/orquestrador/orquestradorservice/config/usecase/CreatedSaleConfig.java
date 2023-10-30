package com.saga.orquestrador.orquestradorservice.config.usecase;

import com.saga.orquestrador.orquestradorservice.adapter.output.SendToKafkaAdapter;
import com.saga.orquestrador.orquestradorservice.application.core.usecase.CreatedSaleUseCase;
import com.saga.orquestrador.orquestradorservice.application.ports.output.SendToKafkaOutput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreatedSaleConfig {
    @Bean
    public CreatedSaleUseCase createdSaleUseCase(SendToKafkaAdapter sendToKafkaAdapter){
        return new CreatedSaleUseCase(sendToKafkaAdapter);
    }
}
