package com.jlunic.jlunic_market.application.usecases.adminContent;

import com.jlunic.jlunic_market.domain.models.Product;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.RetrieveProductUseCase;
import com.jlunic.jlunic_market.domain.ports.output.ProductRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RetrieveProductUseCaseImpl implements RetrieveProductUseCase
{
    private final ProductRepositoryPort productRepositoryPort;

    @Override
    public Optional<Product> getProductById(Long productId) { return productRepositoryPort.findById(productId); }

    @Override
    public List<Product> getAllProducts() { return productRepositoryPort.findAll(); }
}
