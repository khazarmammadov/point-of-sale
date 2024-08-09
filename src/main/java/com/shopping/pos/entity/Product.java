package com.shopping.pos.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "barcode_id", nullable = false)
    private Barcode barcode;

    @Column(name = "name")
    private String name;

    @Column(name = "modelNum")
    private String modelNum;

//    @Column(name = "photo")
//    private String photo;

    @Column(name = "brand")
    private String brand;

    @Column(name = "description")
    private String description;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
