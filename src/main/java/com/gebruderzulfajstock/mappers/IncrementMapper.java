package com.gebruderzulfajstock.mappers;

import com.gebruderzulfajstock.dtos.IncrementDto;
import com.gebruderzulfajstock.models.Increment;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class IncrementMapper {

    public Increment toEntity(IncrementDto dto) {
        Increment entity = new Increment();
        entity.setId(dto.getId());
        entity.setCode(dto.getCode());
        entity.setOriginalName(dto.getOriginalName());
        entity.setCommonName(dto.getCommonName());
        entity.setIncrement(dto.getIncrement());
        entity.setDate(LocalDateTime.now());
        return entity;
    }

    public IncrementDto toDto(Increment entity) {
        IncrementDto dto = new IncrementDto();
        dto.setId(entity.getId());
        dto.setCode(entity.getCode());
        dto.setOriginalName(entity.getOriginalName());
        dto.setCommonName(entity.getCommonName());
        dto.setIncrement(entity.getIncrement());
        dto.setDate(entity.getDate());
        return dto;
    }


}

