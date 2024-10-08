package com.riwi.performanceTest.application.dtos.mappers;


import com.riwi.performanceTest.application.dtos.request.UserRequest;
import com.riwi.performanceTest.application.dtos.response.UserResponse;
import com.riwi.performanceTest.domain.entities.UserEntity;

public class UserMapper {

    public static UserEntity toEntity(UserRequest userRequest) {
        UserEntity user = new UserEntity();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setRole(userRequest.getRole());
        return user;
    }

    public static UserResponse toResponse(UserEntity user) {
        return new UserResponse(user.getId(), user.getUsername(), user.getRole());
    }
}