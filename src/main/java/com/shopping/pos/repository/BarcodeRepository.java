package com.shopping.pos.repository;

import com.shopping.pos.entity.Barcode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BarcodeRepository extends JpaRepository<Barcode, Long> {
    Optional<Barcode> findBySerialNumber(Long serialNumber);
}
