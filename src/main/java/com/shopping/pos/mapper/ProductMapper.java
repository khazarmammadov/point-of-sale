package com.shopping.pos.mapper;

import com.shopping.pos.dto.request.CreateProductRequest;
import com.shopping.pos.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    Product toEntity(CreateProductRequest request);
}
