package com.saga.orquestrado.paymentservice.adapter.output;

import com.saga.orquestrado.paymentservice.adapter.output.repository.UserRepository;
import com.saga.orquestrado.paymentservice.adapter.output.repository.entity.UserEntity;
import com.saga.orquestrado.paymentservice.adapter.output.repository.mapper.UserEntityMapper;
import com.saga.orquestrado.paymentservice.application.core.domain.User;
import com.saga.orquestrado.paymentservice.application.ports.output.UpdateUserOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserAdapter implements UpdateUserOutput {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;
    @Override
    public void update(User user) {
        UserEntity userEntity = userEntityMapper.toUserEntity(user);
        userRepository.save(userEntity);
    }
}
