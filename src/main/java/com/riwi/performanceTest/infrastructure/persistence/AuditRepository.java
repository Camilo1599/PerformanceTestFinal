package com.riwi.performanceTest.infrastructure.persistence;

import com.riwi.performanceTest.domain.entities.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<Audit, Long> {
}
