package com.shopping.pos.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "count")
    private Integer count;

    @Column(name = "added_date")
    private LocalDateTime addedDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
}
