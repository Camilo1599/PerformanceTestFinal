package com.riwi.performanceTest.application.dtos.response;

import lombok.Data;

@Data
public class ChargeResponse {
    private Long id;
    private String description;
    private Double weight;
    private String dimensions;
    private String status;
    private Long palletId;

    public ChargeResponse(Long id, String description, Double weight, String dimensions, String status, Long palletId) {
        this.id = id;
        this.description = description;
        this.weight = weight;
        this.dimensions = dimensions;
        this.status = status;
        this.palletId = palletId;
    }
}