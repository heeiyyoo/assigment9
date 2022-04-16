package com.example.assigment9.model;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    @NotNull
    private int id;
    @NotNull
    private String name;

    @OneToMany
    List<Order> orderList;
}