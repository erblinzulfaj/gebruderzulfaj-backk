package com.gebruderzulfajstock.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncrementDto {
    private long id;
    private String code;
    private String originalName;
    private String commonName;
    private double increment;
    private LocalDateTime date;
}
