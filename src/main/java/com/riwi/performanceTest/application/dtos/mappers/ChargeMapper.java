package com.riwi.performanceTest.application.dtos.mappers;

import com.riwi.performanceTest.application.dtos.request.ChargeRequest;
import com.riwi.performanceTest.application.dtos.response.ChargeResponse;
import com.riwi.performanceTest.domain.entities.Charge;

public class ChargeMapper {

    public static Charge toEntity(ChargeRequest chargeRequest) {
        Charge charge = new Charge();
        charge.setDescription(chargeRequest.getDescription());
        charge.setWeight(chargeRequest.getWeight());
        charge.setDimensions(chargeRequest.getDimensions());
        charge.setStatus(chargeRequest.getStatus());
        return charge;
    }

    public static ChargeResponse toResponse(Charge charge) {
        return new ChargeResponse(charge.getId(), charge.getDescription(), charge.getWeight(),
                charge.getDimensions(), charge.getStatus(), charge.getPallet().getId());
    }
}