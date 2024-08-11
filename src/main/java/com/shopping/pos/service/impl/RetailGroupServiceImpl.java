package com.shopping.pos.service.impl;

import com.shopping.pos.entity.RetailGroup;
import com.shopping.pos.repository.RetailGroupRepository;
import com.shopping.pos.service.RetailGroupService;
import com.shopping.pos.service.SupplierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class RetailGroupServiceImpl implements RetailGroupService {

    private final RetailGroupRepository retailGroupRepository;
    private final SupplierService supplierService;
    @Override
    public void createRetailGroup(Long supplierId) {
        RetailGroup retailGroup = new RetailGroup();
        retailGroup.setSupplyDate(LocalDateTime.now());
        retailGroup.setSupplier(supplierService.findSupplierById(supplierId));

        retailGroupRepository.save(retailGroup);
    }

    @Override
    public RetailGroup findRetailGroupById(Long id) {

        return retailGroupRepository
                .findRetailGroupById(id)
                .orElseThrow(() -> new RuntimeException("Doesnt exist group" + id));
    }
}
