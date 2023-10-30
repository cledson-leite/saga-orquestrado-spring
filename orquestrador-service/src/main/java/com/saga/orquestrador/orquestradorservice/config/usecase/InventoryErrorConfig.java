package com.saga.orquestrador.orquestradorservice.config.usecase;

import com.saga.orquestrador.orquestradorservice.adapter.output.SendToKafkaAdapter;
import com.saga.orquestrador.orquestradorservice.application.core.usecase.InventoryErrorUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InventoryErrorConfig {
    @Bean
    public InventoryErrorUseCase inventoryErrorUseCase(SendToKafkaAdapter sendToKafkaAdapter){
        return new InventoryErrorUseCase(sendToKafkaAdapter);
    }
}
