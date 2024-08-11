package com.shopping.pos.repository;

import com.shopping.pos.entity.RetailGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RetailGroupRepository extends JpaRepository<RetailGroup, Long> {

    Optional<RetailGroup> findRetailGroupById(Long id);
}
