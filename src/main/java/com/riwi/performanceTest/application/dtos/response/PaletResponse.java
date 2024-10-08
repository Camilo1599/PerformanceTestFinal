package com.riwi.performanceTest.application.dtos.response;

import lombok.Data;

@Data
public class PaletResponse {
    private Long id;
    private String location;
    private Double maxWeight;
    private String status;

    public PaletResponse(Long id, String location, Double maxWeight, String status) {
        this.id = id;
        this.location = location;
        this.maxWeight = maxWeight;
        this.status = status;
    }
}