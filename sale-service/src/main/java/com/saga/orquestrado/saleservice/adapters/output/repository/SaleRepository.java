package com.saga.orquestrado.saleservice.adapters.output.repository;

import com.saga.orquestrado.saleservice.adapters.output.repository.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Integer> {
}
