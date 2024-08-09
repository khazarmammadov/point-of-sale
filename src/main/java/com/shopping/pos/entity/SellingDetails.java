package com.shopping.pos.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "Selling_Details")
public class SellingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @Column(name = "supply_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date supplyDate;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "count")
    private Integer count;

    @Column(name = "total_price")
    private BigDecimal totalPrice;
}
