package com.Mediator.Mediator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private Date createdDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private  Date expectedArriveDate;

    @ManyToOne
    @JoinColumn(name = "UserId",referencedColumnName = "UserId")
    private User user;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "ORDERS_PRODUCT_MAPPING", joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "ProductId"))
    private Set<Product> product;

    @OneToOne(mappedBy = "order")
    private Payment payment;


}
