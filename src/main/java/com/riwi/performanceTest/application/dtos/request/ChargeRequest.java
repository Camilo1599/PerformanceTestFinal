package com.riwi.performanceTest.application.dtos.request;


import lombok.Data;

@Data
public class ChargeRequest {
    private String description;
    private Double weight;
    private String dimensions;
    private String status;
    private Long palletId;
}