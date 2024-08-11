package com.shopping.pos.mapper;

import com.shopping.pos.dto.request.CreateRetailDetailsRequest;
import com.shopping.pos.entity.RetailDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RetailDetailsMapper {
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    RetailDetails toEntity(CreateRetailDetailsRequest request);
}
