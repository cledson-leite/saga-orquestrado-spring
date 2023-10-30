package com.saga.orquestrado.saleservice.config.usecase;

import com.saga.orquestrado.saleservice.adapters.output.SaveSaleAdapter;
import com.saga.orquestrado.saleservice.application.core.usecase.CancelSaleUseCase;
import com.saga.orquestrado.saleservice.application.core.usecase.FindSaleByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CancelSaleConfig {
    @Bean
    public CancelSaleUseCase cancelSaleUseCase(
            FindSaleByIdUseCase findSaleByIdUseCase,
            SaveSaleAdapter saveSaleAdapter
    ){
        return new CancelSaleUseCase(
                saveSaleAdapter,
                findSaleByIdUseCase
                );
    }
}
