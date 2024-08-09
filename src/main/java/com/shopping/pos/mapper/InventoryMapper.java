package com.shopping.pos.mapper;

import com.shopping.pos.dto.request.AddProductToInventoryRequest;
import com.shopping.pos.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface InventoryMapper {
    @Mapping(target = "addedDate", expression = "java(java.time.LocalDateTime.now())")
    Inventory toEntity(AddProductToInventoryRequest inventoryRequest);
}
