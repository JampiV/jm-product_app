package com.jlunic.jlunic_market.application.services;

import com.jlunic.jlunic_market.domain.models.Product;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.CreateProductUseCase;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.DeleteProductUseCase;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.RetrieveProductUseCase;
import com.jlunic.jlunic_market.domain.ports.input.adminContent.UpdateProductUseCase;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ProductService implements CreateProductUseCase, DeleteProductUseCase, UpdateProductUseCase , RetrieveProductUseCase
{
    private final CreateProductUseCase createProductUseCase;
    private final RetrieveProductUseCase retrieveProductUseCase;
    private final UpdateProductUseCase updateProductUseCase;
    private final DeleteProductUseCase deleteProductUseCase;

    @Override
    public Product createProduct(Product product) { return createProductUseCase.createProduct(product); }

    @Override
    public boolean deleteProduct(Long productId) { return deleteProductUseCase.deleteProduct(productId); }

    @Override
    public Optional<Product> getProductById(Long productId) { return retrieveProductUseCase.getProductById(productId); }

    @Override
    public List<Product> getAllProducts() { return retrieveProductUseCase.getAllProducts(); }

    @Override
    public Optional<Product> updateProduct(Long productId, Product product) { return updateProductUseCase.updateProduct(productId, product); }
}
