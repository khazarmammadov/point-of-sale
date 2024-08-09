package com.shopping.pos.dto.request;

import com.shopping.pos.entity.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class AddProductToInventoryRequest {

    private Product product;

    private Integer count;

    private LocalDateTime addedDate;


}
