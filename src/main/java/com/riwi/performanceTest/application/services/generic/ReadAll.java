package com.riwi.performanceTest.application.services.generic;

import java.util.List;

public interface ReadAll<Entity> {
    public List<Entity> readAll();
}
