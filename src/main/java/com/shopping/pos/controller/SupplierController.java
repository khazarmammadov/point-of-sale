package com.shopping.pos.controller;

import com.shopping.pos.dto.request.CreateSupplierRequest;
import com.shopping.pos.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suppliers")
@RequiredArgsConstructor
public class SupplierController {

    private final SupplierService supplierService;

    @PostMapping("/create")
    public void createSupplier(@RequestBody CreateSupplierRequest request) {

        supplierService.createSupplier(request);
    }
}
