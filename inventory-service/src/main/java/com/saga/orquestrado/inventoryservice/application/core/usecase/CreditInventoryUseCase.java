package com.saga.orquestrado.inventoryservice.application.core.usecase;

import com.saga.orquestrado.inventoryservice.application.core.domain.Inventory;
import com.saga.orquestrado.inventoryservice.application.core.domain.Sale;
import com.saga.orquestrado.inventoryservice.application.ports.input.CreditInventoryInput;
import com.saga.orquestrado.inventoryservice.application.ports.input.FindInventoryByProductIdInput;
import com.saga.orquestrado.inventoryservice.application.ports.output.UpdateInventoryOutput;

public class CreditInventoryUseCase implements CreditInventoryInput {
    private final FindInventoryByProductIdInput findInventoryByProductIdInput;
    private final UpdateInventoryOutput updateInventoryOutput;

    public CreditInventoryUseCase(
            FindInventoryByProductIdInput findInventoryByProductIdInput,
            UpdateInventoryOutput updateInventoryOutput
    ) {
        this.findInventoryByProductIdInput = findInventoryByProductIdInput;
        this.updateInventoryOutput = updateInventoryOutput;
    }

    @Override
    public void credit(Sale sale){
        Inventory inventory = findInventoryByProductIdInput.find(sale.getProductId());
        inventory.creditQuantity(sale.getQuantity());
        updateInventoryOutput.update(inventory);
    }
}
