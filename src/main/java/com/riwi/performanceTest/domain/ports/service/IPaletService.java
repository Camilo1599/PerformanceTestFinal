package com.riwi.performanceTest.domain.ports.service;

import com.riwi.performanceTest.application.dtos.request.PaletRequest;
import com.riwi.performanceTest.application.dtos.response.PaletResponse;
import com.riwi.performanceTest.application.services.generic.*;
import com.riwi.performanceTest.domain.entities.Palet;

public interface IPaletService extends
        Create<PaletResponse, PaletRequest>,
        Update<PaletRequest, Palet, Long>,
        Delete<Long>,
        ReadAll<PaletResponse>,
        ReadById<PaletResponse, Long>,
        ReadByName<PaletResponse, String> {
}
