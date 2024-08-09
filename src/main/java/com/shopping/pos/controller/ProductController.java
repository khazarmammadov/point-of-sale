package com.shopping.pos.controller;

import com.shopping.pos.dto.request.CreateProductRequest;
import com.shopping.pos.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    public void createProduct(Long serialNumber, @RequestBody CreateProductRequest createProductRequest) {
        productService.createProduct(serialNumber, createProductRequest);
    }
}
