package com.shopping.pos.repository;

import com.shopping.pos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findProductByBarcode_Id(Long serialNumber);
}
