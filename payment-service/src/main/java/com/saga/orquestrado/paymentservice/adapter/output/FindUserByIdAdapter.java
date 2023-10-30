package com.saga.orquestrado.paymentservice.adapter.output;

import com.saga.orquestrado.paymentservice.adapter.output.repository.UserRepository;
import com.saga.orquestrado.paymentservice.adapter.output.repository.entity.UserEntity;
import com.saga.orquestrado.paymentservice.adapter.output.repository.mapper.UserEntityMapper;
import com.saga.orquestrado.paymentservice.application.core.domain.User;
import com.saga.orquestrado.paymentservice.application.ports.output.FindUserByIdOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindUserByIdAdapter implements FindUserByIdOutput {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public Optional<User> find(Integer userId) {
        Optional<UserEntity> userEntity = userRepository.findById(userId);
        return userEntity.map(entity -> userEntityMapper.toUser(entity));
    }
}
