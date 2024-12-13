package com.gebruderzulfajstock.models;


import com.gebruderzulfajstock.models.enums.QuantityType;
import com.gebruderzulfajstock.models.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Type type;
    private String origin;
    private String originalName;
    private String code;
    private String commonName;
    private double quantity;
    @Enumerated(EnumType.STRING)
    private QuantityType quantityType;
    private LocalDateTime localDateTime;

}
