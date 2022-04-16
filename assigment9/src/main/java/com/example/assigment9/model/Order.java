package com.example.assigment9.model;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    @NotNull
    private int id;
    private double price;

    @ManyToOne
    Customer customer;

    @OneToOne
    Payment payment;
}