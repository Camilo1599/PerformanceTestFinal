package com.riwi.performanceTest.domain.ports.service;

import com.riwi.performanceTest.application.dtos.request.UserRequest;
import com.riwi.performanceTest.application.dtos.response.UserResponse;
import com.riwi.performanceTest.application.services.generic.*;
import com.riwi.performanceTest.domain.entities.UserEntity;


public interface IUserService extends
        Create<UserResponse, UserRequest>,
        Update<UserRequest, UserEntity, Long>,
        Delete<Long>,
        ReadAll<UserResponse>,
        ReadById<UserResponse, Long>,
        ReadByName<UserResponse, String> {

}
