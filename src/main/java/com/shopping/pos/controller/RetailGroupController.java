package com.shopping.pos.controller;

import com.shopping.pos.service.RetailGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retailGroups")
@RequiredArgsConstructor
public class RetailGroupController {

    private final RetailGroupService retailGroupService;

    @PostMapping("/create")
    public void createRetailGroup(Long supplierId) {

        retailGroupService.createRetailGroup(supplierId);
    }
}
