package com.saga.orquestrado.inventoryservice.adapters.output.repository;

import com.saga.orquestrado.inventoryservice.adapters.output.repository.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {
    Optional<InventoryEntity> findByProductId(Integer productId);
}
