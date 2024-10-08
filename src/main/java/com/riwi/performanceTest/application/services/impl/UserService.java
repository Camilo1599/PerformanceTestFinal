package com.riwi.performanceTest.application.services.impl;

import com.riwi.performanceTest.application.dtos.exceptions.UnauthorizedAccessException;
import com.riwi.performanceTest.application.dtos.request.UserWithoutId;
import com.riwi.performanceTest.domain.entities.UserEntity;
import com.riwi.performanceTest.domain.ports.service.IUserService;
import com.riwi.performanceTest.infrastructure.persistence.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserEntityRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

}
