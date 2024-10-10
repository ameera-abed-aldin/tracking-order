package com.Mediator.Mediator.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


import java.util.Set;


@Entity
@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private Date createdDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private  Date expectedArriveDate;
    private float amount;

    @ManyToOne
    @JoinColumn(name = "UserId",referencedColumnName = "UserId")
    private User user;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "ORDERS_PRODUCT_MAPPING", joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "ProductId"))
    private Set<Product> product;
    @JsonIgnore
    @OneToOne(mappedBy = "order")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "custmerId",referencedColumnName = "custmerId")
    private Custmer custmer;


}
