package com.saga.orquestrado.saleservice.config.usecase;

import com.saga.orquestrado.saleservice.adapters.output.SaveSaleAdapter;
import com.saga.orquestrado.saleservice.application.core.usecase.FinalizeSaleUseCase;
import com.saga.orquestrado.saleservice.application.core.usecase.FindSaleByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FinalizeSaleConfig {
    @Bean
    public FinalizeSaleUseCase finalizeSaleUseCase(
            FindSaleByIdUseCase findSaleByIdUseCase,
            SaveSaleAdapter saveSaleAdapter
    ){
        return new FinalizeSaleUseCase(
                findSaleByIdUseCase,
                saveSaleAdapter
        );
    }
}
