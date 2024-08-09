package com.shopping.pos.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Retail_Group")
public class RetailGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "supply_date")
    @Temporal(TemporalType.DATE)
    private Date supplyDate;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}
