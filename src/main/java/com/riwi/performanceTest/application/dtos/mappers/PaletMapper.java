package com.riwi.performanceTest.application.dtos.mappers;


import com.riwi.performanceTest.application.dtos.request.PaletRequest;
import com.riwi.performanceTest.application.dtos.response.PaletResponse;
import com.riwi.performanceTest.domain.entities.Palet;

public class PaletMapper {

    public static Palet toEntity(PaletRequest paletRequest) {
        Palet palet = new Palet();
        palet.setLocation(paletRequest.getLocation());
        palet.setMaxWeight(paletRequest.getMaxWeight());
        palet.setStatus(paletRequest.getStatus());
        return palet;
    }

    public static PaletResponse toResponse(Palet palet) {
        return new PaletResponse(palet.getId(), palet.getLocation(),
                palet.getMaxWeight(), palet.getStatus());
    }
}