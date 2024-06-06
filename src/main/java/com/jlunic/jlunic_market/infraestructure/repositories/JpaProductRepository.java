package com.jlunic.jlunic_market.infraestructure.repositories;

import com.jlunic.jlunic_market.domain.models.Product;
import com.jlunic.jlunic_market.infraestructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
}
