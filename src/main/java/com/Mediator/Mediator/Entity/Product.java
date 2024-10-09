package com.Mediator.Mediator.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;
    private String name;
    private float price;
    private String size;
    private  int sdk;
    private boolean isAvalibal;
    private String description;
    private int quantity;
    private String img;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "ORDERS_PRODUCT_MAPPING", joinColumns = @JoinColumn(name = "productId"),
            inverseJoinColumns = @JoinColumn(name = "orderId"))
    private Set<Orders> orders;

}
