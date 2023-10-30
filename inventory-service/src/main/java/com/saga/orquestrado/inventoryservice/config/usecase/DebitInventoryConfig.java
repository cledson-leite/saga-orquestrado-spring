package com.saga.orquestrado.inventoryservice.config.usecase;

import com.saga.orquestrado.inventoryservice.adapters.output.SendToKafkaAdapter;
import com.saga.orquestrado.inventoryservice.adapters.output.UpdateInventoryAdapter;
import com.saga.orquestrado.inventoryservice.application.core.usecase.DebitInventoryUseCase;
import com.saga.orquestrado.inventoryservice.application.core.usecase.FindInventoryByProductIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DebitInventoryConfig {

    @Bean
    public DebitInventoryUseCase debitInventoryUseCase(
            FindInventoryByProductIdUseCase findInventoryByProductIdUseCase,
            UpdateInventoryAdapter updateInventoryAdapter,
            SendToKafkaAdapter sendToKafkaAdapter
    ){
        return new DebitInventoryUseCase(
                findInventoryByProductIdUseCase,
                updateInventoryAdapter,
                sendToKafkaAdapter
        );
    }
}
