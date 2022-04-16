package com.example.assigment9.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    @NotNull
    private int id;
    private PaymentMethod paymentMethod;

    @OneToOne
    Order order;
}