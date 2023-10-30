package com.saga.orquestrado.paymentservice.adapter.output.repository;

import com.saga.orquestrado.paymentservice.adapter.output.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
