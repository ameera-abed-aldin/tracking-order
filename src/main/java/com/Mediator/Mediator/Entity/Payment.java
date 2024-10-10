package com.Mediator.Mediator.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    private float amountWithShipping;
    private float amountWithoutShipping;

    @OneToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    private Orders order;

}
