package com.saga.orquestrado.inventoryservice.config.usecase;

import com.saga.orquestrado.inventoryservice.adapters.output.UpdateInventoryAdapter;
import com.saga.orquestrado.inventoryservice.application.core.usecase.CreditInventoryUseCase;
import com.saga.orquestrado.inventoryservice.application.core.usecase.FindInventoryByProductIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditInventoryConfig {

    @Bean
    public CreditInventoryUseCase creditInventoryUseCase(
            FindInventoryByProductIdUseCase findInventoryByProductIdUseCase,
            UpdateInventoryAdapter updateInventoryAdapter,
    ){
        return new CreditInventoryUseCase(
                findInventoryByProductIdUseCase,
                updateInventoryAdapter
        );
    }
}
