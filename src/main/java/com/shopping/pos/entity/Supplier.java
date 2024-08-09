package com.shopping.pos.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "responsible_person_name")
    private String responsiblePersonName;

    @Column(name = "supplier_company")
    private String supplierCompany;

    @Column(name = "mail")
    private String mail;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;
}
