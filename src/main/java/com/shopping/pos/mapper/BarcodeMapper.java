package com.shopping.pos.mapper;

import com.shopping.pos.dto.request.CreateBarcodeRequest;
import com.shopping.pos.entity.Barcode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BarcodeMapper {

    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    Barcode toEntity(CreateBarcodeRequest request);
}
