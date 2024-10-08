package com.riwi.performanceTest.infrastructure.persistence;

import com.riwi.performanceTest.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
}