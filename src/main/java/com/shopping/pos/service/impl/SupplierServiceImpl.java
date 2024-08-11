package com.shopping.pos.service.impl;

import com.shopping.pos.dto.request.CreateSupplierRequest;
import com.shopping.pos.entity.Supplier;
import com.shopping.pos.mapper.SupplierMapper;
import com.shopping.pos.repository.SupplierRepository;
import com.shopping.pos.service.SupplierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;
    private final SupplierMapper supplierMapper;


    @Override
    public void createSupplier(CreateSupplierRequest request) {
        Supplier supplierMapperEntity = supplierMapper.toEntity(request);

        supplierRepository.save(supplierMapperEntity);
    }

    @Override
    public Supplier findSupplierById(Long id) {

        return supplierRepository
                .findSupplierById(id)
                .orElseThrow(() -> new RuntimeException("Can't find supplier" + id));
    }
}
