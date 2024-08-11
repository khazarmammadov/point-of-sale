package com.shopping.pos.dto.request;

import lombok.Data;

@Data
public class AddProductToInventoryRequest {

    private Long serialNumber;
    private Integer count;

}
