package com.saga.orquestrado.paymentservice.adapter.output.repository.mapper;

import com.saga.orquestrado.paymentservice.adapter.output.repository.entity.UserEntity;
import com.saga.orquestrado.paymentservice.application.core.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    User toUser(UserEntity userEntity);

    UserEntity toUserEntity(User user);
}
