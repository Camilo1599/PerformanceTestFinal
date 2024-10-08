package com.riwi.performanceTest.application.services.generic;

public interface Update<ID, Entity, EntityRequest> {
    public Entity update(ID id, EntityRequest entity);
}
