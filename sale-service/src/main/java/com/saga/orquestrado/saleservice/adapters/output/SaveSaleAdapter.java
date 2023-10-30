package com.saga.orquestrado.saleservice.adapters.output;

import com.saga.orquestrado.saleservice.adapters.output.repository.SaleRepository;
import com.saga.orquestrado.saleservice.adapters.output.repository.entity.SaleEntity;
import com.saga.orquestrado.saleservice.adapters.output.repository.mapper.SaleEntityMapper;
import com.saga.orquestrado.saleservice.application.core.domain.Sale;
import com.saga.orquestrado.saleservice.application.ports.output.SaveSaleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveSaleAdapter implements SaveSaleOutput {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SaleEntityMapper saleEntityMapper;
    @Override
    public Sale save(Sale sale) {
        SaleEntity saleEntity = saleEntityMapper.toSaleEntity(sale);
        SaleEntity saleEntityResponse = saleRepository.save(saleEntity);
        return saleEntityMapper.toSale(saleEntityResponse);
    }
}
