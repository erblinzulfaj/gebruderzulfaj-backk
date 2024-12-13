package com.gebruderzulfajstock.mappers;

import com.gebruderzulfajstock.dtos.DiscountDto;
import com.gebruderzulfajstock.models.Discount;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DiscountMapper {

    public Discount toEntity(DiscountDto dto) {
        Discount entity = new Discount();
        entity.setId(dto.getId());
        entity.setCode(dto.getCode());
        entity.setOriginalName(dto.getOriginalName());
        entity.setCommonName(dto.getCommonName());
        entity.setDiscount(dto.getDiscount());
        entity.setDate(LocalDateTime.now());
        return entity;
    }

    public DiscountDto toDto(Discount entity) {
        DiscountDto dto = new DiscountDto();
        dto.setId(entity.getId());
        dto.setCode(entity.getCode());
        dto.setOriginalName(entity.getOriginalName());
        dto.setCommonName(entity.getCommonName());
        dto.setDiscount(entity.getDiscount());
        dto.setDate(entity.getDate());
        return dto;
    }


}
