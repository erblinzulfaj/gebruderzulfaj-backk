package com.gebruderzulfajstock.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private long id;
    private String type;
    private String origin;
    private String originalName;
    private String code;
    private String commonName;
    private double quantity;
    private String quantityType;
    private LocalDateTime localDateTime;
}
