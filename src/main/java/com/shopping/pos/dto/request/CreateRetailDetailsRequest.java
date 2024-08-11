package com.shopping.pos.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateRetailDetailsRequest {

    private Long retailGroupId;
    private Long productSerialNumber;
    private BigDecimal price;
    private Integer count;

    public BigDecimal getTotalPrice() {
        return price.multiply(BigDecimal.valueOf(count));
    }
}
