package com.shopping.pos.repository;

import com.shopping.pos.entity.Inventory;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
        @Query("SELECT i.count FROM Inventory i " +
                "INNER JOIN i.product p " +
                "INNER JOIN p.barcode b " +
                "WHERE b.serialNumber = :serialNumber")
        Integer getCount(@Param("serialNumber") Long serialNumber);

        @Modifying
        @Transactional
        @Query("UPDATE Inventory i SET i.count = :count " +
                "WHERE i.product.id = (SELECT p.id FROM Product p " +
                "INNER JOIN p.barcode b " +
                "WHERE b.serialNumber = :serialNumber)")
        void updateCount(@Param("serialNumber") Long serialNumber,
                         @Param("count") int count);

        Inventory findByProductBarcodeSerialNumber(Long serialNumber);


}
