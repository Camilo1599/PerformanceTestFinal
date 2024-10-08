package com.riwi.performanceTest.domain.entities;

import com.riwi.performanceTest.domain.enums.ChargeStatus;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "charges")
public class Charge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "dimensions", nullable = false)
    private String dimensions;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private ChargeStatus status;

    @ManyToOne
    @JoinColumn(name = "palet_id")
    private Palet palet;
    


}
