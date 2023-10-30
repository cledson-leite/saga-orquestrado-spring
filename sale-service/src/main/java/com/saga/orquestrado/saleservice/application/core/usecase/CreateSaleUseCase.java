package com.saga.orquestrado.saleservice.application.core.usecase;

import com.saga.orquestrado.saleservice.application.core.domain.Sale;
import com.saga.orquestrado.saleservice.application.core.domain.enums.SaleEvent;
import com.saga.orquestrado.saleservice.application.core.domain.enums.SaleStatus;
import com.saga.orquestrado.saleservice.application.ports.input.CreateSaleInput;
import com.saga.orquestrado.saleservice.application.ports.output.SaveSaleOutput;
import com.saga.orquestrado.saleservice.application.ports.output.SendCreatedSaleOutput;

public class CreateSaleUseCase implements CreateSaleInput {
    private final SaveSaleOutput saveSaleOutput;
    private final SendCreatedSaleOutput sendCreatedSaleOutput;

    public CreateSaleUseCase(
            SaveSaleOutput saveSaleOutput,
            SendCreatedSaleOutput sendCreatedSaleOutput
    ) {
        this.saveSaleOutput = saveSaleOutput;
        this.sendCreatedSaleOutput = sendCreatedSaleOutput;
    }

    @Override
    public void create(Sale sale){
        sale.setStatus(SaleStatus.PENDING);
        Sale saleResponse = saveSaleOutput.save(sale);
        sendCreatedSaleOutput.send(saleResponse, SaleEvent.CREATED_SALE);
    }
}
