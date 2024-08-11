package com.shopping.pos.service.impl;

import com.shopping.pos.dto.request.CreateRetailDetailsRequest;
import com.shopping.pos.entity.RetailDetails;
import com.shopping.pos.entity.RetailGroup;
import com.shopping.pos.mapper.RetailDetailsMapper;
import com.shopping.pos.repository.RetailDetailsRepository;
import com.shopping.pos.service.ProductService;
import com.shopping.pos.service.RetailDetailsService;
import com.shopping.pos.service.RetailGroupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RetailDetailsServiceImpl implements RetailDetailsService {

    private final RetailDetailsRepository retailDetailsRepository;
    private final RetailDetailsMapper retailDetailsMapper;
    private final RetailGroupService retailGroupService;
    private final ProductService productService;

    @Override
    public void createRetailDetails(CreateRetailDetailsRequest request) {
        RetailDetails retailDetailsMapperEntity = retailDetailsMapper.toEntity(request);
        retailDetailsMapperEntity.setRetailGroup(retailGroupService.findRetailGroupById(request.getRetailGroupId()));
        retailDetailsMapperEntity.setProduct(productService.findProductByBarcodeId(request.getProductSerialNumber()));

        retailDetailsRepository.save(retailDetailsMapperEntity);
    }
}
