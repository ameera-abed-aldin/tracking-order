package com.Mediator.Mediator.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Custmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custmerId;
    private  String custmerName;
    private String phone;
@OneToOne
@JoinColumn(name="addressId",referencedColumnName = "addressId")
private Address address;

}
