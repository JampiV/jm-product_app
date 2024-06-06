package com.jlunic.jlunic_market.domain.ports.input.adminContent;

import com.jlunic.jlunic_market.domain.models.Product;
import java.util.Optional;

public interface UpdateProductUseCase
{
    Optional<Product> updateProduct(Long productId, Product product);
}
