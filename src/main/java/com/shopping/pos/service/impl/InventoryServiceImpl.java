package com.shopping.pos.service.impl;

import com.shopping.pos.entity.Inventory;
import com.shopping.pos.entity.Product;
import com.shopping.pos.repository.InventoryRepository;
import com.shopping.pos.service.InventoryService;
import com.shopping.pos.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final ProductService productService;
    private final InventoryRepository inventoryRepository;

    @Override
    public void addProduct(Long serialNumber, Integer count) {
        Product product = productService.findProductByBarcodeId(serialNumber);

        if (product != null) {
            Inventory existingInventory = inventoryRepository.findByProductBarcodeSerialNumber(serialNumber);

            if (existingInventory != null) {

                int newCount = existingInventory.getCount() + count;
                existingInventory.setCount(newCount);
                existingInventory.setUpdatedDate(LocalDateTime.now());
                inventoryRepository.save(existingInventory);
            } else {

                Inventory inventory = new Inventory();
                inventory.setProduct(product);
                inventory.setCount(count);
                inventory.setAddedDate(LocalDateTime.now());
                inventory.setUpdatedDate(LocalDateTime.now());
                inventoryRepository.save(inventory);
            }
        } else {
            throw new RuntimeException("Product doesn't exist...");
        }
    }

}
