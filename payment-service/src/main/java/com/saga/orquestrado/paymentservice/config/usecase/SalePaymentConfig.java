package com.saga.orquestrado.paymentservice.config.usecase;

import com.saga.orquestrado.paymentservice.adapter.output.SavePaymentAdapter;
import com.saga.orquestrado.paymentservice.adapter.output.SendToKafkaAdapter;
import com.saga.orquestrado.paymentservice.adapter.output.UpdateUserAdapter;
import com.saga.orquestrado.paymentservice.application.core.usecase.FindUserByIdUseCase;
import com.saga.orquestrado.paymentservice.application.core.usecase.SalePaymentUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalePaymentConfig {
    @Bean
    public SalePaymentUseCase salePaymentUseCase(
            FindUserByIdUseCase findUserByIdUseCase,
            UpdateUserAdapter updateUserAdapter,
            SavePaymentAdapter savePaymentAdapter,
            SendToKafkaAdapter sendToKafkaAdapter
    ){
        return new SalePaymentUseCase(
                findUserByIdUseCase,
                updateUserAdapter,
                savePaymentAdapter,
                sendToKafkaAdapter
        );
    }
}
