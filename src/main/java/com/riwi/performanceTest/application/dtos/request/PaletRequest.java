package com.riwi.performanceTest.application.dtos.request;

import lombok.Data;

@Data
public class PaletRequest {
    private String location;
    private Double maxWeight;
    private String status;
}