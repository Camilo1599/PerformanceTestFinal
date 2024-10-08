package com.riwi.performanceTest.application.dtos.request;


import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String password;
    private String role; // ADMIN o CARRIER
}
