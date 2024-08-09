package com.shopping.pos.service;

import com.shopping.pos.dto.request.AddProductToInventoryRequest;

public interface InventoryService {

    void addProduct(Long serialNumber, AddProductToInventoryRequest request);
}
