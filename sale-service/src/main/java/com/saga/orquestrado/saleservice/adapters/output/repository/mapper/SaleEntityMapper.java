package com.saga.orquestrado.saleservice.adapters.output.repository.mapper;

import com.saga.orquestrado.saleservice.adapters.output.repository.entity.SaleEntity;
import com.saga.orquestrado.saleservice.application.core.domain.Sale;
import com.saga.orquestrado.saleservice.application.core.domain.enums.SaleStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface SaleEntityMapper {
    @Mapping(
            source = "status",
            target = "statusId",
            qualifiedByName = "setStatusId"
    )
    SaleEntity toSaleEntity(Sale sale);

    @Named("setStatusId")
    default Integer setStatusId(SaleStatus saleStatus){
        return  saleStatus.getStatusId();
    }

    @Mapping(
            source = "statusId",
            target = "status",
            qualifiedByName = "setStatus"
    )
    Sale toSale(SaleEntity saleEntity);

    @Named("setStatus")
    default SaleStatus setStatus(Integer statusId){
        return  SaleStatus.toEnum(statusId);
    }
}
