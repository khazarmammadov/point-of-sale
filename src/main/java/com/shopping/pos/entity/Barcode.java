package com.shopping.pos.entity;

import lombok.Data;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "Barcode")
public class Barcode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "barcode_prefix")
    private Long barcodePrefix;

    @Column(name = "serial_number")
    private Long serialNumber;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
