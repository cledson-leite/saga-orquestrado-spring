package com.saga.orquestrado.saleservice.config.usecase;

import com.saga.orquestrado.saleservice.adapters.output.SaveSaleAdapter;
import com.saga.orquestrado.saleservice.adapters.output.SendCreatedSaleAdapter;
import com.saga.orquestrado.saleservice.application.core.usecase.CreateSaleUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateSaleConfig {

    @Bean
    public CreateSaleUseCase createSaleUseCase(
            SaveSaleAdapter saveSaleAdapter,
            SendCreatedSaleAdapter sendCreatedSaleAdapter
    ){
        return new CreateSaleUseCase(saveSaleAdapter, sendCreatedSaleAdapter);
    }
}
