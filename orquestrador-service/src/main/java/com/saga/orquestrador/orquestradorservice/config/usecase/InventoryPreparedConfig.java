package com.saga.orquestrador.orquestradorservice.config.usecase;

import com.saga.orquestrador.orquestradorservice.adapter.output.SendToKafkaAdapter;
import com.saga.orquestrador.orquestradorservice.application.core.usecase.InventoryPreparedUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InventoryPreparedConfig {
    @Bean
    public InventoryPreparedUseCase inventoryPreparedUseCase(SendToKafkaAdapter sendToKafkaAdapter){
        return new InventoryPreparedUseCase(sendToKafkaAdapter);
    }
}
