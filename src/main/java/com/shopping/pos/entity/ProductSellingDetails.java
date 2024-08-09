package com.shopping.pos.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Entity
@Table(name = "Product_Selling_Details")
public class ProductSellingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "discount")
    private Boolean discount;

    @Column(name = "discount_rate")
    private Integer discountRate;

    @Column(name = "discount_price")
    private BigDecimal discountPrice;

    @Column(name = "active")
    private Integer active;
}
