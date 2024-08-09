package com.shopping.pos.service.impl;

import com.shopping.pos.dto.request.AddProductToInventoryRequest;
import com.shopping.pos.entity.Inventory;
import com.shopping.pos.entity.Product;
import com.shopping.pos.mapper.InventoryMapper;
import com.shopping.pos.repository.InventoryRepository;
import com.shopping.pos.service.InventoryService;
import com.shopping.pos.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final ProductService productService;
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;
    @Override
    public void addProduct(Long serialNumber, AddProductToInventoryRequest request) {
        Product product = productService.findProductByBarcodeId(serialNumber);

        if (product != null) {
            Inventory inventoryMapperEntity = inventoryMapper.toEntity(request);
            inventoryRepository.save(inventoryMapperEntity);
        } else {
            throw new RuntimeException("Product doesn't Exist...");
        }

    }
}
