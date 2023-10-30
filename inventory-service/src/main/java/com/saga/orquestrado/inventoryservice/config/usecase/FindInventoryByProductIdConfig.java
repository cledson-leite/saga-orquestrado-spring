package com.saga.orquestrado.inventoryservice.config.usecase;

import com.saga.orquestrado.inventoryservice.application.core.usecase.FindInventoryByProductIdUseCase;
import com.saga.orquestrado.inventoryservice.application.ports.output.FindInventoryByProductIdOutput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindInventoryByProductIdConfig {
    @Bean
    public FindInventoryByProductIdUseCase findInventoryByProductIdUseCase(
            FindInventoryByProductIdOutput findInventoryByProductIdOutput
    ){
        return new FindInventoryByProductIdUseCase(
                findInventoryByProductIdOutput
        );
    }
}
