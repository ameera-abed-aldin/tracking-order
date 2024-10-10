package com.Mediator.Mediator.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "custmer")
public class Custmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custmerId;
    private  String custmerName;
    private String phone;
    @JsonIgnore
@OneToOne
@JoinColumn(name="addressId",referencedColumnName = "addressId")
private Address address;
    @JsonIgnore
@OneToMany(mappedBy = "custmer")
    private List<Orders> orders;
}
