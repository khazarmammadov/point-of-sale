package com.shopping.pos.mapper;

import com.shopping.pos.dto.request.CreateSupplierRequest;
import com.shopping.pos.entity.Supplier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SupplierMapper {
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    Supplier toEntity(CreateSupplierRequest request);
}
