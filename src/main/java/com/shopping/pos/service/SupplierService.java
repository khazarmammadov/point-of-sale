package com.shopping.pos.service;

import com.shopping.pos.dto.request.CreateSupplierRequest;
import com.shopping.pos.entity.Supplier;

import java.util.Optional;

public interface SupplierService {

    void createSupplier(CreateSupplierRequest request);

    Supplier findSupplierById(Long id);
}
