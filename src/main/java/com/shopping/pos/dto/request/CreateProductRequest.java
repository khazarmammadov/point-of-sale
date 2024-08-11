package com.shopping.pos.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateProductRequest {

    private String name;
    private Long modelNum;
    private String brand;
    private String description;
    private String size;
    private String color;

}
