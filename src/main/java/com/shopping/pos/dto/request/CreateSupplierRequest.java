package com.shopping.pos.dto.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateSupplierRequest {

    private String responsiblePersonName;

    private String supplierCompany;

    private String mail;

    private String phone;

    private String address;

}
