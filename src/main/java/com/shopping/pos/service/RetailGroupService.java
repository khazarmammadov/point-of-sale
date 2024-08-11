package com.shopping.pos.service;

import com.shopping.pos.dto.request.CreateRetailGroupRequest;
import com.shopping.pos.entity.RetailGroup;

import java.util.Optional;

public interface RetailGroupService {

    void createRetailGroup(Long supplierId);
    RetailGroup findRetailGroupById(Long id);
}
