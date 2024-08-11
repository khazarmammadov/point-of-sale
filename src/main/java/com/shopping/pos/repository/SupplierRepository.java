package com.shopping.pos.repository;

import com.shopping.pos.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Optional<Supplier> findSupplierById(Long id);
}
