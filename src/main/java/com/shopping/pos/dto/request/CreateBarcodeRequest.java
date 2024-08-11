package com.shopping.pos.dto.request;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class CreateBarcodeRequest {

    private Long barcodePrefix;
    private Long serialNumber;


}
