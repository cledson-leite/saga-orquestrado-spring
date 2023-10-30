package com.saga.orquestrado.saleservice.adapters.input.controller.mapper;

import com.saga.orquestrado.saleservice.adapters.input.controller.request.SaleRequest;
import com.saga.orquestrado.saleservice.application.core.domain.Sale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleRequestMapper {
    Sale toSale(SaleRequest saleRequest);
}
