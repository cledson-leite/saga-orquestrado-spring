package com.saga.orquestrado.saleservice.config.usecase;

import com.saga.orquestrado.saleservice.adapters.output.FindSaleByIdAdapter;
import com.saga.orquestrado.saleservice.application.core.usecase.FindSaleByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindSaleByIdConfig {
    @Bean
    public FindSaleByIdUseCase findSaleByIdUseCase(
            FindSaleByIdAdapter findSaleByIdAdapter
    ){
        return new FindSaleByIdUseCase(
                findSaleByIdAdapter
        );
    }
}
