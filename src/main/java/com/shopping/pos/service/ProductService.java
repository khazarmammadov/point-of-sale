package com.shopping.pos.service;

import com.shopping.pos.dto.request.CreateBarcodeRequest;
import com.shopping.pos.dto.request.CreateProductRequest;
import com.shopping.pos.entity.Product;

public interface ProductService {
    void createProduct(Long serialNumber, CreateProductRequest productRequest);
    Product findProductByBarcodeId(Long serialNumber);

}
