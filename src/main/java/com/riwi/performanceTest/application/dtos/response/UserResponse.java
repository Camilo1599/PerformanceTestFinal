package com.riwi.performanceTest.application.dtos.response;

import com.riwi.performanceTest.domain.enums.Roles;
import lombok.Data;

@Data
public class UserResponse {
    private Long id;
    private String name;
    private Roles role;

    public UserResponse(Long id, String name, Roles role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}