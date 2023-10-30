package com.saga.orquestrado.inventoryservice.adapters.output.repository.mapper;

import com.saga.orquestrado.inventoryservice.adapters.output.repository.entity.InventoryEntity;
import com.saga.orquestrado.inventoryservice.application.core.domain.Inventory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventoryEntityMapper {
    Inventory toInventory(InventoryEntity inventoryEntity);

    InventoryEntity toInventoryEntity(Inventory inventory);
}
