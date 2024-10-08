package com.riwi.performanceTest.infrastructure.persistence;

import com.riwi.performanceTest.domain.entities.Charge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargeRepository extends JpaRepository<Charge, Long> {
}
