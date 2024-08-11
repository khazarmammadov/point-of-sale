package com.shopping.pos.controller;

import com.shopping.pos.dto.request.CreateProductRequest;
import com.shopping.pos.dto.request.CreateRetailDetailsRequest;
import com.shopping.pos.service.ProductService;
import com.shopping.pos.service.RetailDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retailDetails")
@RequiredArgsConstructor
public class RetailDetailsController {

    private final RetailDetailsService retailDetailsService;

    @PostMapping("/create")
    public void createRetailDetails(@RequestBody CreateRetailDetailsRequest request) {

        retailDetailsService.createRetailDetails(request);
    }
}
