package com.riwi.performanceTest.infrastructure.persistence;

import com.riwi.performanceTest.domain.entities.Palet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaletRepository extends JpaRepository<Palet, Long> {
}
