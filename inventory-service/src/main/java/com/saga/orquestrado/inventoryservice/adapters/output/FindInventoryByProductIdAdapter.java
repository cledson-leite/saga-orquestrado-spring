package com.saga.orquestrado.inventoryservice.adapters.output;

import com.saga.orquestrado.inventoryservice.adapters.output.repository.InventoryRepository;
import com.saga.orquestrado.inventoryservice.adapters.output.repository.entity.InventoryEntity;
import com.saga.orquestrado.inventoryservice.adapters.output.repository.mapper.InventoryEntityMapper;
import com.saga.orquestrado.inventoryservice.application.core.domain.Inventory;
import com.saga.orquestrado.inventoryservice.application.ports.output.FindInventoryByProductIdOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindInventoryByProductIdAdapter implements FindInventoryByProductIdOutput {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private InventoryEntityMapper inventoryEntityMapper;

    @Override
    public Optional<Inventory> find(Integer productId) {
        Optional<InventoryEntity> inventoryEntity = inventoryRepository.findByProductId(productId);
        return inventoryEntity.map(entity -> inventoryEntityMapper.toInventory(entity));
    }
}
