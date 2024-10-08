package com.riwi.performanceTest.domain.ports.service;

import com.riwi.performanceTest.application.dtos.request.ChargeRequest;
import com.riwi.performanceTest.application.dtos.response.ChargeResponse;
import com.riwi.performanceTest.application.services.generic.*;
import com.riwi.performanceTest.domain.entities.Charge;

public interface IChargeService extends
        Create<ChargeResponse, ChargeRequest>,
        Update<ChargeRequest, Charge, Long>,
        ReadAll<ChargeResponse>,
        ReadById<ChargeResponse, Long>,
        ReadByName<ChargeResponse, String> {
}
