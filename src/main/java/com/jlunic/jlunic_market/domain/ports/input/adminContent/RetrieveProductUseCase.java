package com.jlunic.jlunic_market.domain.ports.input.adminContent;

import com.jlunic.jlunic_market.domain.models.Product;

import java.util.List;
import java.util.Optional;

public interface RetrieveProductUseCase
{
    Optional<Product> getProductById(Long productId);
    List<Product> getAllProducts();
}
