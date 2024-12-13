package com.gebruderzulfajstock.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountDto {
    private long id;
    private String code;
    private String originalName;
    private String commonName;
    private double discount;
    private LocalDateTime date;
}
