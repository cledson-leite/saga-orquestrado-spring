package com.saga.orquestrado.saleservice.adapters.output;

import com.saga.orquestrado.saleservice.adapters.output.repository.SaleRepository;
import com.saga.orquestrado.saleservice.adapters.output.repository.entity.SaleEntity;
import com.saga.orquestrado.saleservice.adapters.output.repository.mapper.SaleEntityMapper;
import com.saga.orquestrado.saleservice.application.core.domain.Sale;
import com.saga.orquestrado.saleservice.application.ports.output.FindSaleByIdOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindSaleByIdAdapter implements FindSaleByIdOutput {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SaleEntityMapper saleEntityMapper;

    @Override
    public Optional<Sale> find(Integer id) {
        Optional<SaleEntity> saleEntity = saleRepository.findById(id);
        return saleEntity.map(entity -> saleEntityMapper.toSale(entity));
    }
}
