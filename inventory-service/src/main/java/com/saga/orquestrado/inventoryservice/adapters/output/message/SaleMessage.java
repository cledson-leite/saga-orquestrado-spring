package com.saga.orquestrado.inventoryservice.adapters.output.message;


import com.saga.orquestrado.inventoryservice.application.core.domain.Sale;
import com.saga.orquestrado.inventoryservice.application.core.domain.enums.SaleEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SaleMessage {
    private Sale sale;
    private SaleEvent event;
}
