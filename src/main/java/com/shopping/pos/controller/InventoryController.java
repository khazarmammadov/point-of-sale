package com.shopping.pos.controller;

import com.shopping.pos.dto.request.AddProductToInventoryRequest;
import com.shopping.pos.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping("/addProduct")
    public void addProduct(Long serialNumber, int count) {
        inventoryService.addProduct(serialNumber, count);
    }
}
