package com.gebruderzulfajstock.mappers;

import com.gebruderzulfajstock.dtos.ProductDto;
import com.gebruderzulfajstock.models.Product;
import com.gebruderzulfajstock.models.enums.QuantityType;
import com.gebruderzulfajstock.models.enums.Type;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProductMapper {

    public Product toEntity(ProductDto dto) {
        Product entity = new Product();
        entity.setId(dto.getId());
        entity.setType(Type.valueOf(dto.getType()));
        entity.setOrigin(dto.getOrigin());
        entity.setOriginalName(dto.getOriginalName());
        entity.setCode(dto.getCode());
        entity.setCommonName(dto.getCommonName());
        entity.setQuantity(dto.getQuantity());
        entity.setQuantityType(QuantityType.valueOf(dto.getQuantityType()));
        entity.setLocalDateTime(LocalDateTime.now());
        return entity;
    }

    public ProductDto toDto(Product entity) {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setType(String.valueOf(entity.getType()));
        dto.setOrigin(entity.getOrigin());
        dto.setOriginalName(entity.getOriginalName());
        dto.setCode(entity.getCode());
        dto.setCommonName(entity.getCommonName());
        dto.setQuantity(entity.getQuantity());
        dto.setQuantityType(String.valueOf(entity.getQuantityType()));
        dto.setLocalDateTime(LocalDateTime.now());
        return dto;
    }

}
